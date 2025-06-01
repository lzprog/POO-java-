package EX51;

public class Transporte {
	//VAR
	String type = "Ônibus";
	//GETTERS AND SETTERS
	public String getType() {
		return type;
	}
	public void setType(String tipo) {
		this.type = tipo;
	}

	//CONSTRUTORES
	public Transporte() {
		
	}
	public Transporte(String type) {
		this.type = type;
	}
	//MÉTODOS
	void calculaTarifa() {
		System.out.println("Tarifa: R$ 5.0");
	}
	public String exibirDetalhes() {
		return("-------------------------\nTransporte: "+type);
	}

}
