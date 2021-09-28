import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyGUI implements ActionListener {

    int count = 0;
    private JLabel label;
    private JPanel panel;
    private JButton button;
    private JFrame frame;




    public MyGUI() {

        frame = new JFrame();

        button = new JButton("Click me!");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new MyGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }

}