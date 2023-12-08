package controller;

import javax.swing.*;

public class Modelo_Menu {
    String icon, name;
    MenuType type;

    public Modelo_Menu(String icon, String name, MenuType type) {
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public Icon toIcon(){
        return new ImageIcon("Hasta acá, minuto: 12:28  07-08/12/2023");
    }

    public void setIcon(String icon) {this.icon = icon;}
    public void setName(String name) {this.name = name;}
    public void setType(MenuType type) {this.type = type;}

    public static enum MenuType{}
}