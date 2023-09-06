package br.com.Lista;

import java.util.ArrayList;

public class TesteMatricula {
	public static void main(String[]args) {
		
		ArrayList<String> alunos = new ArrayList<>();
		ArrayList<String> cursos = new ArrayList<>();
		
		Aluno a1 = new Aluno();
		a1.construtotMatricula(12345, "ana");
		a1.setNome("ana2");
		Aluno a2 = new Aluno();
		a2.construtotMatricula(12345, "mariana");
		
		Curso c1 = new Curso();
		c1.construtorCurso(1, "matematica", 5);
		c1.setNome("calculo");
		Curso c2 = new Curso();
		c2.construtorCurso(2, "matematica2", 5);

		Matricula m1 = new Matricula();
		m1.construtorMatricula(a1, c1);
		System.out.println(m1.getAluno().getNome());
		System.out.println(m1.getAluno().getMatricula());
		System.out.println(m1.getCurso().getNome());
		System.out.println(m1.getCurso().getCodigo());
		System.out.println(m1.getCurso().getVagas());
			
			
			
		
		cursos.add(c1.getNome());
		cursos.add(c2.getNome());
		cursos.trimToSize();
		
		alunos.add(a1.getNome());
		alunos.add(a2.getNome());
		
		System.out.println("Lista de cursos: ");
		for (int i = 0; i < alunos.size();i++) {
			System.out.println(cursos.get(i));
		}
		System.out.println("Lista de alunos: ");
		for (int i = 0;i<alunos.size();i++) {
			System.out.println(alunos.get(i));
		}
		
	//	if(c1.getVagas()<cursos.size()) {
	//		for (int i = 0;i==c1.getVagas();i++) {
	//			new Matricula().construtorMatricula(a1, c1);
	//			System.out.println(new Matricula());
	//		}
	//	}
		
		
	}
}
