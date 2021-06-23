package View;

import java.util.Scanner;

import Controller.FormaController;
import Models.Circulo;
import Models.Retangulo;
import View.Principal;
import Controller.FormaController;

public class CadastrarRetanculo {
	
		public static void Menu() {
		int opcao,retangulo;
		Scanner sc = new Scanner(System.in);

		
		int altura;
		int largura;
		
		do {
			System.out.println("\n-- PROJETO DE PROVA --\n");
			System.out.println("2 - Cadastrar Retangulo");
				
			System.out.println("Digite a altura: ");
			System.out.println("Digite a largura: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 2:
				System.out.println("\n-- CADASTRAR RETANGULO --\n");
				System.out.println("Digite a altura:");
				System.out.println("Digite a largura:");
				retangulo = sc.nextInt();
				
				Retangulo Retangulo = new Retangulo();
				FormaController.Cadastro(Retangulo);
				default:
				System.out.println("\nOpção inválida!");
				break;
			}
		} while (opcao != 0);

		sc.close();
	}
	

}
