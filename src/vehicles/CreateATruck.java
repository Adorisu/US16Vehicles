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
        
        String[] bedLength = new String[3];
        bedLength[0] = SHORT__BED;
        bedLength[1] = MEDIUM__BED;
        bedLength[2] = LONG__BED;
        
        final Object selectedBedLength = JOptionPane.showInputDialog(null, "Choose a Bed Length", "Bed Selection", JOptionPane.QUESTION_MESSAGE, null, bedLength, MEDIUM__BED);
        
        if (selectedCab.equals(SUPERCREW)) {
            if (selectedBedLength.equals(LONG__BED)) {
                JOptionPane.showMessageDialog(null, "Sorry, but you cannot choose both Double Cab and Long Bed.");
            } else {
                JOptionPane.showMessageDialog(null, "Your selections are valid.  Cab: " + selectedCab + " Bed: " + selectedBedLength);
            }
        }
        
    }
    
    
    private static final String LONG__BED = "Long Bed";
    private static final String MEDIUM__BED = "Medium Bed";
    private static final String SHORT__BED = "Short Bed";
    
    private static final String REGULAR = "Regular";
    private static final String SUPERCAB = "Supercab";
    private static final String SUPERCREW = "Double Cab";
    
    
}
