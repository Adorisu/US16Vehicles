/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import javax.swing.JOptionPane;

/**
 *
 * @author jonesb
 */
public class CreateATruck {
    public static void main(String[] args) {
        promptUser();
    }

    private static void promptUser() {
        String[] cab = new String[3];
        cab[0] = REGULAR;
        cab[1] = SUPERCAB;
        cab[2] = SUPERCREW;
        
        Object selectedCab = JOptionPane.showInputDialog(null, "Choose a Cab Type", "Cab Selection", JOptionPane.QUESTION_MESSAGE, null, cab, SUPERCAB);
        
        JOptionPane.showMessageDialog(null, "Selected Cab " + selectedCab);
        
    }
    
    private static final String REGULAR = "Regular";
    private static final String SUPERCAB = "Supercab";
    private static final String SUPERCREW = "Supercrew";
}
