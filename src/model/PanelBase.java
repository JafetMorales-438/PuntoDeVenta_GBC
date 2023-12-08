package model;

import javax.swing.*;
import java.awt.*;

public class PanelBase extends JPanel {
    public PanelBase(){
        this.setBounds(251,0,950,700);
        setOpaque(false);
        //this.setBackground(new Color(255,255,255));
    }
    @Override
    protected void paintComponent(Graphics graphics){
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.setColor(getBackground());
        graphics2D.fillRoundRect(0,0,getWidth(),getHeight(),15,15);

        super.paintComponent(graphics);
    }
}
