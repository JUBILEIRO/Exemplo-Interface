package exinterface;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculadora{
	
	private JFrame tela;
	private JButton botao1,botao2,botao3,botao4,botao5,botao6,botao7,botao8,botao9,botao0,botaoMais,botaoMenos,botaoDivi,botaoMulti,botaoLimpar,botaoIgual;
	private JTextField jTextFieldResultado, campoAux;
	private JLabel by;
	String numeroC = "";
	String numeroD = "";
	String opereacao = "";
	
	public Calculadora(){
		tela();
		tela.setVisible(true);
		tela.requestFocus();
	}
	
	public void tela(){
		tela = new JFrame("Calculadora");
		tela.setSize(295, 420);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setResizable(false);	
        telaResultado();
		tela0();
		tela1();
		tela2();
		tela3();
		tela4();
		tela5();
		tela6();
		tela7();
		tela8();
		tela9();
		telaMais();
		telaMenos();
		telaDivi();
		telaMulti();
		telaIgual();	 
        telaLimpar();		
		telaFim();
		teclas();	
		tela.requestFocus();
	}	
	public void telaResultado(){
		
		jTextFieldResultado = new JTextField();
		jTextFieldResultado.setFont(new Font("times new roman", Font.BOLD,23));
		jTextFieldResultado.setBounds(10,10,270,50);
		jTextFieldResultado.setBackground(Color.WHITE);
		jTextFieldResultado.setHorizontalAlignment(JTextField.RIGHT);	
		jTextFieldResultado.setEditable(false);
		tela.add(jTextFieldResultado);
	}
	public void telaFim(){	
		by = new JLabel();
		by.setBounds(10,350,100,25);
		by.setFont(new Font("times new roman", Font.BOLD,23));
		by.setText("by: Cristhian");
		tela.add(by);
	}
	public void tela0(){
		botao0 = new JButton();
        botao0.setText("0");
		botao0.setFont(new Font("times new roman", Font.BOLD,23));
		botao0.setBounds(10, 280, 60, 60);
		botao0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int numero0 = 0;
				String aux0 = String.valueOf(numero0);
				numeroC = numeroC+aux0;
                jTextFieldResultado.setText(numeroC);
				tela.requestFocus();
			}
		}); 				
		tela.add(botao0);
	}
	public void telaLimpar(){	
		botaoLimpar = new JButton();
        botaoLimpar.setText("C");
		botaoLimpar.setFont(new Font("times new roman", Font.BOLD,23));
		botaoLimpar.setBounds(80, 280, 60, 60);
		botaoLimpar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numeroC = "";
                jTextFieldResultado.setText(numeroC);
                tela.requestFocus();
			}
		}); 
		tela.add(botaoLimpar);
	}
	public void telaIgual(){
		botaoIgual = new JButton();
        botaoIgual.setText("=");
		botaoIgual.setFont(new Font("times new roman", Font.BOLD,23));
		botaoIgual.setBounds(150, 280, 60, 60);
		botaoIgual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int final1 = Integer.parseInt(numeroC);
				int final2 = Integer.parseInt(numeroD);
				numeroC = "";
				numeroD = "";
                if (opereacao.equals("mais")){
					jTextFieldResultado.setText(String.valueOf(final1+final2));
					int soma = final1+final2;
					numeroC = String.valueOf(soma);
				}
				if (opereacao.equals("menos")){
					jTextFieldResultado.setText(String.valueOf(final2-final1));
					int menos = final2-final1;
					numeroC = String.valueOf(menos);
				}
				if (opereacao.equals("x")){
					jTextFieldResultado.setText(String.valueOf(final2*final1));
					int vezes = final2*final1;
					numeroC = String.valueOf(vezes);
				}
				if (opereacao.equals("/")){
					double dividir = (double)final2/final1;
					jTextFieldResultado.setText(String.valueOf(dividir));
					numeroC = String.valueOf(dividir);
				}
				tela.requestFocus();
			}
		}); 
		tela.add(botaoIgual);
	}
	public void telaMais(){
		botaoMais = new JButton();
        botaoMais.setText("+");
		botaoMais.setFont(new Font("times new roman", Font.BOLD,23));
		botaoMais.setBounds(220, 280, 60, 60);
		botaoMais.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numeroD = numeroC;
				numeroC = "";
                opereacao = "mais";
				tela.requestFocus();
			}
		}); 
		tela.add(botaoMais);
	}
	public void tela1(){
		botao1 = new JButton();
        botao1.setText("1");
		botao1.setFont(new Font("times new roman", Font.BOLD,23));
		botao1.setBounds(10, 210, 60, 60);
		botao1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int numero1 = 1;
				String aux1 = String.valueOf(numero1);
				numeroC = numeroC+aux1;
                jTextFieldResultado.setText(numeroC);
				tela.requestFocus();
			}
		}); 
		tela.add(botao1);
	}
	public void tela2(){
		botao2 = new JButton();
        botao2.setText("2");
		botao2.setFont(new Font("times new roman", Font.BOLD,23));
		botao2.setBounds(80, 210, 60, 60);
		botao2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int numero2 = 2;
				String aux2 = String.valueOf(numero2);
				numeroC = numeroC+aux2;
                jTextFieldResultado.setText(numeroC);
				tela.requestFocus();
			}
		}); 
		tela.add(botao2);
	}
	public void tela3(){
		botao3 = new JButton();
        botao3.setText("3");
		botao3.setFont(new Font("times new roman", Font.BOLD,23));
		botao3.setBounds(150, 210, 60, 60);
		botao3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int numero3 = 3;
				String aux3 = String.valueOf(numero3);
				numeroC = numeroC+aux3;
                jTextFieldResultado.setText(numeroC);
				tela.requestFocus();
			}
		}); 
		tela.add(botao3);
	}
	public void telaMenos(){
		botaoMenos = new JButton();
        botaoMenos.setText("_");
		botaoMenos.setFont(new Font("times new roman", Font.BOLD,23));
		botaoMenos.setBounds(220, 210, 60, 60);
		botaoMenos.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numeroD = numeroC;
				numeroC = "";
                opereacao = "menos";
				tela.requestFocus();
			}
		}); 
		tela.add(botaoMenos);
	}
	public void tela4(){	
		botao4 = new JButton();
        botao4.setText("4");
		botao4.setFont(new Font("times new roman", Font.BOLD,23));
		botao4.setBounds(10, 140, 60, 60);
		botao4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int numero4 = 4;
				String aux4 = String.valueOf(numero4);
				numeroC = numeroC+aux4;
                jTextFieldResultado.setText(numeroC);
				tela.requestFocus();
			}
		}); 
		tela.add(botao4);
	}
	public void tela5(){
		botao5 = new JButton();
        botao5.setText("5");
		botao5.setFont(new Font("times new roman", Font.BOLD,23));
		botao5.setBounds(80, 140, 60, 60);
		botao5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int numero5 = 5;
				String aux5 = String.valueOf(numero5);
				numeroC = numeroC+aux5;
                jTextFieldResultado.setText(numeroC);
				tela.requestFocus();
				tela.requestFocus();
			}
		}); 
		tela.add(botao5);
	}
	public void tela6(){
		botao6 = new JButton();
        botao6.setText("6");
		botao6.setFont(new Font("times new roman", Font.BOLD,23));
		botao6.setBounds(150, 140 , 60, 60);
		botao6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int numero6 = 6;
				String aux6 = String.valueOf(numero6);
				numeroC = numeroC+aux6;
                jTextFieldResultado.setText(numeroC);
				tela.requestFocus();
			}
		}); 
		tela.add(botao6);
	}
	public void telaMulti(){	
		botaoMulti = new JButton();
        botaoMulti.setText("X");
		botaoMulti.setFont(new Font("times new roman", Font.BOLD,23));
		botaoMulti.setBounds(220, 140, 60, 60);
		botaoMulti.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numeroD = numeroC;
				numeroC = "";
                opereacao = "x";
				tela.requestFocus();
			}
		}); 
		tela.add(botaoMulti);
	}
	public void tela7(){	
		botao7 = new JButton();
        botao7.setText("7");
		botao7.setFont(new Font("times new roman", Font.BOLD,23));
		botao7.setBounds(10, 70, 60, 60);
		botao7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int numero7 = 7;
				String aux7 = String.valueOf(numero7);
				numeroC = numeroC+aux7;
                jTextFieldResultado.setText(numeroC);
				tela.requestFocus();
			}
		}); 
		tela.add(botao7);
	}
	public void tela8(){
		botao8 = new JButton();
        botao8.setText("8");
		botao8.setFont(new Font("times new roman", Font.BOLD,23));
		botao8.setBounds(80, 70, 60, 60);
		botao8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int numero8 = 8;
				String aux8 = String.valueOf(numero8);
				numeroC = numeroC+aux8;
                jTextFieldResultado.setText(numeroC);
				tela.requestFocus();
			}
		}); 
		tela.add(botao8);
	}
	public void tela9(){
		botao9 = new JButton();
        botao9.setText("9");
		botao9.setFont(new Font("times new roman", Font.BOLD,23));
		botao9.setBounds(150, 70, 60, 60);
		botao9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int numero9 = 9;
				String aux9 = String.valueOf(numero9);
				numeroC = numeroC+aux9;
                jTextFieldResultado.setText(numeroC);
				tela.requestFocus();
			}
		}); 
		tela.add(botao9);
	}
	public void telaDivi(){
		botaoDivi = new JButton();
        botaoDivi.setText("/");
		botaoDivi.setFont(new Font("times new roman", Font.BOLD,23));
		botaoDivi.setBounds(220, 70, 60, 60);
		botaoDivi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				numeroD = numeroC;
				numeroC = "";
                opereacao = "/";
				tela.requestFocus();
			}
		}); 
		tela.add(botaoDivi);	
	}
	public void teclas(){
	    tela.addKeyListener(new KeyAdapter(){
		    public void keyPressed(KeyEvent e){
			    switch(e.getKeyCode()){
					case KeyEvent.VK_0:
						int numero0 = 0;
						String aux0 = String.valueOf(numero0);
						numeroC = numeroC+aux0;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_1:
						int numero1 = 1;
						String aux1 = String.valueOf(numero1);
						numeroC = numeroC+aux1;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_2:
						int numero2 = 2;
						String aux2 = String.valueOf(numero2);
						numeroC = numeroC+aux2;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_3:
						int numero3 = 3;
						String aux3 = String.valueOf(numero3);
						numeroC = numeroC+aux3;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_4:
						int numero4 = 4;
						String aux4 = String.valueOf(numero4);
						numeroC = numeroC+aux4;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_5:
						int numero5 = 5;
						String aux5 = String.valueOf(numero5);
						numeroC = numeroC+aux5;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_6:
						int numero6 = 6;
						String aux6 = String.valueOf(numero6);
						numeroC = numeroC+aux6;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_7:
						int numero7 = 7;
						String aux7 = String.valueOf(numero7);
						numeroC = numeroC+aux7;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_8:
						int numero8 = 8;
						String aux8 = String.valueOf(numero8);
						numeroC = numeroC+aux8;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_9:
						int numero9 = 9;
						String aux9 = String.valueOf(numero9);
						numeroC = numeroC+aux9;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_NUMPAD0:
						int numero00 = 0;
						String aux00 = String.valueOf(numero00);
						numeroC = numeroC+aux00;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_NUMPAD1:
						int numero01 = 1;
						String aux01 = String.valueOf(numero01);
						numeroC = numeroC+aux01;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_NUMPAD2:
						int numero02 = 2;
						String aux02 = String.valueOf(numero02);
						numeroC = numeroC+aux02;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_NUMPAD3:
						int numero03 = 3;
						String aux03 = String.valueOf(numero03);
						numeroC = numeroC+aux03;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_NUMPAD4:
						int numero04 = 4;
						String aux04 = String.valueOf(numero04);
						numeroC = numeroC+aux04;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_NUMPAD5:
						int numero05 = 5;
						String aux05 = String.valueOf(numero05);
						numeroC = numeroC+aux05;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_NUMPAD6:
						int numero06 = 6;
						String aux06 = String.valueOf(numero06);
						numeroC = numeroC+aux06;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_NUMPAD7:
						int numero07 = 7;
						String aux07 = String.valueOf(numero07);
						numeroC = numeroC+aux07;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_NUMPAD8:
						int numero08 = 8;
						String aux08 = String.valueOf(numero08);
						numeroC = numeroC+aux08;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_NUMPAD9:
						int numero09 = 9;
						String aux09 = String.valueOf(numero09);
						numeroC = numeroC+aux09;
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_BACK_SPACE:
						numeroC = "";
						jTextFieldResultado.setText(numeroC);
						tela.requestFocus();
					break; 
					case KeyEvent.VK_ADD:
						numeroD = numeroC;
						numeroC = "";
						opereacao = "mais";
						tela.requestFocus();
					break;
					case KeyEvent.VK_SUBTRACT:
						numeroD = numeroC;
						numeroC = "";
						opereacao = "menos";
						tela.requestFocus();
					break;
					case KeyEvent.VK_MULTIPLY:
						numeroD = numeroC;
						numeroC = "";
						opereacao = "x";
						tela.requestFocus();
					break;
					case KeyEvent.VK_DIVIDE:
						numeroD = numeroC;
						numeroC = "";
						opereacao = "/";
						tela.requestFocus();
					break;
					case KeyEvent.VK_EQUALS:
						int final1 = Integer.parseInt(numeroC);
						int final2 = Integer.parseInt(numeroD);
						numeroC = "";
						numeroD = "";
						if (opereacao.equals("mais")){
							jTextFieldResultado.setText(String.valueOf(final1+final2));
							int soma = final1+final2;
							numeroC = String.valueOf(soma);
						}
						if (opereacao.equals("menos")){
							jTextFieldResultado.setText(String.valueOf(final2-final1));
							int menos = final2-final1;
							numeroC = String.valueOf(menos);
						}
						if (opereacao.equals("x")){
							jTextFieldResultado.setText(String.valueOf(final2*final1));
							int vezes = final2*final1;
							numeroC = String.valueOf(vezes);
						}
						if (opereacao.equals("/")){
							double dividir = (double)final2/final1;
							jTextFieldResultado.setText(String.valueOf(dividir));
							numeroC = String.valueOf(dividir);
						}
						tela.requestFocus();
					break;
					case KeyEvent.VK_ENTER:
						final1 = Integer.parseInt(numeroC);
						final2 = Integer.parseInt(numeroD);
						numeroC = "";
						numeroD = "";
						if (opereacao.equals("mais")){
							jTextFieldResultado.setText(String.valueOf(final1+final2));
							int soma = final1+final2;
							numeroC = String.valueOf(soma);
						}
						if (opereacao.equals("menos")){
							jTextFieldResultado.setText(String.valueOf(final2-final1));
							int menos = final2-final1;
							numeroC = String.valueOf(menos);
						}
						if (opereacao.equals("x")){
							jTextFieldResultado.setText(String.valueOf(final2*final1));
							int vezes = final2*final1;
							numeroC = String.valueOf(vezes);
						}
						if (opereacao.equals("/")){
							double dividir = (double)final2/final1;
							jTextFieldResultado.setText(String.valueOf(dividir));
							numeroC = String.valueOf(dividir);
						}
						tela.requestFocus();
					break;
				}
		    }
	    });
	}
}