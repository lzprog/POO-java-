package EX51;

public class Bicicleta extends Transporte {
	//VAR
	double tarifa = 1.5;
	double tempo = 1.0;
	//GETTERS AND SETTERS 
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	public double getTempo() {
		return tempo;
	}
	//CONSTRUTORES
	public Bicicleta() {
		
	}
	public Bicicleta(String type, double tempo) {
		super(type);
		this.tempo = tempo;
	}
	public Bicicleta(Bicicleta p, double tempo) {
		super(p.getType());
		this.tempo = tempo;
	}
	//MÉTODOS
	@Override
	void calculaTarifa() {
		tarifa = tarifa*tempo;
	}
	@Override
	public String exibirDetalhes() {
		return(super.exibirDetalhes()+"\nHoras de uso: "+tempo+"\nTarifa: R$ "+tarifa+"\n");
	}

}
