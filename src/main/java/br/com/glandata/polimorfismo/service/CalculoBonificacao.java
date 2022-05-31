package br.com.glandata.polimorfismo.service;

import br.com.glandata.polimorfismo.model.Funcionario;
import lombok.Getter;

public class CalculoBonificacao {
	@Getter
	private double totalBonificacao = 0.0f;

	public void registra(Funcionario funcionario) {
		this.totalBonificacao += funcionario.getBonificacao();
	}
	
//	public void registra(Gerente gerente) {
//		this.totalBonificacao += gerente.getBonificacao();
//	}
//	
//	public void registra(EditorVideo editor) {
//		this.totalBonificacao += editor.getBonificacao();
//	}
//	
//	public void registra(Designer designer) {
//		this.totalBonificacao += designer.getBonificacao();
//	}
}
