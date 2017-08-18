/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exinterface;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author Alunos
 */
public class MeuJLabel extends JLabel {

    public  MeuJLabel(String text, int x, int y, int width, int height){
        setText(text);
        setBounds(x, y, width, height);
    }
    
    public MeuJLabel(String text, int x , int y, int width, int height, Font font){
        setText(text);
        setBounds(x, y, width, height);
        setFont(font);
    }
}
