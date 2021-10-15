/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

/**
 * Dette program demonstrerer brugen af KeyListener til at lytte på
 * tryk på tastaturet. Det er et basalt eksempel, da det kræver at baggrunden
 * er valgt for at trykket registreres.
 */

package keylistenerbasic;

import javax.swing.JFrame;


public class KeyListenerEksempel {

    public static void main(String[] args) {
        JFrame gui = new GUI();
        gui.setTitle("Taster: q");
        gui.setSize(500, 500);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }

}
