package br.ufrn.imd.model;

public class Pessoa implements ITributavel{
    String nome;
    double salario;
    ContaCorrente conta;
    SeguroVida seguro;

    public Pessoa() {
        this.nome = "";
        this.salario = 0;
        this.conta = null;
        this.seguro = null;
    }

    public Pessoa(String nome, double salario, ContaCorrente conta, SeguroVida seguro) {
        this.nome = nome;
        this.salario = salario;
        this.conta = conta;
        this.seguro = seguro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public ContaCorrente getConta() {
        return this.conta;
    }

    public void setSeguro(SeguroVida seguro) {
        this.seguro = seguro;
    }

    public SeguroVida getSeguro() {
        return this.seguro;
    }

    public double calcularTributos() {
        return conta.calcularTributos() + seguro.calcularTributos() + (salario * 0.11);
    }
}
