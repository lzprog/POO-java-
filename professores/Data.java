package EX6;

public class Data {
	//VAR 
	private int dia;
	private int mes;
	private int ano;
	//GETTERS AND SETTERS
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}
	
	public Data() {
		
	}
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	//MÉTODOS
	public String toString() {
		return(dia+"/"+mes+"/"+ano);
	}
}
