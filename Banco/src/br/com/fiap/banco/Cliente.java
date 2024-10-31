package br.com.fiap.banco;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String nomeCliente, emailCliente, cpfCliente, telefoneCliente;
	private int numeroContaCliente;
	private double saldoContaCliente;
	private Date dataNasc = new Date();

	//construtor
	public Cliente(String nomeCliente, String emailCliente, String cpfCliente, String telefoneCliente,
			int numeroContaCliente, double saldoContaCliente, String dataNasc) {
		super();
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.cpfCliente = cpfCliente;
		this.telefoneCliente = telefoneCliente;
		this.numeroContaCliente = numeroContaCliente;
		this.saldoContaCliente = saldoContaCliente;
		SimpleDateFormat format =new SimpleDateFormat("dd/MM/yyyy");
		try {
		this.dataNasc = format.parse(dataNasc);
		}catch (ParseException e) {
			System.err.println("Formato de data invalido: "+ dataNasc);
			e.printStackTrace();
		}
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	public int getNumeroContaCliente() {
		return numeroContaCliente;
	}

	public void setNumeroContaCliente(int numeroContaCliente) {
		this.numeroContaCliente = numeroContaCliente;
	}

	public double getSaldoContaCliente() {
		return saldoContaCliente;
	}

	public void setSaldoContaCliente(double saldoContaCliente) {
		this.saldoContaCliente = saldoContaCliente;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void investirCorrente(String string, int i) {
		// TODO Auto-generated method stub
		
	}

	public void exibirSaldo() {
		// TODO Auto-generated method stub
		
	}


}
