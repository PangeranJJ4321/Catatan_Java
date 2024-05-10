package Java_Swing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Kalkulator {
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println("error :" + e.getMessage());
        }

        // frame
        JFrame jf = new JFrame("Kalkulator");
        jf.setSize(400, 300);



        // input
        JTextField tfA = new JTextField();
        tfA.setBounds(5, 5, 50, 30);
        jf.add(tfA);  
        
        JTextField tfB = new JTextField();
        tfB.setBounds(5, 32, 50, 30);
        jf.add(tfB);

        JLabel labelHasil = new JLabel("Hasil = ");
        labelHasil.setBounds(80, 80, 50,30);
        jf.add(labelHasil);
        
        JLabel label = new JLabel();
        label.setBounds(120, 80, 50,30);
        

        // button
        JButton buttonTambah  = new JButton("+");
        buttonTambah.setBounds(115, 5, 50,30);

        buttonTambah.addActionListener(new ActionListener() {
            // aksi
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtA = tfA.getText();
                String txtB = tfB.getText();
                double A = Double.parseDouble(txtA);
                double B = Double.parseDouble(txtB);
                double C = A + B;
                label.setText(String.valueOf(C));
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        });
        jf.add(label);
        jf.add(buttonTambah);


        JButton buttonKurang  = new JButton("-");
        buttonKurang.setBounds(170, 5, 50,30);
        buttonTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtA = tfA.getText();
                String txtB = tfB.getText();
                double A = Double.parseDouble(txtA);
                double B = Double.parseDouble(txtB);
                double C = A - B;
                label.setText(String.valueOf(C));
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        });
        jf.add(label);
        jf.add(buttonKurang);

        JButton buttonKali  = new JButton("*");
        buttonKali.setBounds(115, 32, 50,30);
        buttonTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtA = tfA.getText();
                String txtB = tfB.getText();
                double A = Double.parseDouble(txtA);
                double B = Double.parseDouble(txtB);
                double C = A * B;
                label.setText(String.valueOf(C));
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        });
        jf.add(label);
        jf.add(buttonKali);

        JButton buttonBagi  = new JButton("/");
        buttonBagi.setBounds(170, 32, 50,30);
        buttonTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txtA = tfA.getText();
                String txtB = tfB.getText();
                double A = Double.parseDouble(txtA);
                double B = Double.parseDouble(txtB);
                double C = A / B;
                label.setText(String.valueOf(C));
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        });
        
        jf.add(label);
        jf.add(buttonBagi);
        
        // run
        jf.setLayout(null);
        jf.setVisible(true);




    }
}
