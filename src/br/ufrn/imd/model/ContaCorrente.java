package br.ufrn.imd.model;

/**
 * Classe para representar uma conta corrente
 * 
 * A classe ContaCorrente possui os atributos agencia, numero e saldo que são do tipo String, String e double, respectivamente.
 * 
 * @author Raquel, Artur
 * @version 1.0
 * @see ITributavel
 * 
 */

public class ContaCorrente implements ITributavel {
    private String agencia;
    private String numero;
    private double saldo;

    /**
     * Construtor padrão
     * 
     * Inicializa os atributos agencia e numero com uma String vazia e o atributo saldo com 0.
     */
    public ContaCorrente() {
        this.agencia = "";
        this.numero = "";
        this.saldo = 0;
    }

    /**
     * Construtor com parâmetros
     * 
     * Inicializa os atributos agencia, numero e saldo com os valores passados como parâmetro.
     * @param agencia
     * @param numero
     * @param saldo
     */
    public ContaCorrente(String agencia, String numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    /**
     * Este método altera o valor do atributo agencia.
     * 
     * @param agencia
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Este método retorna o valor do atributo agencia.
     * 
     * @return agencia
     */
    public String getAgencia() {
        return this.agencia;
    }

    /**
     * Este método altera o valor do atributo numero.
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Este método retorna o valor do atributo numero.
     * @return numero
     */
    public String getNumero() {
        return this.numero;
    }

    /**
     * Este método altera o valor do atributo saldo.
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Este método retorna o valor do atributo saldo.
     * @return saldo
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Este método saca um valor da conta corrente.
     * @param valor
     */
    public void sacar(double valor) {
        saldo -= valor;
    }

    /**
     * Este método deposita um valor na conta corrente.
     * @param valor
     */
    public void depositar(double valor) {
        saldo += valor;
    }

    /**
     * Este método transfere um valor de uma conta corrente para outra.
     * 
     * Caso o saldo da conta corrente seja menor que o valor a ser transferido, o método retorna false.
     * @param valor
     * @param cc
     * @return true ou false
     */
    public boolean transferir(double valor, ContaCorrente cc) {
        if (saldo >= valor) {
            saldo -= valor;
            cc.depositar(valor);
        }
        return (saldo >= valor);    
    }

    /**
     * Este método calcula o valor total de tributos de uma conta corrente.
     * @return tributos
     */
    @Override
    public double calcularTributos() {
        return saldo * (38 / 10000);
    }
}
