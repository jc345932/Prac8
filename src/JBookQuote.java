import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame{
    FlowLayout flow = new FlowLayout();
    JLabel sentence2 = new JLabel("\"I am not worried, Harry,\" said Dumbledore, his voice a little stronger despite the freezing water. \"I am with you.");
    public JBookQuote(){
        super("Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(sentence2);
        setLayout(flow);
    }
    public static void main(String[] args) {
        JFrame aFrame = new JBookQuote();
        aFrame.setSize(1000, 750);
        aFrame.setVisible(true);

    }
}
