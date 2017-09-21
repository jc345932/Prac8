import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jc345932 on 21/09/17.
 */
public class JHistoricalFacts extends JFrame implements ActionListener {
    FlowLayout fl = new FlowLayout();
    JButton bt = new JButton("Press to change Historical Facts!");
    JLabel a = new JLabel("The Ottoman Empire's Sultan Ibrahim I had 280 of his concubines drowned in the ocean after one of them slept with another man.");
    JLabel b = new JLabel("In medieval times people were put to death for being witches. One anthropologist conjectures as many as 600,000 \"witches\" lost their lives.");
    JLabel c = new JLabel("Mexican General Santa Anna had an elaborate state funeral for his amputated leg.");
    JLabel d = new JLabel("Tens of thousands of baby girls were abandoned each year in China because of the country's one-child policy.");
    JLabel f = new JLabel("Before the mid-19th century dentures were commonly made with teeth pulled from the mouths of dead soldiers.");
    int counter = 0;

    public JHistoricalFacts() {
        super("HistoricalFacts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(fl);
        add(bt);
        bt.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        ++counter;
        if (counter == 5)
            counter = 0;
        if (counter == 1) {
            remove(a);
            add(b);
        } else if (counter == 2) {
            remove(b);
            add(c);
        } else if (counter == 3) {
            remove(c);
            add(d);
        } else if (counter == 4) {
            remove(d);
            add(f);
        } else {
            remove(f);
            add(a);
        }
        validate();
        repaint();
    }

    public static void main(String [] args){
        JHistoricalFacts frame = new JHistoricalFacts();
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}
