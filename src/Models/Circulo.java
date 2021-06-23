package Models;

public class Circulo extends Forma {
	private int Raio;
	

	public Circulo(int raio) {
		super();
		Raio = raio;
	}

	public int getRaio() {
		return Raio;
	}

	public void setRaio(int raio) {
		Raio = raio;
	}
	

	@Override
	public String toString() {
		return "Circulo [Raio=" + Raio + "]";
	}

	@Override
	public double CalcularArea() {
		return Math.PI * Math.pow(Raio, 2);
	}
}
