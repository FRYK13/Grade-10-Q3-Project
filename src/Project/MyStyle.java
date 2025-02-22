/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;

/**
 *
 * @author Thaddeus
 */
public class MyStyle {
    public void changeFontRecursive(Container root, Font font) {
        for (Component c : root.getComponents()) {
            c.setFont(font);
            if (c instanceof Container) {
                changeFontRecursive((Container) c, font);
            }
        }
    }
}