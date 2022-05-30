package br.com.glandata.polimorfismo;

import br.com.glandata.polimorfismo.model.Designer;
import br.com.glandata.polimorfismo.model.EditorVideo;
import br.com.glandata.polimorfismo.model.Gerente;
import br.com.glandata.service.CalculoBonificacao;

public class App {
	public static void main(String[] args) {
//		Funcionario funcionario = new Gerente();
//		funcionario.setSalario(5000);
//		 System.out.println(funcionario.getBonificacao());

		Gerente gerente = new Gerente();
		gerente.setNome("Senhor Burns");
		gerente.setSalario(5000.0);
		System.out.println("Gerente autenticado? " + (gerente.auteticarGerente(123456) ? "Sim" : "Não"));

		EditorVideo editor = new EditorVideo();
		editor.setNome("Homer");
		editor.setSalario(2500.0);

		Designer designer = new Designer();
		designer.setNome("Marge");
		designer.setSalario(2000.0);
		
		CalculoBonificacao calculo = new CalculoBonificacao();
		calculo.registra(gerente);
		calculo.registra(editor);
		calculo.registra(designer);
		
		System.out.println("O total pago em bonificação a todos os funcionários foi: R$" + calculo.getTotalBonificacao());
	}
}
