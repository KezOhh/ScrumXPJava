import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Thu Apr 08 15:49:49 CEST 2021
 */



/**
 * @author unknown
 */
public class loginFonster extends JFrame {
    public loginFonster() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        button1 = new JButton();
        label2 = new JLabel();

        //======== this ========
        setMinimumSize(new Dimension(17, 39));
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[79,fill]" +
            "[56,fill]" +
            "[202,fill]" +
            "[75,fill]" +
            "[69,fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[53]"));

        //---- label1 ----
        label1.setText("V\u00e4lkommen!");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() & ~Font.BOLD, 18f));
        contentPane.add(label1, "cell 2 0,alignx center,growx 0");

        //---- textField1 ----
        textField1.setText("Username");
        contentPane.add(textField1, "cell 2 2");
        contentPane.add(passwordField1, "cell 2 3");

        //---- button1 ----
        button1.setText("Log In!");
        contentPane.add(button1, "cell 2 4,alignx center,growx 0");

        //---- label2 ----
        label2.setText("Fel anv\u00e4ndarnamn");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label2, "cell 2 5 1 2");
        setSize(440, 285);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
