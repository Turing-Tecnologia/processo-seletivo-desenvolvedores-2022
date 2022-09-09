package Ufersa.example.Test.API.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Carro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private Double preco;
	
	private String marca;
	
	private int anoDeFabricacao;
	
	private String cor;

	public Carro(Long id, String nome, Double preco, String marca, int anoDeFabricacao, String cor) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.anoDeFabricacao = anoDeFabricacao;
		this.cor = cor;
	}
	
	public Carro(){

    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
