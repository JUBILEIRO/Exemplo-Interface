package exinterface;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ExemploInterfaceSomar{
	private JFrame tela;
	private JLabel jLabelNome, jLabelNumero01, jLabelNumero02;
	private JTextField jTextFieldNome, jTextFieldN01, jTextFieldN02;
	private JButton jButtonSomar;
	private JTextField jTextFieldResultado;
	private JLabel jLabelResultado;
	
	public ExemploInterfaceSomar(){
		tela = new JFrame("Somar");
		tela.setSize(300, 400);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setResizable(false);
		
		jLabelNome = new JLabel("Nome");
		jLabelNome.setBounds(10, 10, 100, 25);
		tela.add(jLabelNome);
		
		jTextFieldNome = new JTextField();
		jTextFieldNome.setBounds(80, 10, 100, 25);
		tela.add(jTextFieldNome);
		
		jLabelNumero01 = new JLabel ("Numero 01");
		jLabelNumero01.setBounds(10 ,50, 100, 25);
		tela.add(jLabelNumero01);
		
		jTextFieldN01 = new JTextField();
		jTextFieldN01.setBounds(80, 50, 100, 25);
		tela.add(jTextFieldN01);
		
		jLabelNumero02 = new JLabel ("Numero 02");
		jLabelNumero02.setBounds(10 ,90, 100, 25);
		tela.add(jLabelNumero02);
		
		jTextFieldN02 = new JTextField();
		jTextFieldN02.setBounds(80, 90, 100, 25);
		tela.add(jTextFieldN02);
		
		jLabelResultado = new JLabel();
		jLabelResultado.setBounds(10,170,100,25);
		jLabelResultado.setText("Resultado");
		tela.add(jLabelResultado);
		
		jTextFieldResultado = new JTextField();
		jTextFieldResultado.setBounds(100,170,100,25);
		jTextFieldResultado.setEditable(false);
		tela.add(jTextFieldResultado);
		
		jButtonSomar = new JButton();
        jButtonSomar.setText("SOMAR");
		jButtonSomar.setBounds(100, 130, 100, 25);
		jButtonSomar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			    int numero1 = Integer.parseInt(jTextFieldN01.getText());
				int numero2 = Integer.parseInt(jTextFieldN02.getText());
				String nome = jTextFieldNome.getText();
				jTextFieldResultado.setText(String.valueOf(numero1+numero2));
		    }
		});
		tela.add(jButtonSomar);
		
		
		tela.setVisible(true);
	}
	
	
}