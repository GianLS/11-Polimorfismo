package br.com.glandata.polimorfismo.model;

public class Gerente extends Funcionario {
	private Integer senha = 123456;

	public Boolean autenticarGerente(Integer senha) {
		return this.senha.equals(senha);
	}

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Gerente");
		return super.getSalario() + super.getBonificacao();
	}
}
