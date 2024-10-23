package main;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// criando novo objeto dando valor aos atributos
		ProdutoAlimenticio p1 = new ProdutoAlimenticio("Arroz", 10f, 35f, 200, 20, 5, 40, LocalDate.of(2024, 12, 31));
		ProdutoVestuario p2 = new ProdutoVestuario("Camisa", 100f, 300f, "M", "Branco", "Algodão");
		// imprimindo as informações formatadas de cada objeto
		System.out.println(p1.descricao());
		p1.CalcularLucro(); // faz o metodo de calcular o lucro com o novo objeto
		System.out.println(p1.salvarProduto(1));// mostra o codigo para implementar no banco de dados com o id 1
		System.out.println(p1.atualizarProduto(1));
		System.out.println(p1.deletarProduto(1));
		
		System.out.println("\n========================\n");
		
		System.out.println(p2.descricao());
		p2.CalcularLucro();
		System.out.println(p2.salvarProduto(2));
		System.out.println(p2.atualizarProduto(2));
		System.out.println(p2.deletarProduto(2));
	}

}
