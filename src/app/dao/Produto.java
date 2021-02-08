package app.dao;

import java.util.List;

/**
 * @author c145149 Implementação classe Produto
 */
public class Produto {

	// Declaração dos atributos da classe Produto
	private Integer codigoproduto;
	private String nome;
	private String descricao;
	private String categoria;
	private String atributo1;
	private String atributo2;
	private String atributo3;
	private String atributo4;
	private List<ItemProduto> item;

	// Método construtor da classe Produto
	public Produto(Integer codigoproduto, String nome, String descricao, String categoria, String atributo1,
			String atributo2, String atributo3, String atributo4) {
		this.codigoproduto = codigoproduto;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
		this.atributo4 = atributo4;
	}

	/**
	 * Método para retornar resultado estruturado para print
	 * 
	 * @return String
	 */
	public String toString() {
		StringBuilder listaItens = new StringBuilder("{");

		item.stream().forEach(itemProduto -> listaItens.append(itemProduto.toString()));

		listaItens.append("}");

		return "{codigoProduto: " + codigoproduto + ", " + "nome: " + nome + ", " + "descricao: " + descricao + ", "
				+ "categoria: " + categoria + ", " + "atributo1: " + atributo1 + ", " + "atributo2: " + atributo2 + ", "
				+ "atributo3: " + atributo3 + ", " + "atributo4: " + atributo4 + ", itens: " + listaItens + "}";
	}

	// Métodos getters and setters dos atributos necessários para print
	public Integer getCodigoproduto() {
		return codigoproduto;
	}

	public void setCodigoproduto(Integer codigoproduto) {
		this.codigoproduto = codigoproduto;
	}

	public List<ItemProduto> getItem() {
		return item;
	}

	public void setItem(List<ItemProduto> item) {
		this.item = item;
	}

}
