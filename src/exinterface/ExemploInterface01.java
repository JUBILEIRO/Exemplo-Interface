package exinterface;

import javax.swing.JFrame;

public class ExemploInterface01{
	
	public ExemploInterface01(){
		JFrame tela = new JFrame("MInha primeira janela");
		tela.setSize(500, 200);
		// setSize = Largura e altura		
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		// setDefaultCloseOperation define que quando o usuario sair ira encerrar o programa
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setVisible(true);
		// pra deixar visivel
	}
	
	
}