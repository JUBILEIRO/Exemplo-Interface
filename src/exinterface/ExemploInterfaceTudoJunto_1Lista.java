/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exinterface;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.ScrollPane;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alunos
 */
public class ExemploInterfaceTudoJunto_1Lista extends JFrame{
  
    private JTable jTable;
    private JScrollPane scroll;
    private DefaultTableModel modelo;
    
 
    public void criarTela(){
        new JFrame("Cadastro De Pessoas");
        setSize(1010,660);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(34, 139, 34));
        criarTabela();
        setVisible(true);
          
    }
    
    public void criarTabela(){
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }   
        };
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Idade");
        modelo.addColumn("CPF");
        modelo.addColumn("RG");
        modelo.addColumn("Etinia");
        modelo.addColumn("UF");
        modelo.addColumn("Cidade");
        modelo.addColumn("Endereço");
        modelo.addColumn("Meio De Locomoção");
        modelo.addColumn("Estado Civil");
        modelo.addColumn("Observações");
       
        
        jTable = new JTable(modelo);
        scroll = new JScrollPane(jTable);
        scroll.setBounds(10, 40, 620, 650);
        add(scroll);
        
        
    }
    
    
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                ExemploInterfaceTudoJunto_1Lista tela = new ExemploInterfaceTudoJunto_1Lista();
                tela.criarTela();
            }
        });
        
    }
    
    private void popularJTable(){
        modelo.setRowCount(0);
        for(int i = 0; i < ExemploInterfaceTudoJunto_1.pessoas.size();i++){
            Pessoa pessoa = ExemploInterfaceTudoJunto_1.pessoas.get(i);
            modelo.addRow(new Object[]{
                pessoa.getCep(),
                pessoa.getCidade(),
                pessoa.getCodigo(),
                pessoa.getComplemento(),
                pessoa.getEstado(),
                pessoa.getEstadoCivil(),
                pessoa.getIdade(),
                pessoa.getNome(),
                pessoa.getNumero(),
                pessoa.getObervacao(),
                pessoa.getRua(),
                pessoa.get(),
                pessoa.get(),
                
                
            });
            jTable.setModel(modelo);
        }
    }
    
    
}
