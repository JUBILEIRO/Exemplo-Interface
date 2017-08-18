package exinterface;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ExemploInterfaceJRadioButton{
	private JFrame tela;
	private JRadioButton homi,muie;
	private ButtonGroup meuGrupimho;
	private JButton verificarSelecionado, limparSelecionados;
	
	public ExemploInterfaceJRadioButton(){
		criarTela();
		tela.setVisible(true);
	}
	public void criarTela(){
		tela = new JFrame();
		tela.setSize(300,300);
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		criarJRadioButton();
		criarBotaoVerificarSelecionado();
		limparSelecionados();
	}
	
	public void criarJRadioButton(){
		JLabel tipo = new JLabel("TIPO");
		tipo.setBounds(10,10,100,25);
		tela.add(tipo);
		
		homi = new JRadioButton("Homi");
		homi.setBounds(10,40,100,25);
		tela.add(homi);
		muie = new JRadioButton("Muie");
		muie.setBounds(10,75,100,25);
		tela.add(muie);
		
		meuGrupimho = new ButtonGroup();
		meuGrupimho.add(homi);
		meuGrupimho.add(muie);
	}
	
	public void criarBotaoVerificarSelecionado(){
		verificarSelecionado = new JButton("Verificar");
		verificarSelecionado.setBounds(10,110,100,25);
		verificarSelecionado.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(homi.isSelected()){
			    	JOptionPane.showMessageDialog(null,"Homem");
				}else if(muie.isSelected()){
					JOptionPane.showMessageDialog(null, "Mulher");
				}else{JOptionPane.showMessageDialog(null,"Nenhum");
				}
			}
		});
		
		tela.add(verificarSelecionado);
	}

	public void limparSelecionados(){
		limparSelecionados = new JButton("Limpar");
		limparSelecionados.setBounds(120,110,100,25);
		limparSelecionados.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("<3");
				meuGrupimho.clearSelection();
			}
		});
		tela.add(limparSelecionados);
	}
}