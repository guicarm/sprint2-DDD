package br.com.portoseguro.beans;

public class Selim {
	
	private String canoteSelim;
	private String abraçadeiraSelim;
	
//=================== CONSTRUTORES =========================	
	public Selim() {
		super();
	}
	public Selim(String canoteSelim, String abraçadeiraSelim) {
		super();
		this.canoteSelim = canoteSelim;
		this.abraçadeiraSelim = abraçadeiraSelim;
	}
	
//=================== SETTERS & GETTERS =========================
	public String getCanoteSelim() {
		return canoteSelim;
	}
	public void setCanoteSelim(String canoteSelim) {
		this.canoteSelim = canoteSelim;
	}
	public String getAbraçadeiraSelim() {
		return abraçadeiraSelim;
	}
	public void setAbraçadeiraSelim(String abraçadeiraSelim) {
		this.abraçadeiraSelim = abraçadeiraSelim;
	}
}
