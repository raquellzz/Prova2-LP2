package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.model.Pessoa;

public class PessoaDAO {
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void cadastraPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removePessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    public void listaPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
    }

    public void calcularTributosPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " " + pessoa.calcularTributos());
        }
    }

    // essa função imprime o valor total de imposto a ser recolhido,
    // o nome da pessoa que pagará o maior imposto e o nome
    // do beneficiado com o maior valor de seguro.

    public void imprimeImpostoTotal() {
        double total = 0;
        double maiorImposto = 0;
        String nomeMaiorImposto = "";
        double maiorSeguro = 0;
        String nomeMaiorSeguro = "";

        for (Pessoa pessoa : pessoas) {
            total += pessoa.calcularTributos();

            if (pessoa.calcularTributos() > maiorImposto) {
                maiorImposto = pessoa.calcularTributos();
                nomeMaiorImposto = pessoa.getNome();
            }

            if (pessoa.getSeguro().getValor() > maiorSeguro) {
                maiorSeguro = pessoa.getSeguro().getValor();
                nomeMaiorSeguro = pessoa.getSeguro().getBeneficiado();
            }
        }

        System.out.println("Total de imposto a ser recolhido: " + total);
        System.out.println("Nome da pessoa que pagará o maior imposto: " + nomeMaiorImposto);
        System.out.println("Nome do beneficiado com o maior valor de seguro: " + nomeMaiorSeguro);
    }

}

