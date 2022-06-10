package br.com.generation.exercicio01;
import java.util.Scanner;
public class ManupulandoCliente {
	static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		Cliente compra = new Cliente();
		System.out.println("Digite o nome do cliente: ");
		compra.setNome(sc.next());
		System.out.println("Digite sua acompra: ");
		compra.setComprou(sc.next());
		System.out.println("Digite a plataforma Ex. PS4, Xbox...");
		compra.setModelo(sc.next());
		System.out.println("Digite a quantidade: ");
		compra.setQuantidade(sc.nextInt());
		
		System.out.println();
		
		System.out.println("Lista de compras a baixo!!");
		System.out.println(compra.getNome());
		System.out.println(compra.getComprou());
		System.out.println(compra.getModelo());
		System.out.println(compra.getQuantidade());

	}

}
