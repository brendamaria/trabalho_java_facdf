package aluno;

import javax.swing.JOptionPane;

public class Notas {
	/***** ATRIBUTOS *********/


	private double n1;
	private double n2;
	private double n3;
	private double n4;
	private double n5;
	private double media;

	/****************/

	/***** GET E SET ***********/


	public double getMedia() {
		return media;
	}
	
	public void setMedia(double media) {
		this.media = media;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(String nota1) {
		nota1 = nota1.replace(",", ".");
		double nota1D = Double.parseDouble(nota1);
		if ( nota1D < 0 && nota1D > 10  ) {
			System.out.println("Não aceitamos numeros menores que 0 e maior do que 10");
		}else {
			this.n1 = nota1D;
		}
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		if ( n2 < 0 && n2 > 10  ) {
			System.out.println("Não aceitamos numeros menores que 0 e maior do que 10");
		}else {
			this.n2 = n2;
		}
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		if ( n3 < 0 && n3 > 10  ) {
			System.out.println("Não aceitamos numeros menores que 0 e maior do que 10");
		}else {
			this.n3 = n3;
		}
	}

	public double getN4() {
		return n4;
	}

	public void setN4(double n4) {
		if ( n4 < 0 && n4 > 10  ) {
			System.out.println("Não aceitamos numeros menores que 0 e maior do que 10");
		}else {
			this.n4 = n4;
		}
	}

	public double getN5() {
		return n5;
	}

	public void setN5(double n5) {
		if ( n5 < 0 && n5 > 10  ) {
			System.out.println("Não aceitamos numeros menores que 0 e maior do que 10");
		}else {
			this.n5 = n5;
		}
	}

	/*****************/

	/***** MÉTODOS *********/

	public double calculaMedia() {
		double total = (getN1() + getN2() + getN3() + getN4())/4;
		setMedia(total);
		if (media >= 7.00) {
			JOptionPane.showMessageDialog(null,"A média do aluno(a) é "+getMedia()+
					"\n"+"Aluno(a) Aprovado.","Notas",JOptionPane.INFORMATION_MESSAGE);
		} else if (media <= 4.00) {
			JOptionPane.showInputDialog(null, "Você está reprovado nets materia, tente novamente no proximo semestre",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null,"A média do aluno(a) é "+getMedia()+
					"\n"+"Você está de recuperação, faça alguma atividade complementar para adiconar a sua media final.","Notas",JOptionPane.INFORMATION_MESSAGE);
			String notaR = JOptionPane.showInputDialog("Digite a nota complementar: ");
			setN5(Double.parseDouble(notaR));
			calculaMediaRecuperacao(getN5());
			if (getMedia() >= 7.00) {
				JOptionPane.showMessageDialog(null,"A média do aluno(a) é "+getMedia()+
						"\n"+"Parabéns você passou na recuperação.","Notas",JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,"A média do aluno(a) é "+getMedia()+
						"\n"+"Você não passou na recuperação, tente novamente no proximo semestre.","Notas",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		return this.media;
	}

	public void calculaMediaRecuperacao(double notaR) {
		double mediaFinal = (getMedia() + notaR) / 2;
		setMedia(mediaFinal);
	}
	
}