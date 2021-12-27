/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

/**
 * Dette program demonstrerer erklæringen og anvendelse af et basalt array.
 * Det er ikke muligt at slette fra et array, eller ændre størrelsen på arrayet.
 * Nedenstående demonsterer derfor kun erklæring, tilføjelse af data, og
 * ændring af data.
 */

package basicarray;


public class BasicArray {

    public static void main(String[] args) {
        //Erklæring af et array til tal:
        int[] talliste1;
        //Initialisering af arrayet, med plads til 5 tal:
        talliste1 = new int[5];
        //Fyld tal ind på pladserne. Arrayet starter fra 0:
        talliste1[0] = 23;
        talliste1[1] = -4;
        talliste1[2] = 1345;
        talliste1[3] = 2;
        talliste1[4] = 94;
        //Der kan ikke fyldes mere ind, end arrayet er initialiseret til.
        //Så talliste[5] vil ikke virke, da der kun er 5 pladser i alt,
        //startende ved 0.
        
        //Hvis vi allerede har tallene fra starten, kan vi også erklære arrayet
        //på en mere kompakt måde.
        //Bemærk at der ikke står noget tal i firkantparentesen 
        //ved initialisering.
        int[] talliste2;
        talliste2 = new int[]{23, -4, 1345, 2, 94};
        
        //Eller endnu mere kompakt på én linje. Bemærk at "new int[]" udelades.
        int[] talliste3 = {23, -4, 1345, 2, 94};
        
        
        //Arrays med andre datatyper erklæres på en tilsvarende måde:
        String[] ordliste1;
        ordliste1 = new String[5];
        
        String[] ordliste2 = {"fisk", "hest", "dild"};
        
        
        //For at tilgå en værdi, bruger man dens placering, og derefter fungerer
        //den som hvis den var en almindelig variabel:
        System.out.println(ordliste2[0]);
        ordliste2[1] = "gnu";
        int resultat = talliste3[0] + talliste1[3];
        
        
        //Hvis vi beder om en værdi i et array som er initialiseret, men
        //hvor der endnu ikke er fyldt data ind, bliver standard-værdien
        //returneret:
        //byte, short, int, long: 0
        //float, double: 0.0
        //boolean: false
        //char: ' '
        //String og andre objekter: null
        int[] t = new int[2];
        System.out.println(t[0]);
    }

}
