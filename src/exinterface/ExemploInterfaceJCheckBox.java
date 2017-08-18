package exinterface;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ExemploInterfaceJCheckBox{
	private JFrame tela;
	private JCheckBox preto, branco, amarelo;
	private JButton verificarSelecionado, limparSelecionados;
	
	public ExemploInterfaceJCheckBox(){
		criarTela();
		tela.setVisible(true);
	}
	public void criarTela(){
		tela = new JFrame();
		tela.setSize(300,300);
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		criarJCheckBox();
		criarBotaoVerificarSelecionado();
		limparSelecionados();
	}

	public void criarJCheckBox(){
		preto = new JCheckBox("Preto");
		preto.setBounds(10,40,100,25);
		branco = new JCheckBox("Branco");
		branco.setBounds(10,80,100,25);
		amarelo = new JCheckBox("Amarelo");
		amarelo.setBounds(10,120,100,25);

		tela.add(preto);
		tela.add(amarelo);
		tela.add(branco);
	}

	public void mostrarMensagem(String texto){
		JOptionPane.showMessageDialog(null, texto);
	}

    public void limparSelecionados(){
                limparSelecionados = new JButton("Limpar");
		limparSelecionados.setBounds(115,80,100,25);
		tela.add(limparSelecionados);
		limparSelecionados.addActionListener((ActionEvent e) -> {
                    preto.setSelected(false);
                    amarelo.setSelected(false);
                    branco.setSelected(false);
                });
		
    } 

	public void criarBotaoVerificarSelecionado(){
		verificarSelecionado = new JButton("Verificar");
		verificarSelecionado.setBounds(150,80,100,25);
		tela.add(verificarSelecionado);
		verificarSelecionado.addActionListener((ActionEvent e) -> {
                    if(preto.isSelected()){
                        mostrarMensagem("Preto");
                    }
                    if(branco.isSelected()){
                        mostrarMensagem("Branco");
                    }
                    if(amarelo.isSelected()){
                        mostrarMensagem("Amarelo");
                    }if(!amarelo.isSelected() && !preto.isSelected() && !branco.isSelected()){
                        mostrarMensagem("None");
                    }
                });
	}	
}