package exinterface;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExemploInterfaceJTextField{
	
	private JFrame tela;
	private JLabel jLabelNome;
	private JTextField jTextFieldNome;
	
	public ExemploInterfaceJTextField(){
		
		tela = new JFrame();
		tela.setSize(300, 300);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		jLabelNome = new JLabel("Nome:");
		jTextFieldNome = new JTextField();
		jLabelNome.setBounds(10 ,10, 100, 25);
		jTextFieldNome.setBounds(50, 10, 100, 25);
		tela.add(jLabelNome);
		tela.add(jTextFieldNome);
		
		tela.setVisible(true);
		
	}
	
}