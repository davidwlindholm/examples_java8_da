/** 
 * © David Lindholm - me@davidlindholm.info
 * License: CC-BY-SA 4.0
 * Legal: https://creativecommons.org/licenses/by-sa/4.0/legalcode
 * Human readable: https://creativecommons.org/licenses/by-sa/4.0/
 */

package radixsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Example {

    public static void main(String[] args) {     
        ArrayList<Integer> listToSort = new ArrayList<>(Arrays.asList(34, 776, 23, 1, 455, 233, 6));
        
        //Test code
        for (int num : listToSort) {
            System.out.print(num + " ");
        }
        
        System.out.println("");
        RadixSort rs = new RadixSort();
        ArrayList<Integer> sortedList = rs.sort(listToSort);
        
        
        for (int num : sortedList) {
            System.out.print(num + " ");
        }
    }
    
}
