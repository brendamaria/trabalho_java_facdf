package aluno;

import java.text.DecimalFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		String nome = JOptionPane.showInputDialog("Digite o nome do aluno(a): ");
		aluno.setNome(nome);

		String nota1 = (JOptionPane.showInputDialog("Digite a primeira nota: "));
		nota1 = nota1.replace(",", ".");
		double nota1D = Double.parseDouble(nota1);
		if (nota1D < 0 || nota1D > 10) {
			JOptionPane.showMessageDialog(null,
					"Voce digitou: " + nota1D + ". Não aceitamos números menores que 0 e maiores que 10", "Notas",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			aluno.setN1(nota1D);

		}

		String nota2 = (JOptionPane.showInputDialog("Digite a segunda nota: "));
		nota2 = nota2.replace(",", ".");
		double nota2D = Double.parseDouble(nota1);
		if (nota2D < 0 || nota2D > 10) {
			JOptionPane.showMessageDialog(null,
					"Voce digitou: " + nota2D + ". Não aceitamos números menores que 0 e maiores que 10", "Notas",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			aluno.setN1(nota2D);
		}

		String nota3 = (JOptionPane.showInputDialog("Digite a terceira nota: "));
		nota3 = nota3.replace(",", ".");
		double nota3D = Double.parseDouble(nota1);
		if (nota3D < 0 || nota3D > 10) {
			JOptionPane.showMessageDialog(null,
					"Voce digitou: " + nota3D + ". Não aceitamos números menores que 0 e maiores que 10", "Notas",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			aluno.setN3(nota3D);

		}

		String nota4 = (JOptionPane.showInputDialog("Digite a quarta nota: "));
		nota4 = nota4.replace(",", ".");
		double nota4D = Double.parseDouble(nota1);
		if (nota4D < 0 || nota4D > 10) {
			JOptionPane.showMessageDialog(null,
					"Voce digitou: " + nota4D + ". Não aceitamos números menores que 0 e maiores que 10", "Notas",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			aluno.setN4(nota4D);
		}

		aluno.calculaMedia();

		System.out.println(aluno.getN1());
	}

}
