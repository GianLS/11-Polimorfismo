package br.com.glandata.polimorfismo.model;

public class EditorVideo extends Funcionario {

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Editor");
		return 220;
	}
}
