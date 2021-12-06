/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

package radixsort;

import java.util.ArrayList;
import java.util.Collections;


public class RadixSort {
    private ArrayList<Integer>[] buckets;
    
    public RadixSort() {
        //Create 10 buckets for numbers
        buckets = new ArrayList[10];
        
        //Add empty arraylist to each bucket
        for (int i = 0; i < 10; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
    }
    
    public void clearBuckets() {
        for (ArrayList al : buckets) {
            al.clear();
        }
    }
    
    public int getMaxLength(ArrayList<Integer> list) {
        int max = Collections.max(list);
        String maxStr = max + "";
        return maxStr.length();
    }
    
    private int placeToIndex(int place, int listSize) {
        int zeros = 0;
        
        String placeStr = place + "";
        
        for (char c : placeStr.toCharArray()) {
            if (c == '0') {
                zeros++;
            }
        }
        
        int index = listSize - (zeros + 1);
        
        return index < 0 ? -1 : index;
    }
    
    public int getBucket(int number, int place) {
        String tal = number + "";
        
        int index = placeToIndex(place, tal.length());
        
        if (index == -1) {
            return 0;
        }
     
        char posChar = tal.charAt(index);
        
        String posString = posChar + "";
        int valueForPos = Integer.parseInt(posString);
        
        return valueForPos;
    }
    
    public ArrayList<Integer> sort(ArrayList<Integer> listToSort) {
        int maxLength = getMaxLength(listToSort);
        
        //Loop over each digit position
        for (int i = 0; i < maxLength; i++) {
            int place = (int) Math.pow(10, i); //Find digit position 1, 10, 100, etc

            //Clear values from previous round, if any
            if (i > 0) {
                clearBuckets(); 
            }
            
            //Loop through number list
            for (int tal : listToSort) {
                int index = getBucket(tal, place); //Find bucket for number
                buckets[index].add(tal); //Add number to bucket
            }
            
            //Reorder number list
            listToSort.clear(); //Get rid of old order
            
            for (ArrayList<Integer> bucket : buckets) { //Loop through all buckets
                for (int tal : bucket) { //Loop through numbers in the bucket
                    listToSort.add(tal); //Could also use addAll(bucket) and skip the inner for-loop
                }
            }
        }
        
        return listToSort;
    }
    
}
