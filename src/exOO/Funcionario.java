/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exOO;

/**
 *
 * @author Aluno: Cristhian Gustavo Lourenço, Data: 07/12/2017
 */
public class Funcionario extends Pessoa{
    
    private int cargaHoraria, codigo;
    private float salario, valorHora;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    private String numeroCarteiraTrabalho, profissao;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public String getNumeroCarteiraTrabalho() {
        return numeroCarteiraTrabalho;
    }

    public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
        this.numeroCarteiraTrabalho = numeroCarteiraTrabalho;
    }
    
   
    
}
