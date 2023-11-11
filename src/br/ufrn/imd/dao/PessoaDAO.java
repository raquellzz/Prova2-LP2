package br.ufrn.imd.dao;

import java.util.ArrayList;
import br.ufrn.imd.model.Pessoa;

/**
 * Classe para representar uma lista de pessoas
 * 
 * A classe PessoaDAO possui o atributo pessoas que é do tipo ArrayList<Pessoa>.
 * 
 * @author Raquel, Artur
 * @version 1.0
 * @see Pessoa
 * 
 */

public class PessoaDAO {
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    /**
     * Este método cadastra uma pessoa na lista de pessoas.
     * 
     * @param pessoa
     */
    public void cadastraPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    /**
     * Este método remove uma pessoa da lista de pessoas.
     * 
     * @param pessoa
     */
    public void removePessoa(Pessoa pessoa) {
        pessoas.remove(pessoa);
    }

    /**
     * Este método lista as pessoas cadastradas.
     * 
     */
    public void listaPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
    }

    /**
     * Este método calcula o valor total de tributos de cada pessoa cadastrada.
     * 
     */
    public void calcularTributosPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " " + pessoa.calcularTributos());
        }
    }

    // essa função imprime o valor total de imposto a ser recolhido,
    // o nome da pessoa que pagará o maior imposto e o nome
    // do beneficiado com o maior valor de seguro.

    /**
     * Este método imprime o valor total de imposto a ser recolhido, o nome da
     * pessoa que pagará o maior imposto e o nome do beneficiado com o maior valor
     * de seguro.
     * 
     */
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

