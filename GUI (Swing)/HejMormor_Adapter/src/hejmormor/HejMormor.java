/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

/**
 * Dette program demonstrerer brugen af MouseAdapter til at registrere
 * ting som musen gør. Det er funktionelt identisk med MouseListener eksemplet
 */

package hejmormor;

import javax.swing.JFrame;


public class HejMormor {

    public static void main(String[] args) {
        JFrame gui = new GUI();
        gui.setTitle("Hej Mormor!");
        gui.setSize(500, 500);
        gui.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Slå luk knappen fra
        gui.setVisible(true);
    }

}
