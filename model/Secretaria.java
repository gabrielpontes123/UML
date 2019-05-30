package model;

public abstract class Secretaria {
	private String nome;
	private long salário;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getSalário() {
		return salário;
	}
	public void setSalário(long salário) {
		this.salário = salário;
	}
	
	public abstract void getBonificacao();
	
	}
	
	
	


