//GUI login
import javax.swing.*;
import java.awt.event.*;
class Login extends ActionListener
{
        JFrame f;
        JTextFields t;
        JButton LN,EX;

        void Login()
        {
                f=new JFrame("Login");
                t=new Jtextfields();
                LN=new JBotton("LOGIN");
                EX=new JBotton("EXIT");
                f.setLayout(null);
                f.setVisibile(true);
                f.setBound(50,50,350,500);
        }
}
