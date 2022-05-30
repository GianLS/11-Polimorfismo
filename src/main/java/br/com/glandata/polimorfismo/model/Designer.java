package br.com.glandata.polimorfismo.model;

public class Designer extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Designer");
		return 300;
	}
}
