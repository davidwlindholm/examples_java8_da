/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

package passby;


public class Person {
    public int alder;
    
    public Person(int alder) {
        this.alder = alder;
    }
    
    
    public Person clone() {
        return new Person(this.alder);
    }
}
