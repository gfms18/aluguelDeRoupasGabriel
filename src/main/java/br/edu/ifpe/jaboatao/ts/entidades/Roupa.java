package br.edu.ifpe.jaboatao.ts.entidades;

public class Roupa {
	private String nome;
	private String tamanho;
	private Integer qntEmEstoque;
	private Double preco; 
	
	public Roupa() {}
	
	public Roupa(String nome, String tamanho, Integer estoque, Double valor) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.qntEmEstoque = estoque;
		this.preco = valor;
	}
	
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQntEmEstoque() {
		return qntEmEstoque;
	}
	public void setQntEmEstoque(Integer qntEmEstoque) {
		this.qntEmEstoque = qntEmEstoque;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
}