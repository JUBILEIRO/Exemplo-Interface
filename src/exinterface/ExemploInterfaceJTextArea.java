package exinterface;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ExemploInterfaceJTextArea{
	
	private JFrame tela;
	private JTextArea textao, textaoComScroll;
	private JLabel jLabelTextao, jLabelTextaoComScroll;
	private JScrollPane scroll;
	
	public ExemploInterfaceJTextArea(){
		criarComponentes();
	}
	
	public void criarComponentes(){
		
		tela = new JFrame("Exemplo JTextArea");
		tela.setSize(680,500);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		jLabelTextao = new JLabel("Textão");
		jLabelTextao.setBounds(10,10,100,25);
        tela.add(jLabelTextao);
 		
		textao = new JTextArea();
		textao.setBounds(10,50,300,300);
		tela.add(textao);
		
		
		jLabelTextaoComScroll = new JLabel("Textão com scroll");
		jLabelTextaoComScroll.setBounds(360,10,150,25);
		tela.add(jLabelTextaoComScroll);
		
		textaoComScroll = new JTextArea();
		textaoComScroll.setLineWrap(true);
		scroll = new JScrollPane(textaoComScroll);
		scroll.setBounds(360,50,300,300);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		tela.add(scroll);
		
		tela.setVisible(true);
	}
	
	
}