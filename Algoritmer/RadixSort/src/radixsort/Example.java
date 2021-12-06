/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
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
