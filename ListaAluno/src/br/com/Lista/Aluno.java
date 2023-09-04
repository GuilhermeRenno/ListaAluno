package br.com.Lista;

public class Aluno {
	private int matricula;
	private String nome;
	
	public void construtotMatricula(int matriculaC, String nomeC ) {
		this.matricula = matriculaC;
		this.nome = nomeC;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
