/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

/**
 * Dette program demonstrerer implementation af Look and Feel i Swing,
 * ved hjælp af en vælger.
 */

package lookandfeelselector;

import javax.swing.JFrame;

public class LookAndFeelProjekt {

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setTitle("Look and feel vælger");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }
    
}
