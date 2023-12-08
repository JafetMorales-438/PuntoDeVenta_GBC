package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class PanelMenuBar extends JPanel {
    private JPanel panel_Logo;
    private int x, y;
    public PanelMenuBar(){
        this.setBounds(0,0,250,700);
        this.setOpaque(false);
        this.setLayout(null);

        panelLogo();
    }
    @Override
    protected void paintChildren(Graphics graphics){
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gradientPaint = new GradientPaint(0,0,Color.decode("#38ef7d"),0,getHeight(), Color.decode("#11998e"));
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillRoundRect(0,0,getWidth(),getHeight(),15,15);
        /* Cuando se crea el dibujo, este sale con borde redondo, esta línea de código son para quitar eso */
        graphics2D.fillRect(getWidth()-20,0,getWidth(), getHeight());
        super.paintChildren(graphics); /* pa' que pinte */
    }

    /**
     * Este método tiene toda la configuración del panel donde se pondrán el logo y demás cosas.
     * @return Panel donde se muestra el logo
     */
    private JPanel panelLogo(){
        panel_Logo = new JPanel();
        ImageIcon iconoLogo = new ImageIcon("C:\\Users\\Jafet Morales\\Desktop\\GummiesGBC\\GummiesByGBC\\src\\images\\florLogo.png");
        JLabel labelLogo = new JLabel(iconoLogo);
        labelLogo.setBounds(25,0,200,70);

        panel_Logo.setBounds(0,20,250,100);
        panel_Logo.setOpaque(false);
        panel_Logo.setLayout(null);

        panel_Logo.add(labelLogo);
        this.add(panel_Logo); /* se añade el panel al menu */
        return panel_Logo;
    }

    /**
     * Este método nos permite mover el JFrame, ya que al quitarle la barra superior, este pierde esa propiedad.
     * @param frame El frame principal o la vista principal.
     */
    public void initMoving(JFrame frame){
        panel_Logo.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });
        panel_Logo.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                frame.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
            }
        });
    }
}