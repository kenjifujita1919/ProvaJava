package Models;

public class Circulo {
	private int Raio;

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
}
