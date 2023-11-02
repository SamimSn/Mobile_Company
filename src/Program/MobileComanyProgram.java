package Program;

import GUI.Login;

/** 
 * @author Samim
 */

public class MobileComanyProgram 
{
    public static void main(String[] args)
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, ex);
        }
        new Login().setVisible(true);
    }
}
