package br.com.portoseguro.beans;

public class Modificacoes {
	private String quadro;
	private String freio;
	private String guidao;
	private Pneu pneu;
	private Selim selim;
	private String suspensaoTraseira;
	private String suspensaoDianteira;
	private String pedal;
	
//=================== CONSTRUTORES =========================
	public Modificacoes() {
		super();
	}
	
	public Modificacoes(String quadro, String freio, String guidao, Pneu pneu, Selim selim, String suspensaoTraseira,
			String suspensaoDianteira, String pedal) {
		super();
		this.quadro = quadro;
		this.freio = freio;
		this.guidao = guidao;
		this.pneu = pneu;
		this.selim = selim;
		this.suspensaoTraseira = suspensaoTraseira;
		this.suspensaoDianteira = suspensaoDianteira;
		this.pedal = pedal;
	}
	
	public Modificacoes(String quadro, String freio, String guidao, String suspensaoTraseira, String suspensaoDianteira,
			String pedal) {
		super();
		this.quadro = quadro;
		this.freio = freio;
		this.guidao = guidao;
		this.suspensaoTraseira = suspensaoTraseira;
		this.suspensaoDianteira = suspensaoDianteira;
		this.pedal = pedal;
	}

//=================== SETTERS & GETTERS =========================
	public String getQuadro() {
		return quadro;
	}

	public void setQuadro(String quadro) {
		this.quadro = quadro;
	}

	public String getFreio() {
		return freio;
	}

	public void setFreio(String freio) {
		this.freio = freio;
	}

	public String getGuidao() {
		return guidao;
	}

	public void setGuidao(String guidao) {
		this.guidao = guidao;
	}

	public Pneu getPneu() {
		return pneu;
	}

	public void setPneu(Pneu pneu) {
		this.pneu = pneu;
	}

	public Selim getSelim() {
		return selim;
	}

	public void setSelim(Selim selim) {
		this.selim = selim;
	}

	public String getSuspensaoTraseira() {
		return suspensaoTraseira;
	}

	public void setSuspensaoTraseira(String suspensaoTraseira) {
		this.suspensaoTraseira = suspensaoTraseira;
	}

	public String getSuspensaoDianteira() {
		return suspensaoDianteira;
	}

	public void setSuspensaoDianteira(String suspensaoDianteira) {
		this.suspensaoDianteira = suspensaoDianteira;
	}

	public String getPedal() {
		return pedal;
	}

	public void setPedal(String pedal) {
		this.pedal = pedal;
	}
}
