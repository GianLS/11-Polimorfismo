package br.com.glandata.polimorfismo.model;

import lombok.Getter;
import lombok.Setter;

public class Gerente extends Funcionario {
	@Getter
	@Setter
	private Integer senha;

	public Boolean auteticarGerente(Integer senha) {
		return this.senha.equals(senha);
	}

	@Override
	public float getBonificacao() {
		return super.getSalario() + super.getBonificacao();
	}
}
