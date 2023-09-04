package br.com.Lista;

public class Curso {
	private int codigo;
	private String nome;
	private int vagas;
	
	public void construtorCurso(int Codigo,String Nome,int Vagas) {
		this.codigo = Codigo;
		this.nome = Nome;
		this.vagas = Vagas;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVagas() {
		return vagas;
	}
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

}
