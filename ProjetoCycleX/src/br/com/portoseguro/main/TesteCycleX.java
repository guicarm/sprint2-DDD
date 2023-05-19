package br.com.portoseguro.main;

import javax.swing.JOptionPane;

import br.com.portoseguro.beans.Bike;
import br.com.portoseguro.beans.Endereco;
import br.com.portoseguro.beans.Modificacoes;
import br.com.portoseguro.beans.PessoaFisica;
import br.com.portoseguro.beans.PessoaJuridica;
import br.com.portoseguro.beans.Pneu;
import br.com.portoseguro.beans.Selim;

public class TesteCycleX {

// =============== MÉTODOS STATIC  ===============
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double decimal (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	
// =============== SAÍDA E JOPTIONPANE  ===============
	public static void main(String[] args) {
		
		// MENSAGEM PARA INFORMAR O CLIENTE 
		String Pf = ("O CAMPO A SEGUIR SE REFERE AOS DADOS DE PESSOA FÍSICA");
		JOptionPane.showMessageDialog(null, Pf);
		
		String PeFisica = ("CASO SEJA PESSOA JURÍDICA, DIGITE 0 PARA TUDO RELACIONADO A PESSOA FÍSICA.");
		JOptionPane.showMessageDialog(null, PeFisica);
		
		PessoaFisica objPessoaFisica = new PessoaFisica(texto("Nome do cliente: "),
														texto("Email do cliente: "),
														texto("Telefone do cliente: "),
														inteiro("Idade do cliente: "),
														decimal("Renda do cliente: "),
														texto("CPF do cliente: "),
														texto("RG do cliente: "));
		
		// MENSAGEM PARA INFORMAR O CLIENTE 
		String Pj = ("O CAMPO A SEGUIR SE REFERE AOS DADOS DE PESSOA JUÍDICA");
		JOptionPane.showMessageDialog(null, Pj);
		
		String PeJuridica = ("CASO SEJA PESSOA FÍSICA, DIGITE 0 PARA TUDO RELACIONADO A PESSOA JURÍDICA	.");
		JOptionPane.showMessageDialog(null, PeJuridica);
		
		PessoaJuridica objPessoaJuridica = new PessoaJuridica(texto("Nome da empresa: "),
															texto("Email da empresa: "),
															texto("Telefone da empresa: "),
															inteiro("Idade da empresa: "),
															decimal("Renda da empresa: "),
															texto("Razão social da empresa: "),
															texto("CNPJ da empresa: "));
		
		
		Endereco objEndereco = new Endereco(texto("Logradouro: "),
				                            inteiro("Número: "),
				                            texto("CEP: "),
				                            texto("Bairro: "),
				                            texto("Município: "),
				                            texto("Estado: "),
				                            texto("Nacionalidade: "));
		
		
		Bike objBike = new Bike(texto("Preço da bicicleta: "),
				                texto("Marca da bicicleta: "),
				                inteiro("Ano da bicicleta: "),
				                texto("Tipo de bicicleta: "));
		
		
		Modificacoes objModificacoes = new Modificacoes(texto("Quadro modificado? [S/N]: "),
														texto("Freio modificado? [S/N]: "),
														texto("Guidão modificado? [S/N]: "),
														texto("Suspensão traseira modificado? [S/N]: "),
														texto("Suspensão ianteira modificado? [S/N]: "),
														texto("Pedal modificado? [S/N]: "));
		
		
		Pneu objPneu = new Pneu(texto("Aro do pneu modificado? [S/N]: "),
				                texto("Raio do pneu modificado? [S/N]: "),
				                texto("Cubo do pneu modificado? [S/N]: "));
		                       
		
		Selim objSelim = new Selim(texto("Canote do selim modificado? [S/N]: "),
				                   texto("Abraçadeira do selim modificado? [S/N]: "));
		
		objBike.setModificacoes(objModificacoes);
		objModificacoes.setPneu(objPneu);
		objModificacoes.setSelim(objSelim);
		objPessoaJuridica.setEndereco(objEndereco);
		objPessoaFisica.setEndereco(objEndereco);
		
		
		// SAÍDA
		System.out.println("=========== DADOS PESSOA FÍSICA ===========" + 
				"\nNome do cliente: " + objPessoaFisica.getNome() +
				"\nEmail do cliente: " + objPessoaFisica.getEmail() + 
		        "\nTelefone do cliente: " + objPessoaFisica.getTelefone() +
				"\nIdade do cliente: " + objPessoaFisica.getIdade() +
				"\nRenda do cliente: " + objPessoaFisica.getRenda() + 
				"\nCPF do cliente: " + objPessoaFisica.getCpf() +
				"\nRG do cliente: " + objPessoaFisica.getRg() + 
				"\n=========== DADOS PESSOA JURÍDICA ===========" + 
				"\nNome da empresa: " + objPessoaJuridica.getNome() + 
				"\nEmail da empresa: " + objPessoaJuridica.getEmail() +
				"\nTelefone da empresa: " + objPessoaJuridica.getTelefone() + 
				"\nIdade da empresa: " + objPessoaJuridica.getIdade() +
				"\nRenda da empresa: " + objPessoaJuridica.getRenda() +
				"\nRazão social da empresa: " + objPessoaJuridica.getRazaoSocial() +
				"\nCNPJ da empresa: " + objPessoaJuridica.getCnpj() +
				"\n============== ENDEREÇO ==============" +
				"\nLogradouro: " + objEndereco.getLogradouro() +
                "\nNúmero: " + objEndereco.getNumero() +
                "\nCEP: " + objEndereco.getCep() + 
                "\nBairro: " + objEndereco.getBairro() +
                "\nMunicípio: " + objEndereco.getMunicipio() +
                "\nEstado: " + objEndereco.getEstado() +
                "\nNacionalidade: " + objEndereco.getNacionalidade() +
                "\n============== BIKE ==============" +
                "\nPreço da bicicleta: " + objBike.getPrecoBike() +
                "\nMarca da bicicleta: " + objBike.getMarca() +
                "\nAno da bicicleta: " + objBike.getAno() +
                "\nTipo de bicicleta: " + objBike.getTipo() +
		        "\n============== MODIFICAÇÕES ==============" +
		        "\nQuadro modificado: " + objModificacoes.getQuadro() +
				"\nFreio modificado: " + objModificacoes.getFreio() +
				"\nGuidão modificado: " + objModificacoes.getGuidao() + 
				"\nSuspensão traseira: " + objModificacoes.getSuspensaoTraseira() +
				"\nSuspensão dianteira: "  + objModificacoes.getSuspensaoDianteira() +
				"\nPedal modificado: "  + objModificacoes.getPedal() + 
				"\n============== PNEU E SELIM ==============" +
				"\nAro do pneu: " + objModificacoes.getPneu().getAro() +
                "\nRaio do pneu: " + objModificacoes.getPneu().getRaio() + 
                "\nCubo do pneu: " + objModificacoes.getPneu().getCubo() +
                "\nCanote do selim: " + objModificacoes.getSelim().getCanoteSelim() +
                "\nAbraçadeira do selim: " + objModificacoes.getSelim().getAbraçadeiraSelim());
			
                
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
