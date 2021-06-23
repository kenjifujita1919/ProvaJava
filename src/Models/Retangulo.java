package Models;

public class Retangulo extends Forma {
	private int Altura;
	private int Largura;	
	
	public Retangulo(int altura, int largura) {
		super();
		Altura = altura;
		Largura = largura;
	}
	public int getAltura() {
		return Altura;
	}
	public void setAltura(int altura) {
		Altura = altura;
	}
	public int getLargura() {
		return Largura;
	}
	public void setLargura(int largura) {
		Largura = largura;
	}
	
	public double CalcularArea() {
		return Altura * Largura;
	}
	@Override
	public String toString() {
		return "Retangulo [Altura=" + Altura + ", Largura=" + Largura + "]";
	}
	
	
}
