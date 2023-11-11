package br.ufrn.imd.model;

/**
 * Esta classe é responsável por cadastrar e gerar o valor total de tributos de uma pessoa.
 * 
 * A classe Pessoa possui os atributos nome, salario, conta e seguro que são do tipo String, double, ContaCorrente e SeguroVida, respectivamente.
 * 
 * A classe Pessoa implementa a interface ITributavel.
 * 
 * @author Raquel, Artur
 * @version 1.0
 * @see ITributavel
 * 
 */

public class Pessoa implements ITributavel{
    String nome;
    double salario;
    ContaCorrente conta;
    SeguroVida seguro;

    /**
     * Construtor padrão
     * 
     * Inicializa os atributos nome, salario, conta e seguro com uma String vazia, 0, null e null, respectivamente.
     */
    public Pessoa() {
        this.nome = "";
        this.salario = 0;
        this.conta = null;
        this.seguro = null;
    }

    /**
     * Construtor com parâmetros
     * 
     * Inicializa os atributos nome, salario, conta e seguro com os valores passados como parâmetro.
     * @param nome
     * @param salario
     * @param conta
     * @param seguro
     */
    public Pessoa(String nome, double salario, ContaCorrente conta, SeguroVida seguro) {
        this.nome = nome;
        this.salario = salario;
        this.conta = conta;
        this.seguro = seguro;
    }

    /**
     * Este método altera o valor do atributo nome.
     * 
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Este método retorna o valor do atributo nome.
     * 
     * @return nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Este método altera o valor do atributo salario.
     * 
     * @param salario
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Este método retorna o valor do atributo salario.
     * 
     * @return salario
     */
    public double getSalario() {
        return this.salario;
    }

    /**
     * Este método altera o valor do atributo conta.
     * 
     * @param conta
     */
    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    /**
     * Este método retorna o valor do atributo conta.
     * 
     * @return conta
     */
    public ContaCorrente getConta() {
        return this.conta;
    }

    /**
     * Este método altera o valor do atributo seguro.
     * 
     * @param seguro
     */
    public void setSeguro(SeguroVida seguro) {
        this.seguro = seguro;
    }

    /**
     * Este método retorna o valor do atributo seguro.
     * 
     * @return seguro
     */
    public SeguroVida getSeguro() {
        return this.seguro;
    }

    /**
     * Este método calcula o valor total de tributos de uma pessoa.
     * @return valor total de tributos
     */
    public double calcularTributos() {
        return conta.calcularTributos() + seguro.calcularTributos() + (salario * 0.11);
    }
}
