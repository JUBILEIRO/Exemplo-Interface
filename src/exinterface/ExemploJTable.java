package exinterface;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 * @author (name=Cristhian Gustavo Lourenço, date=07-12-2017)
 */
public class ExemploJTable extends JFrame{
    private ArrayList<MinhaPessoa> pessoas; 
    private JTable jTable;
    private JScrollPane scroll;
    private JButton popular, limpar, remover, inserir, alterar, cancelar;
    private JTextField nome, valor, idade;
    private DefaultTableModel modelo;
    
    public ExemploJTable(){
        pessoas = new ArrayList<>();
    }
    
    
    public void selecionarParaAlterar(){
        jTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
            int linhaSelecionada = jTable.getSelectedRow();
            if(linhaSelecionada > -1){
                String nomeDaTabela = modelo.getValueAt(linhaSelecionada, 0).toString();
                byte idadeDaTabela = Byte.parseByte(modelo.getValueAt(linhaSelecionada, 1).toString());
                float valorDaTabela = Float.parseFloat(modelo.getValueAt(linhaSelecionada, 2).toString());
                nome.setText(nomeDaTabela);
                idade.setText(String.valueOf(idadeDaTabela));
                valor.setText(String.valueOf(valorDaTabela));
                alterar.setVisible(true);
                inserir.setVisible(false);
            }
        }
    });
    }
    
    public void criarTela(){
        setSize(700, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        criarCampos();
        criarTabela();
        criarBotoes();
        selecionarParaAlterar();
        
        setVisible(true);
    }

    private void criarCampos() {
        MeuJLabel jLabel = new MeuJLabel("Nome", 10, 10, 50, 20);
        jLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(jLabel);
        nome = new JTextField();
        nome.setBounds(60, 10, 170, 20);
        add(nome);
        jLabel = new MeuJLabel("Idade", 240, 10, 60, 20);
        jLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(jLabel);
        idade = new JTextField();
        idade.setBounds(300, 10, 50, 20);
        add(idade);
        jLabel = new MeuJLabel("Valor", 360, 10, 60, 20);
        jLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(jLabel);
        valor = new JTextField();
        valor.setBounds(420, 10, 100, 20);
        add(valor);
        
        
    }
    
    private void criarBotoes() {
        inserir = new JButton("Adicionar");
        inserir.setBounds(530, 10, 100, 20);
        inserir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                inserirPessoa();
            }
        });
        add(inserir);
        
        remover = new JButton("Remover");
        remover.setBounds(10, 350, 130, 20);
        remover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirItem();
            }
        });
        add(remover);
        
        limpar = new JButton("Limpar");
        limpar.setBounds(150, 350, 130, 20);
        limpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparTudo();
            }
        });
        add(limpar);
        
        alterar = new JButton("Alterar");
        alterar.setBounds(530, 10, 100, 20);
        alterar.setVisible(false);
        alterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alterar();
            }
        });
        add(alterar);
                
        alterar.setVisible(false);
        inserir.setVisible(true);
    }
    
    private void alterar(){
        if(nome.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nome não pode ser vazio");
            return;
        }
        try{
            String nome = this.nome.getText();
            byte idade = Byte.parseByte(this.idade.getText());
            float valor = Float.parseFloat(this.valor.getText());

            int linhaSelecionada = jTable.getSelectedRow();
            MinhaPessoa pessoa = pessoas.get(linhaSelecionada);
            pessoa.setNome(nome);
            pessoa.setIdade(idade);
            pessoa.setPreco(valor);
            pessoas.set(linhaSelecionada, pessoa);

            modelo.setValueAt(nome, linhaSelecionada, 0);
            modelo.setValueAt(idade, linhaSelecionada, 1);
            modelo.setValueAt(valor, linhaSelecionada, 2);

            alterar.setVisible(false);
            inserir.setVisible(true);
            limparComponentes();
            jTable.clearSelection();
            JOptionPane.showMessageDialog(null, nome + " alterado com sucesso!");
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Idade ou valor informado é inválido");
        }
    }
    
    private void excluirItem(){
        /*int linhaSelecionada = jTable.getSelectedRow();
        if(linhaSelecionada > -1){
            String nome = jTable.getValueAt(linhaSelecionada, 0).toString();
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir " + nome, "Cuidado", JOptionPane.OK_CANCEL_OPTION);   
            if(opcao == JOptionPane.OK_OPTION){
                pessoas.remove(linhaSelecionada);
                modelo.removeRow(linhaSelecionada);
                limparComponentes();
                inserir.setVisible(true);
                alterar.setVisible(false);
                JOptionPane.showMessageDialog(null, "Excluido o " + nome + " com sucesso!!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione o registro desejado para a exclusão", "Aviso", JOptionPane.ERROR_MESSAGE);
        }*/
        
        
        int[] linhasSelecionadas = jTable.getSelectedRows();
        if(linhasSelecionadas.length > 0){
            for(int i = linhasSelecionadas.length - 1; i > -1; i++){
                int linhaSelecionada = linhasSelecionadas[i];
                excluir(linhaSelecionada);
            }
            limparComponentes();
            inserir.setVisible(true);
            alterar.setVisible(false);
            jTable.clearSelection();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione o registro desejado para a exclusão", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        

    }
    
    public void excluir(int linhaSelecionada){
        String nome = jTable.getValueAt(linhaSelecionada, 0).toString();
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir " + nome, "Cuidado", JOptionPane.OK_CANCEL_OPTION);
        
    }
    
    private void limparTudo(){
        pessoas.clear();
        modelo.setRowCount(0);
        limparComponentes();
    }
    
    public void inserirPessoa(){
        if(nome.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nome não pode ser vazio");
            return;
        }
        MinhaPessoa pessoa = new MinhaPessoa();
        pessoa.setNome(nome.getText());
        try{
        pessoa.setIdade(Byte.parseByte(idade.getText()));
        pessoa.setPreco(Float.parseFloat(valor.getText()));
        pessoas.add(pessoa);
        popularJTable();
        limparComponentes();
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor ou idade informada é inválida");
        }
    }
    
    private void criarTabela() {
       modelo = new DefaultTableModel(){
           @Override
           public boolean isCellEditable(int row, int column){
               return false;
           }
       };
       modelo = new DefaultTableModel();
       modelo.addColumn("Nome");
       modelo.addColumn("Idade");
       modelo.addColumn("Valor");
       jTable = new JTable(modelo);
       scroll = new JScrollPane(jTable);
       scroll.setBounds(10, 40, 680, 300);
       add(scroll);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                ExemploJTable tela = new ExemploJTable();
                tela.criarTela();
            }
        });
        
    }
    
    private void popularJTable(){
        modelo.setRowCount(0);
        for(int i = 0; i < pessoas.size();i++){
            MinhaPessoa pessoa = pessoas.get(i);
            modelo.addRow(new Object[]{
                pessoa.getNome(),
                pessoa.getIdade(),
                pessoa.getPreco()
            });
            jTable.setModel(modelo);
        }
    }
    
    private void limparComponentes(){
        nome.setText("");
        valor.setText("");
        idade.setText("");
    }
    
    public class MinhaPessoa{
        private String nome;
        private float preco;
        private byte idade;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public float getPreco() {
            return preco;
        }

        public void setPreco(float preco) {
            this.preco = preco;
        }

        public byte getIdade() {
            return idade;
        }

        public void setIdade(byte idade) {
            this.idade = idade;
        }
        
    }
   
}
