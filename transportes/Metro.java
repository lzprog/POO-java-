package EX51;

public class Metro extends Transporte{
	//VAR
	double tarifa;
	int cont;
	//GETTERS AND SETTERS
	public void setCont(int cont) {
		this.cont = cont;
	}
	public int getCont() {
		return cont;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public double getTarifa() {
		return tarifa;
	}
	//CONSTRUTORES
	public Metro() {
		
	}
	public Metro(String tipo, int cont) {
		super(tipo);
		this.cont = cont;
	}
	public Metro(Transporte p, int cont) {
		super(p.getType());
		this.cont = cont;
	}
	//MÉTODOS
	@Override
	void calculaTarifa() {
		tarifa = 7.0;
	}
	@Override
	public String exibirDetalhes() {
		return(super.exibirDetalhes()+"\nEstações percorridas: "+cont+"\nTarifa: R$ "+tarifa+"\n");
	}
}
