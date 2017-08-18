package exinterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

/**
 *
 * @author(name = name=Cristhian Gustavo Lourenço, data=07-06-2017)
 */
public class ExemploInterfaceSenha {
    
    private JFrame tela;
    private JPasswordField senha;
    private JButton verificar;

    public ExemploInterfaceSenha(){
        criarTela();
        criarJPassword();
    }
    
    
    
    private void criarTela(){
        tela = new JFrame("Exemplo de senha");
        tela.setSize(300,300);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }
    
    public void criarJPassword(){
        JLabel jLabelSenha = new JLabel("Senha");
        jLabelSenha.setBounds(10,10,150,25);
        tela.add(jLabelSenha);
        
        senha = new JPasswordField();
        senha.setBounds(10,45,150,25);
        tela.add(senha);
        
        verificar = new JButton("Verificar");
        verificar.setBounds(10,80,150,25);
             
        verificar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               String senhaDoBilk = "teste";
               char[] senhaDoCampo = senha.getPassword();
               String senhaDoCampoEmString = String.valueOf(senhaDoCampo);
               if(senhaDoBilk.equals(senhaDoCampoEmString)){
                   JOptionPane.showMessageDialog(null,"13 Memo");
               }else{
                   JOptionPane.showMessageDialog(null,"8:7 teste");
               }
               
               /*
               if(String.valueOf(senha.getPassword()).equals("casa do bilk")){
                  System.out.println("Oloko");
               }else{
               System.out.println("errrroooooo");
               }
               */
            }
        });
                
        tela.add(verificar);        
    }
    
}
