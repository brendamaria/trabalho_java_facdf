package aluno;

public class main {

	public static void main(String[] args) {
		
		Aluno teste = new Aluno("brenda");
		
		teste.setN1(2);
		
		
		System.out.println(teste.getNome());
		System.out.println(teste.calculaMedia());
	}

}
