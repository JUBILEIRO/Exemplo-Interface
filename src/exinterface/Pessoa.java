/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exinterface;

/**
 * @author (name= Cristhian Gustavo Lourenço,date=07-11-2017)
 */
public class Pessoa {
    
    public static byte
            ESTADO_CIVIL_SOLTEIRO = 0,
            ESTADO_CIVIL_CASADO = 1,
            ESTADO_CIVIL_UNIAO_ESTAVEL = 2,
            ESTADO_CIVIL_DIVORCIADO = 3,
            ESTADO_CIVIL_VIUVO = 4;
   
    private String nome, obervacao;
    private boolean possuiCarro, possuiMoto;
    private String estado, cidade, rua, complemento, numero, cep;
    private int idade, estadoCivil;
    private static int codigoIncremental;
    private final int codigo;

    public Pessoa(String nome, String observacao, String cpf, String rg, boolean possuiCarro, boolean possuiMoto, String estado, String cidade, String rua, String complemento, String numero, String cep, byte idade, byte estadoCivil) {
        this.nome = nome;
        this.obervacao = obervacao;
        this.possuiCarro = possuiCarro;
        this.possuiMoto = possuiMoto;
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.complemento = complemento;
        this.numero = numero;
        this.cep = cep;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
        
        codigo = codigoIncremental++;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObervacao() {
        return obervacao;
    }

    public void setObervacao(String obervacao) {
        this.obervacao = obervacao;
    }

    public boolean isPossuiCarro() {
        return possuiCarro;
    }

    public void setPossuiCarro(boolean possuiCarro) {
        this.possuiCarro = possuiCarro;
    }

    public boolean isPossuiMoto() {
        return possuiMoto;
    }

    public void setPossuiMoto(boolean possuiMoto) {
        this.possuiMoto = possuiMoto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(byte estadoCivil) {
        if((estadoCivil != ESTADO_CIVIL_CASADO)
            &&(estadoCivil != ESTADO_CIVIL_DIVORCIADO)      
            &&(estadoCivil != ESTADO_CIVIL_SOLTEIRO)      
            &&(estadoCivil != ESTADO_CIVIL_VIUVO)      
            &&(estadoCivil != ESTADO_CIVIL_UNIAO_ESTAVEL)){
            throw new IllegalArgumentException("Estado Cívil inválida");
        }      
        this.estadoCivil = estadoCivil;
    }   
}
