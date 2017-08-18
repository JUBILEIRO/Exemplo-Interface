package exinterface;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

public class ExemploInterfaceFirulinhas{
	
	private JFrame tela;
	private JTextArea textinho;
	private JButton jButtonA;
	private JTextField campoOuvidor;
	private JLabel pontinho;
	
	public ExemploInterfaceFirulinhas(){
		criarTela();
		tela.setVisible(true);
		
	}
	
	public void criarTela(){
		tela = new JFrame("Exemplo de Firulinhas");
		tela.setSize(400,400);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		criarCampoBorda();
		botaoComFirulinha();
		joguinhoDoPontinho();
	}
	
	public void criarCampoBorda(){
		textinho = new JTextArea();
		textinho.setBounds(10,10,200,100);
		Border borda = BorderFactory.createLineBorder(Color.ORANGE);
		textinho.setBorder(BorderFactory.createCompoundBorder(borda, BorderFactory.createEmptyBorder(10,10,10,30)));
		tela.add(textinho);
		
	}
	
	public void botaoComFirulinha(){
		jButtonA = new JButton("Azul");
		jButtonA.setBackground(new Color(0,226,64));
		jButtonA.setBounds(10,150,160,30);
		jButtonA.setForeground(Color.BLUE);
		jButtonA.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent evt){
				jButtonA.setBackground(Color.BLACK);
				jButtonA.setForeground(Color.YELLOW);
			}
			public void mouseExited(MouseEvent evt){
				jButtonA.setBackground(Color.PINK);
				jButtonA.setForeground(Color.GREEN);
			}
			public void mousePressed(MouseEvent evt){
				jButtonA.setBackground(Color.BLUE);
				jButtonA.setForeground(Color.YELLOW);
			}
			public void mouseReleased(MouseEvent evt){
				jButtonA.setBackground(Color.WHITE);
				jButtonA.setForeground(Color.BLACK);
			}			
	    });
		tela.add(jButtonA);
	}
	
    public void joguinhoDoPontinho(){
		pontinho = new JLabel("•");
		pontinho.setBounds(100,250,40,40);
		tela.add(pontinho);
	    campoOuvidor = new JTextField();
	    campoOuvidor.setBounds(0,200,100,20);
	    campoOuvidor.addKeyListener(new KeyAdapter(){
		    public void keyPressed(KeyEvent e){
			    switch(e.getKeyCode()){
				    case KeyEvent.VK_UP:
					  pontinho.setLocation(pontinho.getX(), pontinho.getY()-10);
					  System.out.println("CIMA");
					break;  
					case KeyEvent.VK_DOWN:
					  pontinho.setLocation(pontinho.getX(), pontinho.getY()+10);
					  System.out.println("BAIXO");
					break;  
					case KeyEvent.VK_LEFT:
					  pontinho.setLocation(pontinho.getX()-10, pontinho.getY());
					  System.out.println("ESQUERDA");
					break;  
					case KeyEvent.VK_RIGHT:
					  pontinho.setLocation(pontinho.getX()+10, pontinho.getY());
					  System.out.println("DIREITA");
					break;  
			   }
		   }
	   });
	   tela.add(campoOuvidor);
    }
}