package Pruebas;
import javax.swing.*;

public class VerticalMenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menú Vertical");
        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));

        JButton option1 = new JButton("Opción 1");
        JButton option2 = new JButton("Opción 2");
        JButton option3 = new JButton("Opción 3");

        menuPanel.add(option1);
        menuPanel.add(option2);
        menuPanel.add(option3);

        frame.getContentPane().add(menuPanel);

        frame.setVisible(true);
    }
}

