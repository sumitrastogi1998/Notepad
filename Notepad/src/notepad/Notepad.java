
package notepad;

import javax.swing.JFrame;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author sumit
 */
public class Notepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        textEditorgui obj = new textEditorgui();
        obj.setBounds(0,0,700,700);
        obj.setTitle("Notepad");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }
    
}
