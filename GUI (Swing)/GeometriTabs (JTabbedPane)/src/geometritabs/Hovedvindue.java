/** 
 * © David Lindholm - me@davidlindholm.info
 * License: GNU Affero General Public License v3.0
 * Legal: https://www.gnu.org/licenses/agpl-3.0.en.html
 */

package geometritabs;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Hovedvindue extends JFrame {
    JTabbedPane tabbedPane;
    JPanel panelFirk, panelTrek, panelCirk;
    JTextField input1Firk, input2Firk, input1Trek, input2Trek, inputCirk;
    JButton butFirk, butTrek, butCirk;
    JLabel labelResFirk, labelResTrek, labelResCirk;
    
    public Hovedvindue(){
        opretKomponenter();
    }
    
    private void opretKomponenter() {
        tabbedPane = new JTabbedPane();
        add(tabbedPane);
        
        //Firkanter
        panelFirk = new JPanel();
        input1Firk = new JTextField(10);
        input1Firk.setText("Bredde");
        input2Firk = new JTextField(10);
        input2Firk.setText("Højde");
        butFirk = new JButton("Beregn");
        labelResFirk = new JLabel("Resultat: ");
        
        panelFirk.add(input1Firk);
        panelFirk.add(input2Firk);
        panelFirk.add(butFirk);
        panelFirk.add(labelResFirk);
        
        tabbedPane.addTab("Firkant", panelFirk);
        
        //Trekanter
        panelTrek = new JPanel();
        input1Trek = new JTextField(10);
        input1Trek.setText("Grundlinje");
        input2Trek = new JTextField(10);
        input2Trek.setText("Højde");
        butTrek = new JButton("Beregn");
        labelResTrek = new JLabel("Resultat: ");
        
        panelTrek.add(input1Trek);
        panelTrek.add(input2Trek);
        panelTrek.add(butTrek);
        panelTrek.add(labelResTrek);
        
        tabbedPane.addTab("Trekant", panelTrek);
        
        //Cirkler
        panelCirk = new JPanel();
        inputCirk = new JTextField(10);
        inputCirk.setText("Radius");
        butCirk = new JButton("Beregn");
        labelResCirk = new JLabel("Resultat: ");
        
        panelCirk.add(inputCirk);
        panelCirk.add(butCirk);
        panelCirk.add(labelResCirk);
        
        tabbedPane.addTab("Cirkel", panelCirk);
    }
    
}
