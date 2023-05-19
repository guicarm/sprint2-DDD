package br.com.portoseguro.beans;

public class Pneu {
	
	private String aro;
	private String raio;
	private String cubo;
	
//=================== CONSTRUTORES =========================
	public Pneu() {
		super();
	}
	public Pneu(String aro, String raio, String cubo) {
		super();
		this.aro = aro;
		this.raio = raio;
		this.cubo = cubo;
	}
	
//=================== SETTERS & GETTERS =========================
	public String getAro() {
		return aro;
	}
	public void setAro(String aro) {
		this.aro = aro;
	}
	public String getRaio() {
		return raio;
	}
	public void setRaio(String raio) {
		this.raio = raio;
	}
	public String getCubo() {
		return cubo;
	}
	public void setCubo(String cubo) {
		this.cubo = cubo;
	}
}
