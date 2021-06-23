package View;

import java.util.Scanner;

import Controller.FormaController;
import Models.Circulo;
import Models.Triangulo;
import View.Principal;
import Controller.FormaController;

public class CadastrarTriangulo {
	
	public static void Menu() {
		int opcao,triangulo;
		Scanner sc = new Scanner(System.in);

		
		int altura;
		int base;
		
		do {
			System.out.println("\n-- PROJETO DE PROVA --\n");
			System.out.println("1 - Cadastrar Triangulo");
				
			System.out.println("Digite a altura: ");
			System.out.println("Digite a base: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("\n-- CADASTRAR TRIANGULO --\n");
				System.out.println("Digite a altura:");
				System.out.println("Digite a largura:");
				triangulo = sc.nextInt();
				
				Triangulo Triangulo = new Triangulo();
				FormaController.Cadastro(Triangulo);
				default:
				System.out.println("\nOpção inválida!");
				break;
			}
		} while (opcao != 0);

		sc.close();
	}

}
