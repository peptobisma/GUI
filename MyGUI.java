import javax.swing.*;

public class MyGUI {
    JFrame frame = new JFrame();

    JPanel panel = new JPanel();
    panel.setBorder(BorderFacctory.createEmptyBorder(30, 30, 10, 30));
    panel.setLayout(new GridLayout());



    public static void main(String[] args) {
        new GUI();
    }


    
}