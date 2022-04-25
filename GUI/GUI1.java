import java.awt.*;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.*;

class GUI1 extends JFrame{
    JLabel lb1,lb2;
    JTextField tf1, tf2;
    JCheckBox cb1, cb2;
    JButton bt1,bt2,bt3;
    JPanel pn1,pn2,pn3;
    JFrame frame;

    public GUI1()  {
        cb1 = new JCheckBox("Snap to Grid");
         cb2 = new JCheckBox("Show Grid");
        pn1 = new JPanel();
        pn1.setLayout(new BoxLayout(pn1, BoxLayout.Y_AXIS));
        pn1.add(cb1);
        pn1.add(cb2);
        pn1.setPreferredSize(new Dimension(120,40));
        pn1.setMaximumSize(new Dimension(120,40));
        lb1 = new JLabel("X:");
        lb2 = new JLabel("Y:");
        tf1 = new JTextField();
        tf1.setColumns(4);
        tf2 = new JTextField();
        tf2.setColumns(4);
        JPanel pn21 = new JPanel();
        pn21.setSize(100,20);
        pn21.setMaximumSize(new Dimension(100,20));
        //pn21.setLayout(new BoxLayout(pn21,BoxLayout.X_AXIS));
        JPanel pn22 = new JPanel();
        pn22.setSize(100,10);
        pn22.setMaximumSize(new Dimension(100,20));
       // pn22.setLayout(new BoxLayout(pn22,BoxLayout.X_AXIS));
        pn21.add(lb1);
        pn21.add(tf1);
        pn22.add(lb2);
        pn22.add(tf2);
        pn2 = new JPanel();
        pn2.setLayout(new BoxLayout(pn2,BoxLayout.Y_AXIS));
        pn2.add(pn21);
        pn2.add(pn22);
        bt1 = new JButton("Ok");
        bt1.setSize(100,30);
        bt1.setMaximumSize(new Dimension(100,30));
        bt1.setBounds(20,20, 20,20);
        bt2 = new JButton("Cancel");
        bt2.setSize(70,30);
        bt2.setMaximumSize(new Dimension(100,30));
        bt3 = new JButton("Help");
        bt3.setSize(100,30);
        bt3.setMaximumSize(new Dimension(100,30));
        pn3 = new JPanel();
        pn3.setLayout(new BoxLayout(pn3,BoxLayout.Y_AXIS));
        pn3.add(bt1);
        pn3.add(bt2);
        pn3.add(bt3);
        pn3.setLocation(20,pn3.getY()/2);
        frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.add(pn1,BorderLayout.WEST);
        frame.add(pn2,BorderLayout.CENTER);
        frame.add(pn3, BorderLayout.EAST);

        frame.setSize(350, 140);
        frame.setVisible(true);
        frame.setTitle("Ex1");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        GUI1 x = new GUI1();
    }



}
