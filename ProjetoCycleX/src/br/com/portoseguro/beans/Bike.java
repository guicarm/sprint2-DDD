package br.com.portoseguro.beans;

public class Bike {
	
	private String precoBike;
	private String marca;
	private int ano;
	private String tipo;
	private Modificacoes modificacoes;
	
//=================== CONSTRUTORES =========================
	public Bike() {
		super();
	}
	public Bike(String precoBike, String marca, int ano, String tipo, Modificacoes modificacoes) {
		super();
		this.precoBike = precoBike;
		this.marca = marca;
		this.ano = ano;
		this.tipo = tipo;
		this.modificacoes = modificacoes;
	}
	public Bike(String precoBike, String marca, int ano, String tipo) {
		super();
		this.precoBike = precoBike;
		this.marca = marca;
		this.ano = ano;
		this.tipo = tipo;
	}
	
//=================== SETTERS & GETTERS =========================
	public String getPrecoBike() {
		return precoBike;
	}
	public void setPrecoBike(String precoBike) {
		this.precoBike = precoBike;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Modificacoes getModificacoes() {
		return modificacoes;
	}
	public void setModificacoes(Modificacoes modificacoes) {
		this.modificacoes = modificacoes;
	}
}
