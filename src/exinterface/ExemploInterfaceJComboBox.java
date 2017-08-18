package exinterface;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author(name = Jonathan Ortiz Bilk, data=07-06-2017)
 */
public class ExemploInterfaceJComboBox {
    
    private JFrame tela;
    private JComboBox jComboBoxNomes;
    
   public ExemploInterfaceJComboBox(){
       criarTela();
       criarComboBox();
   }
   
    private void criarTela(){
        tela = new JFrame("Exemplo de ComboBox");
        tela.setSize(300,300);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }
    
    private void criarComboBox(){
        String[]nomes = new String[]{
            "Dosolina Piroca Tazinasso",
            "Francisco Zebedeu Sanguessuga",
            "Leonardo Ator Porno",
            "Alex Dogão",
            "Aline Esta Mais Calma",
            "Filipe Pitelzinho",
            "Tati Comendo",
            "Tais Trupada",
            "Donselitos Botelho Grande"
        };
        
        jComboBoxNomes = new JComboBox(nomes);
        jComboBoxNomes.setBounds(10,30,250,25);
        jComboBoxNomes.setSelectedIndex(-1);
        tela.add(jComboBoxNomes);
        
        
     
    }
}