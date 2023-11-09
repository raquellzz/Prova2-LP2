package br.ufrn.imd.model;

public class SeguroVida implements ITributavel{
    int numero;
    String beneficiado;
    double valor;
    double taxa;

    public SeguroVida() {
        this.numero = 0;
        this.beneficiado = "";
        this.valor = 0;
        this.taxa = 0;
    }

    public SeguroVida(int numero, String beneficiado, double valor, double taxa) {
        this.numero = numero;
        this.beneficiado = beneficiado;
        this.valor = valor;
        this.taxa = taxa;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setBeneficiado(String beneficiado) {
        this.beneficiado = beneficiado;
    }

    public String getBeneficiado() {
        return this.beneficiado;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return this.taxa;
    }

    @Override
    public double calcularTributos() {
        return 31.50;
    }
}
