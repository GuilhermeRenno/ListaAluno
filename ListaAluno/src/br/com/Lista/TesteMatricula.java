package br.com.Lista;

public class TesteMatricula {
	public static void main(String[]args) {
		Aluno a1 = new Aluno();
		a1.construtotMatricula(12345, "ana");
		
		Curso c1 = new Curso();
		c1.construtorCurso(123, "matematica", 5);
		
		Matricula m1 = new Matricula();
		m1.construtorMatricula(a1, c1);
		System.out.println(m1.getAluno().getNome());
		System.out.println(m1.getAluno().getMatricula());
		System.out.println(m1.getCurso().getNome());
		System.out.println(m1.getCurso().getCodigo());
		System.out.println(m1.getCurso().getVagas());
	}
}
