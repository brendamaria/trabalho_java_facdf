package aluno;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Notas {
	/***** ATRIBUTOS *********/

	private double n1;
	private double n2;
	private double n3;
	private double n4;
	private double n5;
	private double media;
	private String msg = "Não aceitamos numeros menores que 0 e maior do que 10";
	private boolean pr = true;

	/****************/
	DecimalFormat dt = new DecimalFormat("#.##");      

	/**GET E SET*/
	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public boolean isPr() {
		return pr;
	}

	public void setPr(boolean pr) {
		this.pr = pr;
	}

	public double getN1() {
		return n1;
	}

	public String getMsg() {
		return msg;
	}

	public void setN1(String nota) {
		nota = nota.replace(",", ".");
		double notaD = Double.parseDouble(nota);
		if (notaD < 0 || notaD > 10) {
			JOptionPane.showMessageDialog(null, getMsg(), "Notas",
					JOptionPane.WARNING_MESSAGE);
			this.pr = true;
		} else {
			this.n1 = notaD;
			this.pr = false;
		}
	}

	public double getN2() {
		return n2;
	}

	public void setN2(String nota) {
		nota = nota.replace(",", ".");
		double notaD = Double.parseDouble(nota);
		if (notaD < 0 || notaD > 10) {
			JOptionPane.showMessageDialog(null, getMsg(), "Notas",
					JOptionPane.WARNING_MESSAGE);
			this.pr = true;
		} else {
			this.n2 = notaD;
			this.pr = false;
		}
	}

	public double getN3() {
		return n3;
	}

	public void setN3(String nota) {
		nota = nota.replace(",", ".");
		double notaD = Double.parseDouble(nota);
		if (notaD < 0 || notaD > 10) {
			JOptionPane.showMessageDialog(null, getMsg(), "Notas",
					JOptionPane.WARNING_MESSAGE);
			this.pr = true;
		} else {
			this.n3 = notaD;
			this.pr = false;
		}
	}

	public double getN4() {
		return n4;
	}

	public void setN4(String nota) {
		nota = nota.replace(",", ".");
		double notaD = Double.parseDouble(nota);
		if (notaD < 0 || notaD > 10) {
			JOptionPane.showMessageDialog(null, getMsg(), "Notas",
					JOptionPane.WARNING_MESSAGE);
			this.pr = true;
		} else {
			this.n4 = notaD;
			this.pr = false;
		}
	}

	public double getN5() {
		return n5;
	}

	public void setN5(String nota) {
		nota = nota.replace(",", ".");
		double notaD = Double.parseDouble(nota);
		if (notaD < 0 || notaD > 10) {
			JOptionPane.showMessageDialog(null, getMsg(), "Notas",
					JOptionPane.WARNING_MESSAGE);
			this.pr = true;
		} else {
			this.n5 = notaD;
			this.pr = false;
		}
	}

	/*****************/

	/***** MÉTODOS *********/

	public double calculaMedia() {
		double total = (getN1() + getN2() + getN3() + getN4()) / 4;
		setMedia(total);
		if (media >= 7.00) {
			JOptionPane.showMessageDialog(null, "A média do aluno(a) é " + getMedia() + "\n" + "Aluno(a) Aprovado.",
					"Notas", JOptionPane.INFORMATION_MESSAGE);
		} else if (media <= 4.00) {
			JOptionPane.showInputDialog(null, "Você está reprovado nets materia, tente novamente no proximo semestre",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "A média do aluno(a) é " + getMedia() + "\n"
					+ "Você está de recuperação, faça alguma atividade complementar para adiconar a sua media final.",
					"Notas", JOptionPane.INFORMATION_MESSAGE);
			setPr(true);
			while(isPr()) {
				pegaNota5();	
			}
			calculaMediaRecuperacao(getN5());
			if (getMedia() >= 7.00) {
				JOptionPane.showMessageDialog(null,
						"A média do aluno(a) é " + getMedia() + "\n" + "Parabéns você passou na recuperação.", "Notas",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null,
						"A média do aluno(a) é " + getMedia() + "\n"
								+ "Você não passou na recuperação, tente novamente no proximo semestre.",
						"Notas", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		return this.media;
	}

	public void calculaMediaRecuperacao(double nota) {
		double mediaFinal = (getMedia() + nota) / 2;
		setMedia(mediaFinal);
	}
	
	public void pegaNota5() {
		if(isPr()) {
			String notaR = JOptionPane.showInputDialog("Digite a nota complementar: ");
			setN5(notaR);
		} else {
			return;
		}
	}

}