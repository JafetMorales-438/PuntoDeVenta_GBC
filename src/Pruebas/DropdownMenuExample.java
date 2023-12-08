package Pruebas;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DropdownMenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de Menú Desplegable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();

        // Crear un arreglo de opciones para el menú desplegable
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};

        // Crear el menú desplegable
        JComboBox<String> dropdown = new JComboBox<>(opciones);

        // Agregar el menú desplegable al panel
        panel.add(dropdown);

        // Agregar el panel al marco
        frame.add(panel);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}
