package br.ufrn.imd.controller;

import br.ufrn.imd.model.Pessoa;

/**
 * Esta classe é responsável por gerar o valor total de tributos de uma pessoa.
 * 
 * A classe GeradorImpostoRenda possui um atributo totalTributo que é do tipo double.
 * 
 * @author Raquel, Artur
 * @version 1.0
 * @see Pessoa
 * 
 */

public class GeradorImpostoRenda {
    double totalTributo;

    /**
     * Este método calcula o valor total de tributos de uma pessoa.
     * @param p
     * @return valor total de tributos
     */
    public double calculaValorTotalTributo(Pessoa p) {
        return p.calcularTributos();
    }
}