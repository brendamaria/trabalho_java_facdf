package aluno;

import java.text.DecimalFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setPr(true);
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno(a): ");
		aluno.setNome(nome);
		
		while(aluno.isPr()){
			pegarNota1(aluno);
		}
		aluno.setPr(true);
		while(aluno.isPr()){
			pegarNota2(aluno);
		}
		aluno.setPr(true);
		while(aluno.isPr()){
			pegarNota3(aluno);
		}
		aluno.setPr(true);
		while(aluno.isPr()){
			pegarNota4(aluno);
		}
		
		aluno.calculaMedia();

	}
	
	public static void pegarNota1(Aluno aluno) {
		if(aluno.isPr()) {
			String nota1 = (JOptionPane.showInputDialog("Digite a primeira nota: "));
			aluno.setN1(nota1);
			
		} else {
			
		}
	}
	
	public static void pegarNota2(Aluno aluno) {
		if(aluno.isPr()) {
			String nota = (JOptionPane.showInputDialog("Digite a segunda nota: "));
			aluno.setN2(nota);
		} else {
			return;
		}

	}
	
	public static void pegarNota3(Aluno aluno) {
		if(aluno.isPr()) {
			String nota = (JOptionPane.showInputDialog("Digite a terceira nota: "));
			aluno.setN3(nota);
		} else {
			return;
		}

	}
	
	public static void pegarNota4(Aluno aluno) {
		if(aluno.isPr()) {
			String nota = (JOptionPane.showInputDialog("Digite a quarta nota: "));
			aluno.setN4(nota);
		} else {
			return;
		}

	}
}
