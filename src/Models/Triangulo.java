package Models;

public class Triangulo extends Forma {
	private int Altura;
	private int Base;
	public int getAltura() {
		return Altura;
	}
	public void setAltura(int altura) {
		Altura = altura;
	}
	public int getBase() {
		return Base;
	}
	public void setBase(int base) {
		Base = base;
	}
	
	
	@Override
	public String toString() {
		return "Triangulo [Altura=" + Altura + ", Base=" + Base + "]";
	}
	
	
}
