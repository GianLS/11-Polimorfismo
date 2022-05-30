package br.com.glandata.polimorfismo;

import br.com.glandata.polimorfismo.model.Designer;
import br.com.glandata.polimorfismo.model.EditorVideo;
import br.com.glandata.polimorfismo.model.Funcionario;
import br.com.glandata.polimorfismo.model.Gerente;
import br.com.glandata.service.CalculoBonificacao;

public class App {
	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setSalario(5000);
		// System.out.println(funcionario.getBonificacao());

		Gerente gerente = new Gerente();
		gerente.setNome("Scooby Doo");
		gerente.setSalario(5000.00f);
		gerente.setSenha(1234);

		EditorVideo editor = new EditorVideo();
		editor.setNome("Velma");
		editor.setSalario(1200.00f);

		Designer designer = new Designer();
		designer.setNome("Fred");
		designer.setSalario(1500.00f);
		
		CalculoBonificacao calculo = new CalculoBonificacao();
		calculo.registra(gerente);
		calculo.registra(editor);
		calculo.registra(designer);
		
		System.out.println(calculo.getSomaBonificacao());
		

	}
}
