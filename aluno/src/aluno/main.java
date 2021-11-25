package aluno;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		double nota = 4.6;

		String nome =  JOptionPane.showInputDialog("Digite o nome do aluno(a): ");
		aluno.setNome(nome);
		
		aluno.setN1(Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: ")));
		aluno.setN2(Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: ")));
		aluno.setN3(Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: ")));
		aluno.setN4(Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: ")));		
		
		aluno.calculaMedia();
		
		System.out.println(aluno.getMedia());
		
//		aluno.setN1(Double.);
		

	}

}
