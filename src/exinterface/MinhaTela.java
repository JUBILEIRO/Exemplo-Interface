package exinterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author(name=Cristhian Gustavo Lourenço, date=07-05-2017)
 */
public class MinhaTela {
    private JFrame jFrame;
    private JButton jButtonExTudoJunto, jButtonComboBox, jButtonPassword, jButtonCalc, jButtonJLabel, jButtonExJCheckButton,jButtonExJRadioButton, jButtonExJButton,jButtonExJFirulinhas,jButtonExJTextArea,jButtonExJTextFild,jButtonExJSomar;
        
    public MinhaTela(){
        criarTela();
    }
    public void criarTela(){
        jFrame = new JFrame("Meus Exemplos");
        jFrame.setSize(1000,800);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criarBotoes();
        jFrame.setVisible(true);
    }
    private void criarBotoes(){
        jButtonJLabel = new JButton("Ex. JLabel");
        jButtonExJCheckButton = new JButton("Ex. JCheck");
        jButtonExJRadioButton = new JButton("Ex. JRadio");
        jButtonExJButton = new JButton("Ex. JButton");
        jButtonExJFirulinhas = new JButton("Ex. JLabel");
        jButtonExJTextArea = new JButton("Ex. JTextArea");
        jButtonExJTextFild = new JButton("Ex. JTextFild");
        jButtonExJSomar = new JButton("Ex. JSomar");
        jButtonCalc = new JButton("Ex. Calculadora");
        jButtonPassword = new JButton("Senha");
        jButtonComboBox = new JButton("Combo Box");
        jButtonExTudoJunto = new JButton("Tudo Junto");
        
        
        jButtonJLabel.setBounds(10,10,200,25);
        jButtonExJCheckButton.setBounds(220,10,200,25);
        jButtonExJRadioButton.setBounds(430,10,200,25);
        jButtonExJButton.setBounds(10,50,200,25);
        jButtonExJFirulinhas.setBounds(220,50,200,25);
        jButtonExJTextArea.setBounds(430,50,200,25);
        jButtonExJTextFild.setBounds(10,90,200,25);
        jButtonExJSomar.setBounds(220,90,200,25); 
        jButtonCalc.setBounds(430,90,200,25);
        jButtonPassword.setBounds(10,130,200,25);
        jButtonComboBox.setBounds(220,130,200,25);
        jButtonExTudoJunto.setBounds(430,130,200,25);
        
        jFrame.add(jButtonJLabel);
        jFrame.add(jButtonExJCheckButton);
        jFrame.add(jButtonExJRadioButton);
        jFrame.add(jButtonExJButton);
        jFrame.add(jButtonExJFirulinhas);
        jFrame.add(jButtonExJTextArea);
        jFrame.add(jButtonExJTextFild);
        jFrame.add(jButtonExJSomar);
        jFrame.add(jButtonCalc);
        jFrame.add(jButtonPassword);
        jFrame.add(jButtonComboBox);
        jFrame.add(jButtonExTudoJunto);
        adicionarONClickParaOsBotoes();
        /*
        Atalhos:
        ctrl + shift + cima ou baixo = duplica linha
        alt + shift + cima ou baixo = move a linha
        ctrl + e = deleta linha
        ctrl + espaço = completa as letras
        ctrl + r = renomea a treta
        f6 = executa
        alt + shift + f = identa o teu codigo
        */
    }
    
    public void adicionarONClickParaOsBotoes(){
        jButtonJLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ExemploInterfaceJLabel ex = new ExemploInterfaceJLabel();
            }
        });
        jButtonExJCheckButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ExemploInterfaceJCheckBox ex = new ExemploInterfaceJCheckBox();
            }
        });
        jButtonExJRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ExemploInterfaceJRadioButton ex = new ExemploInterfaceJRadioButton();
            }
        });
        jButtonExJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ExemploInterfaceJButton ex = new ExemploInterfaceJButton();
            }
        });
        jButtonExJFirulinhas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ExemploInterfaceFirulinhas ex = new ExemploInterfaceFirulinhas();
            }
        });
        jButtonExJTextArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ExemploInterfaceJTextArea ex = new ExemploInterfaceJTextArea();
            }
        });
        jButtonExJTextFild.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ExemploInterfaceJTextField ex = new ExemploInterfaceJTextField();
            }
        });
        jButtonExJSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ExemploInterfaceSomar ex = new ExemploInterfaceSomar();
            }
        });
        jButtonCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             Calculadora ex = new Calculadora();
            }
        });
        jButtonPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ExemploInterfaceSenha ex = new ExemploInterfaceSenha();
            }
        });
        jButtonComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ExemploInterfaceJComboBox ex = new ExemploInterfaceJComboBox();
            }
        });
        jButtonExTudoJunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ExemploInterfaceTudoJunto_1 ex = new ExemploInterfaceTudoJunto_1();
            }
        });
        
    }               
}
