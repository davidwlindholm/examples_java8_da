/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

package radixsort;

import java.util.ArrayList;
import java.util.Collections;


public class RadixSort {
    
    /**
     * Metoden createBuckets laver et array af spande til cifrene i det valgte
     * talsystem. Benyttes titalssystemet oprettes f.eks. 10 spande, til cifrene 0-9.
     * 
     * @param radix Talsystemet der benyttes (f.eks. 2, 10, 16, etc)
     * @return Et array med én ArrayList for hver 
     */
    private static ArrayList<Integer>[] createBuckets(int radix) {
        //Lav spande til tal
        ArrayList<Integer>[] buckets = new ArrayList[radix];
        
        //Tilføj en tom arraylist til hver spand
        for (int i = 0; i < radix; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        return buckets;
    } 
    
    /**
     * Metoden clearBuckets nulstiller alle spande ved hjælp af 
     * ArrayList-metoden clear().
     * Dette sker så spandene kan genbruges, for at spare på hukommelsen.
     * 
     * @param buckets Listen af spande der skal nulstilles.
     */
    private static void clearBuckets(ArrayList<Integer>[] buckets) {
        for (ArrayList bu : buckets) {
            bu.clear();
        }
    }
    
    /**
     * Metoden getMaxLength returnerer længden af det tal med flest 
     * cifre i listen.
     * 
     * @param list Listen af tal der skal sorteres
     * @return Antal cifre i det længste tal
     */
    private static int getMaxLength(ArrayList<Integer> list) {
        int maks = Collections.max(list); //Find største tal
        String maxStr = maks + ""; //Lav om til tekst
        return maxStr.length(); //Længden af tekst-strengen
    }
    
    /**
     * Metoden placeToIndex laver en talplacering om til et indeks i tallet.
     * Den gør det muligt at bede om f.eks. tiernes placering, uden at vide hvor
     * langt arrayet er. I tiernes tilfælde, vil indekset for den næst-sidste
     * plads blive returneret.
     * 
     * @param place En placering i et tal, så som 1, 10, 100.
     * @param listSize Antallet af elementer i listen (cifre i tallet)
     * @return Indekset i listen, baseret på placeringen, eller -1 hvis 
     * placeringen er større end tallets længde.
     */
    private static int placeToIndex(int place, int listSize) {
        String placeStr = place + ""; //Lav placering om til tekst
        
        //Tæl antallet af nuller i placeringen
        int zeros = 0;
        for (char c : placeStr.toCharArray()) { 
            if (c == '0') {
                zeros++;
            }
        }
        
        //Find index baseret på listens størrelse. Index er altid mindst én
        //mindre end antallet af elementer.
        int index = listSize - (zeros + 1);
        
        return index < 0 ? -1 : index; //Hvis index er under 0, returner -1.
    }
    
    /**
     * Metoden getBucket finder nummeret på den spand et tal skal placeres i.
     * 
     * @param number Tallet der skal vurderes
     * @param place Cifferplaceringen der skal vurderes (1, 10, 100, osv)
     * @return Den spand tallet skal placeres i.
     */
    private static int getBucket(int number, int place) {
        String tal = number + ""; //Konverter til tekst
        
        int index = placeToIndex(place, tal.length()); //Find indekset af det tal vi ser på
        
        //Hvis placeringen er større end tallet, placeres tallet i spand 0.
        //F.eks. hvis der bedes om placeringen for tierner, men tallet er mindre end 10.
        if (index == -1) {
            return 0;
        }
     
        char posChar = tal.charAt(index); //Find tallet på det angivne index
        
        String posString = posChar + ""; //Konverter til tekst
        int valueForPos = Integer.parseInt(posString); //Konverter til int
        
        return valueForPos;
    }
    
    /**
     * Metoden sort sorterer en ArrayList af integers.
     * 
     * @param listToSort Listen der skal sorteres.
     * @return Den sorterede liste.
     */
    public static ArrayList<Integer> sort(ArrayList<Integer> listToSort) {
        ArrayList<Integer>[] buckets = createBuckets(10); //Beholder til vores spande
        int maxLength = getMaxLength(listToSort); //Største antal cifre blandt tallene i listen
        
        //Loop over hver tals position (f.eks. 3 gange hvis det længste tal har 3 cifre).
        for (int i = 0; i < maxLength; i++) {
            int place = (int) Math.pow(10, i); //Find talposition 1, 10, 100, etc

            //Tøm spandene fra tidligere runder, hvis der har været nogle
            if (i > 0) {
                clearBuckets(buckets);
            }
            
            //Løb gennem listen der skal sorteres
            for (int tal : listToSort) {
                int index = getBucket(tal, place); //Find spand til tallet
                buckets[index].add(tal); //Tilføj tallet til spanden
            }
            
            //Put tallene tilbage i listen, i deres nye rækkefølge
            listToSort.clear(); //Tøm den oprindelige liste så vi kan genbruge den
            
            for (ArrayList<Integer> bucket : buckets) { //Løb gennem alle spande
                for (int tal : bucket) { //Løb gennem alle tal i hver spand
                    listToSort.add(tal); //Tilføj tallet til den oprindelige liste
                    //Da det er to arraylister, kunne man også bruge addAll(bucket)
                    //og skippe det inderste for-loop.
                }
            }
        }
        
        return listToSort;
    }
    
}
