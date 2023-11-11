package br.ufrn.imd.model;

/**
 * Classe que representa um seguro de vida.
 * 
 * Um seguro de vida possui um número, um beneficiado, um valor e uma taxa.
 * 
 * A classe SeguroVida implementa a interface ITributavel.
 * 
 * @author Raquel, Artur
 * @version 1.0
 * @see ITributavel
 * 
 */

public class SeguroVida implements ITributavel{
    int numero;
    String beneficiado;
    double valor;
    double taxa;

    /**
     * Construtor padrão
     * 
     * Inicializa os atributos numero, beneficiado, valor e taxa com 0, uma String vazia, 0 e 0, respectivamente.
     */
    public SeguroVida() {
        this.numero = 0;
        this.beneficiado = "";
        this.valor = 0;
        this.taxa = 0;
    }

    /**
     * Construtor com parâmetros
     * 
     * Inicializa os atributos numero, beneficiado, valor e taxa com os valores passados como parâmetro.
     * @param numero
     * @param beneficiado
     * @param valor
     * @param taxa
     */
    public SeguroVida(int numero, String beneficiado, double valor, double taxa) {
        this.numero = numero;
        this.beneficiado = beneficiado;
        this.valor = valor;
        this.taxa = taxa;
    }

    /**
     * Este método altera o valor do atributo numero.
     * 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Este método retorna o valor do atributo numero.
     * @return numero
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     * Este método altera o valor do atributo beneficiado.
     * 
     * @param beneficiado
     */
    public void setBeneficiado(String beneficiado) {
        this.beneficiado = beneficiado;
    }

    /**
     * Este método retorna o valor do atributo beneficiado.
     * 
     * @return beneficiado
     */
    public String getBeneficiado() {
        return this.beneficiado;
    }

    /**
     * Este método altera o valor do atributo valor.
     * 
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Este método retorna o valor do atributo valor.
     * 
     * @return valor
     */
    public double getValor() {
        return this.valor;
    }

    /**
     * Este método altera o valor do atributo taxa.
     * 
     * @param taxa
     */
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    /**
     * Este método retorna o valor do atributo taxa.
     * 
     * @return taxa
     */
    public double getTaxa() {
        return this.taxa;
    }

    /**
     * Este método calcula o valor total de tributos de uma pessoa.
     * 
     * @return valor total de tributos
     */
    @Override
    public double calcularTributos() {
        return 31.50;
    }
}
