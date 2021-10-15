/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

package hejmormor;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;


public class GUI extends JFrame {
    private JButton knap;
    private JPanel panel;
    private Random random;
    
    public GUI() {
        createComponents();
    }
    
    public void createComponents() {
        random = new Random();
        knap = new JButton("Luk");
        panel = new JPanel();
        
        // Slå muligheden for at trykke på knappen med mellemrumstasten fra
        knap.setFocusable(false); 
        
        panel.setLayout(null);
        knap.setBounds(100, 100, 100, 30);
        
        panel.add(knap);
        add(panel);
        
        knap.addMouseListener(new MouseListener(){
            @Override
            public void mouseEntered(MouseEvent e) {
                // Find knappens nye position
                int nyX = random.nextInt(getSize().width - 100);
                int nyY = random.nextInt(getSize().height - 100);
                // Flyt knappen
                knap.setBounds(nyX, nyY, 100, 30);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }

        });
        
    }

}
