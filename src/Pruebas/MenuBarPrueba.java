package Pruebas;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBarPrueba {
    public static void main(String[] args) {
        // Crear un marco (frame) para la aplicación
        JFrame frame = new JFrame("Ejemplo de Menú");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear el primer menú
        JMenu fileMenu = new JMenu("Archivo");

        // Crear elementos del menú
        JMenuItem newItem = new JMenuItem("Nuevo");
        JMenuItem openItem = new JMenuItem("Abrir");
        JMenuItem saveItem = new JMenuItem("Guardar");
        JMenuItem exitItem = new JMenuItem("Salir");

        // Agregar elementos al menú "Archivo"
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Separador entre elementos
        fileMenu.add(exitItem);

        // Agregar el menú "Archivo" a la barra de menú
        menuBar.add(fileMenu);

        // Configurar la barra de menú en el marco
        frame.setJMenuBar(menuBar);

        // Mostrar el marco
        frame.setVisible(true);
    }
}
