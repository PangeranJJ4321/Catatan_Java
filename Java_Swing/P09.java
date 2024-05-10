package Java_Swing;

import javax.swing.JButton;
import javax.swing.JFrame ;
import javax.swing.UIManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class P09 {
    public static void main(String[] arhs){

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println("error :" + e.getMessage());
        }

        JFrame jf = new JFrame("My App");
        jf.setSize(300, 300);
        jf.setVisible(true);

        
        JButton button = new JButton("Exit");
        button.setBounds(50,50,50,50);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

        });
        jf.add(button);





    }
}