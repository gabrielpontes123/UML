package model;

public abstract class Secretaria {
	private String nome;
	private long sal�rio;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getSal�rio() {
		return sal�rio;
	}
	public void setSal�rio(long sal�rio) {
		this.sal�rio = sal�rio;
	}
	
	public abstract void getBonificacao();
	
	}
	
	
	


