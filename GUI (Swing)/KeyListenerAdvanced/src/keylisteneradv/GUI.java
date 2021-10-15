/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

package keylisteneradv;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class GUI extends JFrame {
    private JButton knap;
    private JPanel panel;
    
    public GUI() {
        createComponents();
    }
    
    public void createComponents() {
        knap = new JButton("Luk");
        panel = new JPanel();
        
        panel.setFocusable(true);
        knap.setToolTipText("Luk");

        panel.add(knap);
        add(panel);

        // Erstat standard focus managers dispatcher med vores egen klasse
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new TastaturManager());
    }
    
    private class TastaturManager implements KeyEventDispatcher {
        @Override
        public boolean dispatchKeyEvent(KeyEvent e) {
            switch (e.getID()) {
                case KeyEvent.KEY_TYPED:
                    KeyStroke ks = KeyStroke.getKeyStrokeForEvent(e);
                    String tast = ks.toString();
                    tast = tast.replaceAll("typed ", "");
                    
                    if (tast.equals("q")) {
                        // Denne kode køres uanset hvad der har fokus i
                        // vinduet når der trykkes på knappen
                        System.exit(0);
                    }
                    else if (tast.equals("t") && e.getComponent() == knap) {
                        // Denne kode bliver kun kørt hvis knappen har fokus
                        // når der trykkes på t
                        knap.setToolTipText("Close");
                    }
                    break;
                case KeyEvent.KEY_RELEASED:
                    break;
                case KeyEvent.KEY_PRESSED:
                    break;
            }
            
            return false;
        }
    
    }

}
