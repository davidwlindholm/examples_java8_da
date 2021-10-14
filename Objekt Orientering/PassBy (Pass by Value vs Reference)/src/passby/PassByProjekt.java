/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

/**
 * Dette program demonstrerer forskellen på Pass by Value (som bruges af
 * primitive datatyper), og Pass by Reference (som bruges af objekter).
 */

package passby;


public class PassByProjekt {

    public static void main(String[] args) {
        int primitivVar = 20;
        Person objektVar = new Person(20);
        
        System.out.println("Indhold af de oprindelige variabler før overførsel:");
        System.out.println("Primitiv: " + primitivVar);
        System.out.println("Objekt: " + objektVar.alder);
        
        //Kopier indhold til nye variabler og ændr på dem:
        int fisk = primitivVar; //"Pass by value"
        fisk = 50;
        
        Person dild = objektVar; //"Pass by Reference"
        dild.alder = 50;
        
        System.out.println("Indhold af de oprindelige variabler efter overførsel:");
        System.out.println("Primitiv: " + primitivVar);
        System.out.println("Objekt: " + objektVar.alder);
        
    }
    


}
