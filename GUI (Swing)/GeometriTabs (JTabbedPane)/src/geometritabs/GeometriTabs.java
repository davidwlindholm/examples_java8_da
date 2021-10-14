/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

/**
 * Dette program demonstrerer brugen af JTabbedPane til at lave
 * et vindue med tabs til at udskifte indholdet.
 */

package geometritabs;

import javax.swing.JFrame;

public class GeometriTabs {

    public static void main(String[] args) {
        JFrame vindue = new Hovedvindue();
        vindue.setSize(300, 150);
        vindue.setTitle("Arealberegner");
        vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vindue.setVisible(true);
    }

}
