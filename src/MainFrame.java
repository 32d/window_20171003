import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.security.Key;

public class MainFrame extends JFrame {
    private Container cp;
    private Button btnEx = new Button("Ex");
    private Button btnTest = new Button("Test");
    private Button btnClear = new Button("Clear");
    private Button btnExit = new Button("Exit");
    private Label lab1 = new Label("Key");
    private JTextArea JtaL = new JTextArea();
    private JTextArea JtaR = new JTextArea();
    private JTextField Jtf = new JTextField(0);
    private JScrollPane JspL = new JScrollPane(JtaL);
    private JScrollPane JspR = new JScrollPane(JtaR);
    private JPanel jpl = new JPanel();

    private int key = 0;
    public MainFrame(){
        init();
}
    private void init(){
        this.setBounds(100,100,800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        jpl.setLayout(new GridLayout(6,1,3,3));
        JtaL.setPreferredSize(new Dimension(300,600));
        JtaR.setPreferredSize((new Dimension(300,600)));
        JtaR.setLineWrap(true);
        JtaL.setLineWrap(true);
        cp.add(jpl,BorderLayout.CENTER);
        cp.add(JspL,BorderLayout.WEST);
        cp.add(JspR,BorderLayout.EAST);
        jpl.add(btnEx);
        jpl.add(btnTest);
        jpl.add(lab1);
        jpl.add(Jtf);
        jpl.add(btnClear);
        jpl.add(btnExit);



        btnEx.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JtaL.setText("How much is that " +
                    "dog in the window the one in " +
                    "doorway gives me tell How much is that " +
                    "dog in the window I do hope that dog is " +
                    "for sale I must take a train to California " +
                    "and leave my profess friend along If he has " +
                    "a dog he won't be loser and the dog will have " +
                    "a good home ");

            }
        });

        btnTest.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char data[] = JtaL.getText().toCharArray();
                int len = data.length , a = Integer.parseInt(Jtf.getText());
                for(int i = 0 ;i<len;i++){
                    data[i] += a;
                }
                JtaR.setText(new String(data));
            }
        });

        btnClear.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JtaR.setText(" ");
            JtaL.setText(" ");

            }
        });

        btnExit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
