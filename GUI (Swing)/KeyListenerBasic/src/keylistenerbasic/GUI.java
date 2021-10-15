/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

package keylistenerbasic;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class GUI extends JFrame {
    private JPanel panel;
    private JButton knap;
    
    public GUI() {
        createComponents();
    }
    
    public void createComponents() {
        panel = new JPanel();
        knap = new JButton("Dild");
        
        panel.setFocusable(true);
        panel.add(knap);
        add(panel);
        
        panel.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                KeyStroke ks = KeyStroke.getKeyStrokeForEvent(e);
                String tast = ks.toString();
                tast = tast.replaceAll("typed ", "");
                if (tast.equals("q")) {
                    System.exit(0);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        
        
        });
    }
}
