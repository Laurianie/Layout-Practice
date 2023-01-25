import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo implements ActionListener {
    private JFrame mainFrame;
    private JLabel label1;
    private JLabel label2;
    private JMenuBar mb;
    private JTextArea ta;
    private JPanel Panel1;
    private int WIDTH=1200;
    private int HEIGHT=1200;


    public SwingControlDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        swingControlDemo.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Layout Practice");
        mainFrame.setSize(WIDTH, HEIGHT);
//        mainFrame.setLayout(new GridLayout(2, 3)); EASY 1
//        mainFrame.setLayout(new BorderLayout()); EASY 2
//        mainFrame.setLayout(new BorderLayout());
//        Panel1 = new JPanel ();
//        Panel1.setLayout(new GridLayout(2,3)); MEDIUM 1




        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);

        label1 = new JLabel("LABEL 1", JLabel.CENTER);
        label2 = new JLabel("LABEL 1", JLabel.CENTER);
//        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        mainFrame.setVisible(true);
    }

    private void showEventDemo() {
//        headerLabel.setText("Control in action: Button");

        //EASY 1:
//        JButton button1 = new JButton ("BUTTON 1");
//        JButton button2 = new JButton ("BUTTON 2");
//        JButton button3 = new JButton ("BUTTON 3");
//        JButton button4 = new JButton ("BUTTON 4");
//        JButton button5 = new JButton ("BUTTON 5");

//        button1.setActionCommand("BUTTON 1");
//        button2.setActionCommand("BUTTON 2");
//        button2.setActionCommand("BUTTON 3");
//        button2.setActionCommand("BUTTON 4");
//        button2.setActionCommand("BUTTON 5");

//        button1.addActionListener(new ButtonClickListener());
//        button2.addActionListener(new ButtonClickListener());
//        button3.addActionListener(new ButtonClickListener());
//        button4.addActionListener(new ButtonClickListener());
//        button5.addActionListener(new ButtonClickListener());

//        mainFrame.add(button1);
//        mainFrame.add(button2);
//        mainFrame.add(button3);
//        mainFrame.add(button4);
//        mainFrame.add(button5);

        //EASY 2:
//        JButton button1 = new JButton ("BUTTON 1");
//        JButton button2 = new JButton ("BUTTON 2");
//        JButton button3 = new JButton ("BUTTON 3");
//        JButton button4 = new JButton ("BUTTON 4");
//        JButton button5 = new JButton ("BUTTON 5");
//
//        button1.setActionCommand("BUTTON 1");
//        button2.setActionCommand("BUTTON 2");
//        button2.setActionCommand("BUTTON 3");
//        button2.setActionCommand("BUTTON 4");
//        button2.setActionCommand("BUTTON 5");
//
//        button1.addActionListener(new ButtonClickListener());
//        button2.addActionListener(new ButtonClickListener());
//        button3.addActionListener(new ButtonClickListener());
//        button4.addActionListener(new ButtonClickListener());
//        button5.addActionListener(new ButtonClickListener());
//
//        mainFrame.add(button1, BorderLayout.NORTH);
//        mainFrame.add(button2,BorderLayout.EAST );
//        mainFrame.add(button3, BorderLayout.SOUTH);
//        mainFrame.add(button4,BorderLayout.WEST);
//        mainFrame.add(button5, BorderLayout.CENTER);

        //MEDIUM 1:
//        JButton button1 = new JButton ("BUTTON 1");
//        JButton button2 = new JButton ("BUTTON 2");
//        JLabel  label1 = new JLabel("LABEL 1");
//        JButton button3 = new JButton ("BUTTON 3");
//        JButton button4 = new JButton ("BUTTON 4");
//        JLabel  label2 = new JLabel("LABEL 2");
//        JButton button5 = new JButton ("BUTTON 5");
//
//        button1.setActionCommand("BUTTON 1");
//        button2.setActionCommand("BUTTON 2");
//        button3.setActionCommand("BUTTON 3");
//        button4.setActionCommand("BUTTON 4");
//        button5.setActionCommand("BUTTON 5");
//
//        button1.addActionListener(new ButtonClickListener());
//        button2.addActionListener(new ButtonClickListener());
//        button3.addActionListener(new ButtonClickListener());
//        button4.addActionListener(new ButtonClickListener());
//        button5.addActionListener(new ButtonClickListener());
//
//
//        mainFrame.add(Panel1, BorderLayout.CENTER);
//        mainFrame.add(button1, BorderLayout.NORTH);
//        Panel1.add(button2);
//        Panel1.add(label1);
//        mainFrame.add(button3,BorderLayout.SOUTH);
//        Panel1.add(button4);
//        Panel1.add(label2);
//        Panel1.add(button5);


        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

        }
    }
}