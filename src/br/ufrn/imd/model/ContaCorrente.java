package br.ufrn.imd.model;

public class ContaCorrente implements ITributavel {
    private String agencia;
    private String numero;
    private double saldo;

    public ContaCorrente() {
        this.agencia = "";
        this.numero = "";
        this.saldo = 0;
    }

    public ContaCorrente(String agencia, String numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean transferir(double valor, ContaCorrente cc) {
        if (saldo >= valor) {
            saldo -= valor;
            cc.depositar(valor);
            return true;
        } else
            return false;
    }

    @Override
    public double calcularTributos() {
        return saldo * (38 / 10000);
    }
}
