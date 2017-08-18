package exinterface;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class ExemploInterfaceJLabel{
	
	private JFrame tela;
	private JLabel jLabelNome;
	
	public ExemploInterfaceJLabel(){
		
		tela = new JFrame("Exemplo JLabel");
		tela.setSize(400, 300);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setUndecorated(true);
		
		jLabelNome = new JLabel("Nome:");
		// set bounds defini a posição na tela 
		// (x, y, latrgura. altura)
		// jLabelNome.setBounds(10 ,10, 100, 25);
		
		jLabelNome.setBounds((tela.getWidth() / 2) - (100/2),(tela.getHeight() / 2) - (25/2), 100,25);
		
		// setHorizontalAlignment alinhamento no texto
		jLabelNome.setHorizontalAlignment(JLabel.CENTER);
		// setForeground seria a cor da fontr
		jLabelNome.setForeground(Color.RED);
		jLabelNome.setOpaque(true);
		// setBackground seria a cor do fundo
		jLabelNome.setBackground(Color.BLACK);
		tela.add(jLabelNome);
        tela.setVisible(true);
	}
}