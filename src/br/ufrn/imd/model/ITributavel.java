package br.ufrn.imd.model;

/**
 * Interface para tributação de contas e seguros
 *
 * @author Raquel, Artur
 * @version 1.0
 */

public interface ITributavel {
    /**
     * Este método calcula o valor total de tributos de uma pessoa.
     * @return valor total de tributos
     */
    public double calcularTributos();
}
