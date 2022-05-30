package br.com.glandata.service;

import br.com.glandata.polimorfismo.model.Funcionario;
import lombok.Getter;

public class CalculoBonificacao {
	@Getter
	private float somaBonificacao = 0.0f;

	public void registra(Funcionario funcionario) {
		float bonificacao = funcionario.getBonificacao();
		this.somaBonificacao += bonificacao;
	}
	
//	public void registra(Gerente gerente) {
//		this.somaBonificacao += gerente.getBonificacao();
//	}
//	
//	public void registra(EditorVideo editor) {
//		this.somaBonificacao += editor.getBonificacao();
//	}
//	
//	public void registra(Designer designer) {
//		this.somaBonificacao += designer.getBonificacao();
//	}
}
