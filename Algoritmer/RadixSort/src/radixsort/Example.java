/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

package radixsort;

import java.util.ArrayList;
import java.util.Arrays;


public class Example {

    public static void main(String[] args) {     
        //Lav liste af heltal
        ArrayList<Integer> listToSort = new ArrayList<>(Arrays.asList(34, 776, 23, 1, 455, 233, 6));
        
        //Test kode:
        for (int num : listToSort) { //Print tal før sortering
            System.out.print(num + " ");
        }
        
        System.out.println(""); //Linjeskift
        ArrayList<Integer> sortedList = RadixSort.sort(listToSort); //Sorter liste
        
        for (int num : sortedList) { //Print tal efter sortering
            System.out.print(num + " ");
        }
        System.out.println(""); //Linjeskift
    }
    
}
