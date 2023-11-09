package br.ufrn.imd.controller;

import br.ufrn.imd.model.Pessoa;

public class GeradorImpostoRenda {
    double totalTributo;

    public double calculaValorTotalTributo(Pessoa p) {
        return p.calcularTributos();
    }
}