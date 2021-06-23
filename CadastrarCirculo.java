package View;

import java.util.Scanner;

import Controller.FormaController;
import Models.Circulo;
import View.Principal;

public class CadastrarCirculo {
	
	public static void Menu() {
		int opcao,circulo;
		Scanner sc = new Scanner(System.in);

		

		int raio;
		
		do {
			System.out.println("\n-- PROJETO DE PROVA --\n");
			System.out.println("1 - Cadastrar Circulo");
			System.out.println("Digite o raio: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("\n-- CADASTRAR CIRCULO --\n");
				System.out.println("Digite o raio:");
				circulo = sc.nextInt();
				
				Circulo Circulo = new Circulo();
				FormaController.Cadastro(Circulo);

				case 0:
				System.out.println("\nVoltando ao menu principal");
				Principal.main(null);
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		} while (opcao != 0);

		sc.close();
	}

}
