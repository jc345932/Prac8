import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jc345932 on 21/09/17.
 */
public class JFrameDisableButton2 extends JFrame implements ActionListener{
    final int SIZE = 180;
    Container con = getContentPane();
    int count = 0;
    final int MAX = 8;
    JLabel lb = new JLabel("That's enough!");
    JButton bt = new JButton("Press");
    public JFrameDisableButton2(){
        super("Button");
        con.setLayout(new FlowLayout());
        setSize(300,200);
        setVisible(true);
        con.add(lb);
        con.add(bt);
        lb.setVisible(false);
        bt.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        ++count;
        if (count == MAX){
            bt.setEnabled(false);
            lb.setVisible(true);
        }
    }
    public static void main(String [] args){
        JFrameDisableButton2 Button = new JFrameDisableButton2();
    }
}
