/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

/**
 * Dette program demonstrerer erklæring af de primitive datatyper og String.
 * I Java erklæres en variabel med datatypen først, efterfulgt af navnet på 
 * variablen. Navnet skal leve op til disse krav:
 * - Ingen mellemrum
 * - Ikke kun tal
 * - Første tegn må ikke være et tal
 * - Ingen specialtegn
 * - Ingen reserverede ord (f.eks. "public", "void", osv)
 * 
 * Man kan erklære variablen og tildele den en værdi med det samme, eller
 * man kan splitte erklæring og tildeling op på to linjer. For eksempel:
 * Erklæring: int x;
 * Tildeling: x = 3;
 * Erklæring og tildeling: int x = 3;
 * Begge metoder demonstreres nedenfor.
 * 
 * De vigtigste datatyper er: int, double, boolean, char, og String
 */

package basicvars;


public class BasicVars {

    public static void main(String[] args) {
        /**
         * Byte - Heltal - 8 bit
         * Minimum: −128
         * Maksimum: 127
         */
        byte tal1;
        tal1 = 7;
        
        byte tal2 = 10;
        
        /**
         * Short - Heltal - 16 bit
         * Minimum: −32.768
         * Maksimum: 32.767
         */
        short tal3;
        tal3 = -3;
        
        short tal4 = 14;
        
        /**
         * Integer - Heltal - 32 bit
         * Minimum: −2.147.483.648
         * Maksimum: 2.147.483.647
         */
        int tal5;
        tal5 = 5;
        
        int tal6 = 7;
        
        /**
         * Long - Heltal - 64 bit
         * Minimum: −9,223372037 * 10^18
         * Maksimum: 9,223372037 * 10^18
         */
        long tal7;
        tal7 = 23;
        
        long tal8 = 12;
        
        /**
         * Float - Kommatal - 32 bit
         * Minimum: −3,40282346638528860 * 10^38
         * Maksimum: 3,40282346638528860 * 10^38
         * 
         * Ved brug af float skal kommaet skrives som punktum, og det er
         * nødvendigt at tilføje et f for at indikere det ikke er double (som
         * ellers er standard)
         */
        float tal9;
        tal9 = 45.5f;
        
        float tal10 = -4.234f;
        
        /**
         * Double - Kommatal - 64 bit
         * Minimum: −1,7976931348623157 * 10^308
         * Maksimum: 1,7976931348623157 * 10^308
         * 
         * Ved brug af double skal kommaet skrives som punktum
         */
        
        double tal11;
        tal11 = 2.3;
        
        double tal12 = 234.0;
        
        /**
         * Boolean - Sandt/Falskt (boolean) - 1 bit
         * 
         * De eneste tilladte værdi er true og false;
         */
        boolean erKorrekt;
        erKorrekt = true;
        
        boolean erGjort = false;
        
        /**
         * Char - Enkelt tegn - 16 bit
         * 
         * Char erklæres altid med enkelt citationstegn: '
         */
        char bogstav1;
        bogstav1 = 'f';
        
        char bogstav2 = 'e';
        
        /**
         * String - Tekststreng
         * 
         * En string er ikke en primitiv data type, men derimod en speciel type
         * af objekt. Det er også acceptabelt at kalde den "ikke-primitiv" eller
         * "sammensat".
         * 
         * En String er en liste af chars, der udgør en samlet tekststreng.
         * Den maksimale længde af listen er det samme som størrelsen på en 
         * integer: 2.147.483.647 tegn.
         * Den mindste størrelse er 0 tegn.
         * 
         * Eftersom hvert tegn er én char, er den maksimale størrelse ~32 GiB.
         * 
         * String erklæres altid med dobbelte citationstegn: "
         */
        String tekst1;
        tekst1 = "hej";
        
        String tekst2 = "farvel";
    }

}
