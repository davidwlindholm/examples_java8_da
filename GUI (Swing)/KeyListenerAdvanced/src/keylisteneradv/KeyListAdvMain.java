/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

/**
 * Dette program demonstrerer muligheden for at lave en key event listener
 * der fungerer i hele vinduet, og som samtidigt kan reagerer på specifikke
 * valgte komponenter.
 */

package keylisteneradv;

import javax.swing.JFrame;


public class KeyListAdvMain {

    public static void main(String[] args) {
        JFrame gui = new GUI();
        gui.setTitle("Taster: q, t");
        gui.setSize(500, 500);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }

}
