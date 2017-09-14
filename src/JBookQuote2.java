import javax.swing.*;

import java.awt.*;

import java.awt.event.*;



public class JBookQuote2 extends JFrame implements ActionListener

{

    FlowLayout flow = new FlowLayout();

    JLabel st1 = new  JLabel("\"I am not worried, Harry,\" said Dumbledore, his voice a little stronger despite the freezing water. \"I am with you.");

    JButton button = new JButton("Click for source");

    JLabel st2 = new JLabel("Harry Potter");

    public JBookQuote2()

    {

        super("Book Quote 2");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(flow);

        add(st1);

        add(button);

        button.addActionListener(this);

    }

    @Override

    public void actionPerformed(ActionEvent e)

    {

        add(st2);

        validate();

        repaint();

    }

    public static void main(String[] args)

    {

        JBookQuote2 aFrame = new JBookQuote2();

        aFrame.setSize(500, 150);

        aFrame.setVisible(true);

    }

}