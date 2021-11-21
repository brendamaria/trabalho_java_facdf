package aluno;

public class Notas {
	
	private double n1;
	
	private double n2;
	
	private double n3;
	
	private double n4;
	
	private double n5;
	
	private double media;
	
	public double getMedia() {
		return media;
	}

	public double calculaMedia() {
		double total = getN1() + getN2() + getN3() + getN4();
			this.media = total/4;
			return this.media;
	}
	
	public double calculaMediaRecuperacao() {
		double mediaFinal = (calculaMedia() + n5)/2;
		this.media = mediaFinal;
		return this.media;
	} 
	
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	
	public double getN4() {
		return n4;
	}
	public void setN4(double n4) {
		this.n4 = n4;
	}
	
	public double getN5() {
		return n5;
	}
	public void setN5(double n5) {
		this.n5 = n5;
	}
}
