package br.edu.ifpe.jaboatao.ts.entidades;

import java.util.Date;
import java.util.List;

public class Locacao {

	private Cliente cliente;
	private List<Roupa> roupa;
	private Date dataLocacao;
	private Date dataRetorno;
	private Double valor;
	
	public List<Roupa> getRoupa() {
		return roupa;
	}
	public void setRoupa(List<Roupa> roupa) {
		this.roupa = roupa;
	}
	public Locacao() {}
	
	public Locacao(Cliente cliente, List<Roupa> roupa, Date dataLocacao, Date dataRetorno, Double valor) {
		super();
		this.cliente = cliente;
		this.roupa = roupa;
		this.dataLocacao = dataLocacao;
		this.dataRetorno = dataRetorno;
		this.valor = valor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public Date getDataRetorno() {
		return dataRetorno;
	}
	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}