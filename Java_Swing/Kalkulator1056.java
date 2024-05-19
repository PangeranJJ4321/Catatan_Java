import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator1056 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Calculator");
        jf.setSize(300, 400);

        JTextField LBLINPUT = new JTextField();
        LBLINPUT.setBounds(10, 10, 170, 40);
        LBLINPUT.setEditable(false);
        LBLINPUT.setHorizontalAlignment(JTextField.RIGHT);
        jf.add(LBLINPUT);
        
        JTextField LBLHasil = new JTextField();
        LBLHasil.setBounds(10, 50, 170, 20);
        LBLHasil.setHorizontalAlignment(JTextField.RIGHT);
        LBLHasil.setEditable(false);
        jf.add(LBLHasil);

        JButton BTN1 = new JButton("1");
        BTN1.setBounds(10, 80, 50, 50);
        jf.add(BTN1);

        JButton BTN2 = new JButton("2");
        BTN2.setBounds(70, 80, 50, 50);
        jf.add(BTN2);

        JButton BTN3 = new JButton("3");
        BTN3.setBounds(130, 80, 50, 50);
        jf.add(BTN3);

        JButton BTN4 = new JButton("4");
        BTN4.setBounds(10, 140, 50, 50);
        jf.add(BTN4);

        JButton BTN5 = new JButton("5");
        BTN5.setBounds(70, 140, 50, 50);
        jf.add(BTN5);

        JButton BTN6 = new JButton("6");
        BTN6.setBounds(130, 140, 50, 50);
        jf.add(BTN6);

        JButton BTN7 = new JButton("7");
        BTN7.setBounds(10, 200, 50, 50);
        jf.add(BTN7);

        JButton BTN8 = new JButton("8");
        BTN8.setBounds(70, 200, 50, 50);
        jf.add(BTN8);

        JButton BTN9 = new JButton("9");
        BTN9.setBounds(130, 200, 50, 50);
        jf.add(BTN9);

        JButton BTNC = new JButton("C");
        BTNC.setBounds(10, 260, 50, 50);
        jf.add(BTNC);

        JButton BTN0 = new JButton("0");
        BTN0.setBounds(70, 260, 50, 50);
        jf.add(BTN0);

        JButton BTNDOT = new JButton(".");
        BTNDOT.setBounds(130, 260, 50, 50);
        jf.add(BTNDOT);

        JButton BTNEQUAL = new JButton("=");
        BTNEQUAL.setBounds(200, 10, 50, 50);
        jf.add(BTNEQUAL);

        JButton BTNADD = new JButton("+");
        BTNADD.setBounds(200, 80, 50, 50);
        jf.add(BTNADD);

        JButton BTNMIN = new JButton("-");
        BTNMIN.setBounds(200, 140, 50, 50);
        jf.add(BTNMIN);

        JButton BTNTIMES = new JButton("X");
        BTNTIMES.setBounds(200, 200, 50, 50);
        jf.add(BTNTIMES);

        JButton BTNDIV = new JButton(":");
        BTNDIV.setBounds(200, 260, 50, 50);
        jf.add(BTNDIV);

        jf.setLayout(null);
        jf.setVisible(true);

        StringBuilder input = new StringBuilder();

        ActionListener numberListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                input.append(source.getText());
                LBLINPUT.setText(input.toString());
            }
        };


        JButton[] buttons = {BTN0, BTN1, BTN2, BTN3, BTN4, BTN5, BTN6, BTN7, BTN8, BTN9, BTNDOT};

        for (JButton button : buttons) {
        button.addActionListener(numberListener);
        }

        ActionListener operatorListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                input.append(" ").append(source.getText()).append(" ");
                LBLINPUT.setText(input.toString());
            }
        };

        BTNADD.addActionListener(operatorListener);
        BTNMIN.addActionListener(operatorListener);
        BTNTIMES.addActionListener(operatorListener);
        BTNDIV.addActionListener(operatorListener);

        BTNC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setLength(0);
                LBLINPUT.setText("");
                LBLHasil.setText("");
            }
        });

        BTNEQUAL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String result = evaluate(input.toString());
                    LBLHasil.setText(result);
                } catch (Exception ex) {
                    LBLHasil.setText("Error");
                }
            }
        });
    }

    
    public static String evaluate(String expression) {
        String[] tokens = expression.split(" ");
        double result = 0;
        String operator = "";
        

        
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("X") || token.equals(":")) {
                double left = Double.parseDouble(tokens[i - 1]);
                double right = Double.parseDouble(tokens[i + 1]);
                double tempResult = 0;

                if (token.equals("X")) {
                    tempResult = left * right;
                } else if (token.equals(":")) {
                    tempResult = left / right;
                }

                
                tokens[i - 1] = String.valueOf(tempResult);

                
                for (int j = i; j < tokens.length - 2; j++) {
                    tokens[j] = tokens[j + 2];
                }

                tokens = java.util.Arrays.copyOf(tokens, tokens.length - 2);

                
                i--;
            }
        }

        
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-")) {
                operator = token;
            } else {
                double current = Double.parseDouble(token);
                switch (operator) {
                    case "":
                        result = current;
                        break;
                    case "+":
                        result += current;
                        break;
                    case "-":
                        result -= current;
                        break;
                }
            }
        }

        return String.valueOf(result);
    }
}