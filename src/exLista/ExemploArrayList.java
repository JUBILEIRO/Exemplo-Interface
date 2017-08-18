/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exLista;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author (name= Cristhian Gustavo Lourenço,date=07-11-2017)
 */
public class ExemploArrayList {
    private ArrayList<String> nomes = new ArrayList<>();
    
    public ExemploArrayList(){
            byte opcao = Byte.parseByte(JOptionPane.showInputDialog(
                   "1 - Adicionar"
                   + "\n2 - Listar" 
                   + "\n3 - Remover" 
                   + "\n4 - Procurar" 
                   + "\n5 - Alterar" 
                   + "\n6 - Sair"));
            while(opcao != 6){
                switch(opcao){
                    case 1:inserir(); 
                    break;                        
                    case 2:listar();
                    break; 
                    case 3:remover();
                    break;
                    case 4:procurar();
                    break;
                    case 5:alterar();
                    break;
                    default: mensagemOpcaoInvalida();     
                }
               
              opcao = Byte.parseByte(JOptionPane.showInputDialog(
                       "1 - Adicionar"
                     + "\n2 - Listar" 
                     + "\n3 - Remover" 
                     + "\n4 - Procurar" 
                     + "\n5 - Alterar" 
                     + "\n6 - Sair"));
                
            }
    }
    
    private void inserir(){
        String nome = JOptionPane.showInputDialog("Informe um nome");
        nomes.add(nome);
        JOptionPane.showMessageDialog(null,nome + "inserido com sucesso");
        
    }
    private void listar(){
        String resultado = "Lista de Nomes: \n";
        for(int i = 0; i < nomes.size(); i++){
            String nome = nomes.get(i);
            resultado += nome + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
       
    }

    private void remover() {
       String nomeProcurado = JOptionPane.showInputDialog("Informe o nome para remover");
       for(int i = 0; i < nomes.size(); i ++){
           String nome = nomes.get(i);
           if(nomeProcurado.equalsIgnoreCase(nome)){
               String novoNome = JOptionPane.showInputDialog("Informe o novo nome");
               nomes.remove(i);
               JOptionPane.showInternalMessageDialog(null, "Nome removido");
               return;
           }   
       }
       JOptionPane.showInternalMessageDialog(null, "Não foi encontrado o nome" + nomeProcurado + "na Lista");
    }

    private void procurar() {
       String nomeProcurado = JOptionPane.showInputDialog("Informe o nome para procurar");
       for(int i = 0; i < nomes.size(); i ++){
           String nome = nomes.get(i);
           if(nomeProcurado.equalsIgnoreCase(nome)){
               JOptionPane.showMessageDialog(null,"Nome entrado");
               return;
           }
       }
       JOptionPane.showInternalMessageDialog(null,"Não foi encontrado o" + nomeProcurado + "na lista");
    }

    private void alterar() {
       String nomeProcurado = JOptionPane.showInputDialog("Informe o nome para procurar");
       for(int i = 0; i < nomes.size(); i ++){
           String nome = nomes.get(i);
           if(nomeProcurado.equalsIgnoreCase(nome)){
               String novoNome = JOptionPane.showInputDialog("Informe o novo nome");
               nomes.set(i, novoNome);
               return;
           }
       }
       JOptionPane.showInternalMessageDialog(null,"Não foi possivel alterar o nome" + nomeProcurado + "na lista");
    }

    private void mensagemOpcaoInvalida() {
       JOptionPane.showMessageDialog(null,"Essa opção é inválida"); 
    }
    
}
    
