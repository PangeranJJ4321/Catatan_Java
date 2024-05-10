package Java_Swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class latihan {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println("error :" + e.getMessage());
        }

        JFrame jf = new JFrame("Demo");
        jf.setSize(300, 300);

        JLabel labelHallo = new JLabel();
        labelHallo.setBounds(20,150, 100,30);
        jf.add(labelHallo);

        JTextField input = new JTextField();
        input.setBounds(90,30,100,10);
        jf.add(input);

        JButton buttonClick = new JButton("Klic");
        buttonClick.setBounds(10,10,100,30);
        buttonClick.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                labelHallo.setText("Hello");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(buttonClick);

        JButton buttonMuncuLabel = new JButton("Muncul");
        buttonMuncuLabel.setBounds(10,60,100,30);
        buttonMuncuLabel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                labelHallo.setText("");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        jf.add(buttonMuncuLabel);
        



        jf.setLayout(null);
        jf.setVisible(true);
    }

    private static ActionListener ActionListener() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ActionListener'");
    }
}
