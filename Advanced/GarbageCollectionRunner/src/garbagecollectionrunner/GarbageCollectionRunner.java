/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

/**
 * Dette program demonstrerer hvordan man kan anmode Javas garbage collector om
 * at køre. Det er normalt ikke nødvendigt, da det sker automatisk. Man vil 
 * derfor kun gøre det, hvis man forventer at man skal til at køre noget meget
 * ressourcekrævende lige om lidt.
 * 
 * Dette er kun en anmodning, og bliver derfor kun udført hvis JVM'en ikke
 * er optaget af andre ting.
 * 
 * JDK-programmerne jmap og jcmd kan anvendes til samme opgave, 
 * fra kommandolinjen. Yderlige info om disse kommandoer kan findes her:
 * https://www.theserverside.com/video/5-ways-to-force-Java-garbage-collection
 */

package garbagecollectionrunner;


public class GarbageCollectionRunner {

    public static void main(String[] args) {
        System.gc(); //Eller Runtime.getRuntime().gc();
    }

}
