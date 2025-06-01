package EX7;

public class Notas implements func{
	//var
	private double nota1;
	private double nota2;
	private String situacao;
	double mediaAluno;
	//getters and setters
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public double getMediaAluno() {
		return mediaAluno;
	}
	public void setMediaAluno(double mediaAluno) {
		this.mediaAluno = mediaAluno;
	}

	public Notas() {
		
	}
	public Notas(double nota1, double nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	//métodos
	@Override
	public void calculaMedia(double nota1, double nota2) {
		mediaAluno = (nota1 + nota2)/2;
		if(mediaAluno >= media) {
			situacao = "Aprovado";	
		}
		else {
			situacao = "Reprovado";
		}
	}

	@Override
	public String exibirDados() {
		return("\nNOTA 1: "+nota1+"\nNOTA 2: "+nota2+"\nMEDIA: "+mediaAluno+"\nSITUAÇÃO: "+situacao);	
	}

}
