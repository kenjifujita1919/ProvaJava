package Controller;

import java.util.ArrayList;
import java.util.List;

import Models.Circulo;
import Models.Forma;

public class FormaController {
	
	private static	ArrayList<Forma> formas = new ArrayList<Forma>();
	private static	ArrayList<Circulo> circulos = new ArrayList<Circulo>();
	
	public static List<Forma> Listar() {
		return formas;
	}
	
	public static void CadastrarCirculo(Circulo circulo) {
		formas.add(circulo);
	}

}
