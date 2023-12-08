package view;

import model.PanelMenuBar;
import model.PanelBase;

import javax.swing.*;
public class Vista extends JFrame {
    private PanelMenuBar menuBarPanel = new PanelMenuBar();
    private PanelBase panelBase = new PanelBase();

    public Vista(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true); /* Sirve para quitar los botones de cerrar, minimizar y ajustar */
        this.setLayout(null);
        this.setSize(1200, 700); /* El tamaño de la ventana */
        this.setLocationRelativeTo(null); /* Para que la ventana salga en medio de la pantalla */

        /* Se añaden los paneles al JFrame */
        this.add(menuBarPanel);
        this.add(panelBase);

        menuBarPanel.initMoving(Vista.this);
    }

    /**
     * Es solo para pruebas
     * @param args sepa
     */
    public static void main(String[] args) {
        Vista vista = new Vista();
        vista.setVisible(true);
    }
}