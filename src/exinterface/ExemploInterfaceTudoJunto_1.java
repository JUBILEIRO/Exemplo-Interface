package exinterface;



/**
 * @author (name= Cristhian Gustavo Lourenço,date=07-11-2017)
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class ExemploInterfaceTudoJunto_1 {
    
    //Array seria um tipo de vetor que se expandi sozinho.
    public static ArrayList<Pessoa>pessoas;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExemploInterfaceTudoJunto_1();
            }
        });
    }

    private JFrame tela;
    private JLabel jLabelCodigo;
    private JTextField jTextFieldNome, jTextFieldIdade, jTextFieldRua, jTextFieldBairro, jTextFieldNumero,
            jTextFieldComplemento, jTextFieldCEP;
    private JFormattedTextField jFormattedTextFieldCPF, jFormattedTextFieldRG;
    private JComboBox jComboBoxEstado, jComboBoxCidade, jComboBoxEtnia;
    private JTextArea jTextAreaObservacao;
    private JCheckBox jCheckBoxCarro, jCheckBoxMoto;
    private JRadioButton jRadioButtonSozinho, jRadioButtonCasado, jRadioButtonViuvo, jRadioButtonUniaoEstavel, jRadioButtonDivorciado;
    private JButton jButtonSalvar, jButtonCancelar, jButtonSair, jButtonMinimizar, jButtonMaximizar;

    public ExemploInterfaceTudoJunto_1() {
        criarTela();
        criarBotoesAcaoSuperUsuario();
        criarCampos();
        pessoas = new ArrayList();
    }

    private void criarTela() {
        tela = new JFrame("Exemplo de Tudo Junto");
        tela.setSize(800, 800);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setUndecorated(true);

        tela.getContentPane()
                .setBackground(new Color(60 179 113));
        tela.setVisible(true);
    }

    private void criarBotoesAcaoSuperUsuario() {
        jButtonSair = new JButton("x");
        jButtonMinimizar = new JButton("_");
        jButtonMaximizar = new JButton("[]");

        jButtonSair.setBounds(
                tela.getWidth() - 50, 0, 50, 50);
        jButtonMaximizar.setBounds(
                jButtonSair.getX() - 50, 0, 50, 50);
        jButtonMinimizar.setBounds(
                jButtonMaximizar.getX() - 50, 0, 50, 50);

        tela.add(jButtonSair);
        tela.add(jButtonMaximizar);
        tela.add(jButtonMinimizar);

        jButtonSair.addActionListener((ActionEvent e) -> {
            tela.dispose();
        });
        jButtonMinimizar.addActionListener((ActionEvent e) -> {
            tela.setState(JFrame.ICONIFIED);
        });
        jButtonMaximizar.addActionListener((ActionEvent e) -> {
            if (tela.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                tela.setExtendedState(JFrame.NORMAL);
            } else if (tela.getExtendedState() == JFrame.NORMAL) {
                tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    private void criarCampos() {
        Font minhaFonte = new Font("IMPACT", Font.PLAIN, 24);
        JLabel jLabelApreCodigo = new JLabel("Código");
        jLabelApreCodigo.setBounds(10, 60, 100, 25);
        jLabelApreCodigo.setFont(minhaFonte);
        jLabelApreCodigo.setForeground(Color.BLACK);
        tela.add(jLabelApreCodigo);

        jLabelCodigo = new JLabel();
        jLabelCodigo.setBounds(120, 60, 100, 25);
        jLabelCodigo.setForeground(Color.BLACK);
        jLabelCodigo.setFont(minhaFonte);
        tela.add(jLabelCodigo);

        JLabel jLabelNome = new JLabel("Nome");
        jLabelNome.setBounds(230, 60, 50, 25);
        jLabelNome.setForeground(Color.BLACK);
        jLabelNome.setFont(minhaFonte);
        tela.add(jLabelNome);

        jTextFieldNome = new JTextField();
        jTextFieldNome.setBounds(295, 60, 200, 25);
        jTextFieldNome.setFont(minhaFonte);
        tela.add(jTextFieldNome);

        JLabel jLabelIdade = new JLabel("Idade");
        jLabelIdade.setBounds(550, 60, 60, 25);
        jLabelIdade.setForeground(Color.BLACK);
        jLabelIdade.setFont(minhaFonte);
        tela.add(jLabelIdade);

        jTextFieldIdade = new JTextField();
        jTextFieldIdade.setBounds(620, 60, 50, 25);
        jTextFieldIdade.setFont(minhaFonte);
        tela.add(jTextFieldIdade);

        JLabel jLabelCPF = new JLabel("CPF");
        jLabelCPF.setBounds(10, 95, 80, 25);
        jLabelCPF.setFont(minhaFonte);
        jLabelCPF.setForeground(Color.BLACK);
        tela.add(jLabelCPF);

        try {
            MaskFormatter mascara = new MaskFormatter("###.###.###-##");
            jFormattedTextFieldCPF
                    = new JFormattedTextField(mascara);
            jFormattedTextFieldCPF.setBounds(90, 95, 130, 25);
            jFormattedTextFieldCPF.setFont(minhaFonte);
            tela.add(jFormattedTextFieldCPF);
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(null, pe.getMessage());
            tela.dispose();
        }

        JLabel jLabelRG = new JLabel("RG");
        jLabelRG.setBounds(230, 95, 80, 25);
        jLabelRG.setFont(minhaFonte);
        jLabelRG.setForeground(Color.BLACK);
        tela.add(jLabelRG);

        try {
            MaskFormatter mascara = new MaskFormatter("#.###-###");
            jFormattedTextFieldRG = new JFormattedTextField(mascara);
            jFormattedTextFieldRG.setBounds(320, 95, 130, 25);
            jFormattedTextFieldRG.setFont(minhaFonte);
            tela.add(jFormattedTextFieldRG);
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(null, pe.getMessage());
            tela.dispose();
        }

        JLabel jLabelEtnia = new JLabel("Etnia");
        jLabelEtnia.setBounds(10, 130, 80, 20);
        jLabelEtnia.setFont(minhaFonte);
        jLabelEtnia.setForeground(Color.BLACK);
        tela.add(jLabelEtnia);

        String[] etnias = new String[]{
            "Quechua",
            "Huarpe",
            "Atsua",
            "Babi",
            "Wayapi"
        };
        jComboBoxEtnia = new JComboBox(etnias);
        jComboBoxEtnia.setBounds(90, 130, 130, 25);
        jComboBoxEtnia.setSelectedIndex(-1);
        tela.add(jComboBoxEtnia);

        String[] estados = new String[]{
            "SC",
            "RS",
            "PR"
        };

        JLabel jLabelEstado = new JLabel("UF");
        jLabelEstado.setBounds(230, 130, 80, 20);
        jLabelEstado.setFont(minhaFonte);
        jLabelEstado.setForeground(Color.BLACK);
        tela.add(jLabelEstado);

        jComboBoxEstado = new JComboBox(estados);
        jComboBoxEstado.setBounds(320, 130, 130, 25);
        jComboBoxEstado.setSelectedIndex(-1);
        jComboBoxEstado.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    JComboBox jComboBox = (JComboBox) e.getSource();
                    
                    switch ((String) jComboBox.getSelectedItem()){
                        case "RS": popularRS();
                            break;
                        case "PR": popularPR();
                            break;
                        case "SC": popularSC();
                            break;
                    }
                }
            }
        });
        tela.add(jComboBoxEstado);
        
        JLabel jLabelCidade = new JLabel("Cidade");
        jLabelCidade.setBounds(460, 130, 80, 20);
        jLabelCidade.setFont(minhaFonte);
        jLabelCidade.setForeground(Color.BLACK);
        tela.add(jLabelCidade);

        jComboBoxCidade = new JComboBox();
        jComboBoxCidade.setBounds(550, 130, 160, 25);
        tela.add(jComboBoxCidade);

        JLabel jLabelEndereco = new JLabel("Endereço:");
        jLabelEndereco.setBounds(10, 155, 100, 25);
        jLabelEndereco.setForeground(Color.GREEN);
        tela.add(jLabelEndereco);

        JLabel jLabelRua = new JLabel("Rua:");
        jLabelRua.setBounds(10, 190, 35, 25);
        jLabelRua.setForeground(Color.BLACK);
        tela.add(jLabelRua);

        jTextFieldRua = new JTextField();
        jTextFieldRua.setBounds(45, 190, 200, 25);
        tela.add(jTextFieldRua);

        JLabel jLabelCEP = new JLabel("CEP:");
        jLabelCEP.setBounds(255, 190, 35, 25);
        jLabelCEP.setForeground(Color.BLACK);
        tela.add(jLabelCEP);

        jTextFieldCEP = new JTextField();
        jTextFieldCEP.setBounds(290, 190, 100, 25);
        tela.add(jTextFieldCEP);

        JLabel jLabelNumero = new JLabel("Número:");
        jLabelNumero.setBounds(400, 190, 80, 25);
        jLabelNumero.setForeground(Color.BLACK);
        jLabelNumero.setHorizontalAlignment(JLabel.RIGHT);
        tela.add(jLabelNumero);

        jTextFieldNumero = new JTextField();
        jTextFieldNumero.setBounds(490, 190, 100, 25);
        tela.add(jTextFieldNumero);

        JLabel jLabelBairro = new JLabel("Bairro");
        jLabelBairro.setBounds(10, 225, 50, 25);
        jLabelBairro.setHorizontalAlignment(JLabel.RIGHT);
        jLabelBairro.setForeground(Color.BLACK);
        tela.add(jLabelBairro);

        jTextFieldBairro = new JTextField();
        jTextFieldBairro.setBounds(70, 225, 100, 25);
        tela.add(jTextFieldBairro);

        JLabel jLabelComplemento = new JLabel("Complemento");
        jLabelComplemento.setBounds(180, 225, 100, 25);
        jLabelComplemento.setHorizontalAlignment(JLabel.RIGHT);
        jLabelComplemento.setForeground(Color.BLACK);
        tela.add(jLabelComplemento);

        jTextFieldComplemento = new JTextField();
        jTextFieldComplemento.setBounds(290, 225, 150, 25);
        tela.add(jTextFieldComplemento);

        JLabel jLabelMeioLocomocao = new JLabel("Meio Locomoção");
        jLabelMeioLocomocao.setFont(minhaFonte);
        jLabelMeioLocomocao.setForeground(Color.BLACK);
        jLabelMeioLocomocao.setBounds(10, 260, 150, 25);
        tela.add(jLabelMeioLocomocao);

        jCheckBoxCarro = new JCheckBox("Carro");
        jCheckBoxCarro.setBounds(10, 295, 120, 25);
        jCheckBoxCarro.setOpaque(false);
        jCheckBoxCarro.setFont(minhaFonte);
        jCheckBoxCarro.setForeground(Color.BLACK);
        tela.add(jCheckBoxCarro);

        jCheckBoxMoto = new JCheckBox("Moto");
        jCheckBoxMoto.setBounds(140, 295, 130, 25);
        jCheckBoxMoto.setOpaque(false);
        jCheckBoxMoto.setFont(minhaFonte);
        jCheckBoxMoto.setForeground(Color.BLACK);
        tela.add(jCheckBoxMoto);

        JLabel jLabelEstadoCivil = new JLabel("Estado Cívil:");
        jLabelEstadoCivil.setBounds(10, 330, 130, 25);
        jLabelEstadoCivil.setFont(minhaFonte);
        jLabelEstadoCivil.setForeground(Color.GREEN);
        tela.add(jLabelEstadoCivil);

        jRadioButtonSozinho = new JRadioButton("Solteiro");
        jRadioButtonSozinho.setBounds(10, 365, 110, 25);
        jRadioButtonSozinho.setOpaque(false);
        jRadioButtonSozinho.setFont(minhaFonte);
        jRadioButtonSozinho.setForeground(Color.BLACK);
        tela.add(jRadioButtonSozinho);

        jRadioButtonCasado = new JRadioButton("Casado");
        jRadioButtonCasado.setBounds(130, 365, 120, 25);
        jRadioButtonCasado.setOpaque(false);
        jRadioButtonCasado.setFont(minhaFonte);
        jRadioButtonCasado.setForeground(Color.BLACK);
        tela.add(jRadioButtonCasado);

        jRadioButtonViuvo = new JRadioButton("Viúvo");
        jRadioButtonViuvo.setBounds(260, 365, 100, 25);
        jRadioButtonViuvo.setOpaque(false);
        jRadioButtonViuvo.setFont(minhaFonte);
        jRadioButtonViuvo.setForeground(Color.BLACK);
        tela.add(jRadioButtonViuvo);

        jRadioButtonUniaoEstavel = new JRadioButton("União Estável");
        jRadioButtonUniaoEstavel.setBounds(370, 365, 160, 25);
        jRadioButtonUniaoEstavel.setOpaque(false);
        jRadioButtonUniaoEstavel.setForeground(Color.BLACK);
        jRadioButtonUniaoEstavel.setFont(minhaFonte);
        tela.add(jRadioButtonUniaoEstavel);

        jRadioButtonDivorciado = new JRadioButton("Divorciado");
        jRadioButtonDivorciado.setBounds(540, 365, 120, 25);
        jRadioButtonDivorciado.setOpaque(false);
        jRadioButtonDivorciado.setForeground(Color.BLACK);
        jRadioButtonDivorciado.setFont(minhaFonte);
        tela.add(jRadioButtonDivorciado);

        ButtonGroup bt = new ButtonGroup();
        bt.add(jRadioButtonCasado);
        bt.add(jRadioButtonDivorciado);
        bt.add(jRadioButtonSozinho);
        bt.add(jRadioButtonUniaoEstavel);
        bt.add(jRadioButtonViuvo);
        
        JLabel JLabelObservacao = new JLabel("Observação");
        JLabelObservacao.setBounds(10, 400, 140, 25);
        JLabelObservacao.setForeground(Color.BLACK);
        JLabelObservacao.setFont(minhaFonte);
        tela.add(JLabelObservacao);

        jTextAreaObservacao = new JTextArea();
        jTextAreaObservacao.setLineWrap(true);
        JScrollPane scroll = new JScrollPane(jTextAreaObservacao);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(10, 435, 500, 300);
        tela.add(scroll);

        jButtonCancelar = new JButton("Cancelar");
        jButtonCancelar.setBounds(10, 745, 140, 35);
        jButtonCancelar.setForeground(Color.BLACK);
        jButtonCancelar.setBackground(Color.DARK_GRAY);
        jButtonCancelar.setFont(minhaFonte);
        jButtonCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tela.dispose();
            }
        });
        tela.add(jButtonCancelar);

        jButtonSalvar = new JButton("Salvar");
        jButtonSalvar.setBounds(160, 745, 140, 35);
        jButtonSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               byte estadoCivil = -1; 
               if(jRadioButtonCasado.isSelected()){
                   estadoCivil = Pessoa.ESTADO_CIVIL_CASADO;
                }else if(jRadioButtonSozinho.isSelected()){
                   estadoCivil = Pessoa.ESTADO_CIVIL_SOLTEIRO;
                }else if(jRadioButtonSozinho.isSelected()){
                   estadoCivil = Pessoa.ESTADO_CIVIL_VIUVO;
                }else if(jRadioButtonSozinho.isSelected()){
                   estadoCivil = Pessoa.ESTADO_CIVIL_DIVORCIADO;
                }else if(jRadioButtonSozinho.isSelected()){
                   estadoCivil = Pessoa.ESTADO_CIVIL_UNIAO_ESTAVEL;
                }
               
               Pessoa minhaPessoa = new Pessoa(
               jTextFieldNome.getText(),
               jTextAreaObservacao.getText(),
               jFormattedTextFieldCPF.getText(),
               jFormattedTextFieldRG.getText(),
               jCheckBoxCarro.isSelected(),
               jCheckBoxMoto.isSelected(),
               (String)jComboBoxEstado.getSelectedItem(),
               (String)jComboBoxCidade.getSelectedItem(),
               jTextFieldRua.getText(),
               jTextFieldComplemento.getText(),
               jTextFieldNumero.getText(),
               jTextFieldCEP.getText(),
               Byte.parseByte(jTextFieldIdade.getText()),
               estadoCivil);
            }
        });
        tela.add(jButtonSalvar);

    }
    
    public void popularSC(){
        String[] cidades = new String[]{"Indaial","Agrolandia","Ascurra","Ibirama","Vitor Meireless","Capivara"};
        Arrays.sort(cidades);
        jComboBoxCidade.removeAllItems();
        jComboBoxCidade.setModel(new DefaultComboBoxModel(cidades));
    }
    
     public void popularPR(){
        String[] cidades = new String[]{"Pato Branco","Mangueirinha","Londrina","Curitiba","Cascável","Araucária"};
        Arrays.sort(cidades);
        jComboBoxCidade.removeAllItems();
        jComboBoxCidade.setModel(new DefaultComboBoxModel(cidades));
    }
     
     public void popularRS(){
        String[] cidades = new String[]{"Canela","Gramado","São Gabriel","Porto Alegre","Pelotas","Caixias do Sul"};
        Arrays.sort(cidades, Collections.reverseOrder());
        jComboBoxCidade.removeAllItems();
        jComboBoxCidade.setModel(new DefaultComboBoxModel(cidades));
    } 

}
