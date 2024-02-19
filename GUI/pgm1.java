//GUi program
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class pgm1 extends JFrame
{
        pgm1()
        {
                JButton b1=new JButton("yes");
                JButton b2=new JButton("no");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(new FlowLayout());
                setSize(300,300);
                add(b1);
                add(b2);
                setVisible(true);

        }
        public static void main(String[]args)
        {
                new pgm1();
        }
}
