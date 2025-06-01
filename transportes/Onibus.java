package EX51;

public class Onibus extends Transporte {
	//VAR
	double tarifa = 5.0;
	boolean inter = false;
	String aux = "Local";
	//GETTERS AND SETTERS
	public void setInter(boolean inter) {
		this.inter = inter;
	}
	public boolean getInter() {
		return inter;
	}
	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
	}
	public double getTarifa() {
		return tarifa;
	}
	//CONSTRUTORES
	public Onibus() {
		
	}
	public Onibus(String type, boolean inter) {
		super(type);
		this.inter = inter;
	}
	public Onibus(Transporte p, boolean inter) {
		super(p.getType());
		this.inter = inter;
	}
	//MÉTODOS
	@Override
	void calculaTarifa() {
		if(inter == true) {
			tarifa = (tarifa*0.5) + tarifa;
			aux = "Intermunicipal";
		}
	}
	@Override
	public String exibirDetalhes() {
		return(super.exibirDetalhes()+"\nTipo: "+aux+"\nTarifa: R$ "+tarifa+"\n");
	}
	
	
}
