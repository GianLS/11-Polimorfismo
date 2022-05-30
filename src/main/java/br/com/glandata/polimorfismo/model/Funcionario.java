package br.com.glandata.polimorfismo.model;

import lombok.Getter;
import lombok.Setter;

public class Funcionario {
	@Getter
	@Setter
	private String nome;

	@Getter
	@Setter
	private double salario;

	/**
	 * Gera a bonificacao do Funcionário
	 * @return Valor da Bonificação
	 */
	public double getBonificacao() {
		return this.salario * 0.15;
	}

}
