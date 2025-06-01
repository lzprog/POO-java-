package EX1;

public class Retangulo {
	private double altura = 1.0;
	private double largura = 1.0;
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	Retangulo() {
		
	}

	void CalculaArea() {
		double area = 0.0;
		area = (altura * largura);
		System.out.println("Area: "+area);
	}
	
	void CalculaPerimetro() {
		double perimetro = 0.0;
		perimetro = (altura + largura) * 2;
		System.out.println("Perimetro: "+perimetro);
	}
	
	void imprimir() {
		System.out.println("ALTURA: "+getAltura());
		System.out.println("LARGURA: "+getLargura());
	}
}
