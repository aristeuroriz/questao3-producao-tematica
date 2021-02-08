
package app.dao;

/**
 * @author c145149 Implementação classe Item Produto
 */
public class ItemProduto {

	// Declaração dos atributos da tabela  Item Produto
	@SuppressWarnings("unused")
	private Integer codigoproduto;
	private Integer codigoitem;
	private String nome;
	private String descricao;
	private String categoria;
	private String atributo1;
	private String atributo2;
	private String atributo3;
	private String atributo4;

	// Método construtor da Item Produto
	ItemProduto(Integer codigoproduto, Integer codigoitem, String nome, String descricao, String categoria,
			String atributo1, String atributo2, String atributo3, String atributo4) {
		this.codigoproduto = codigoproduto;
		this.codigoitem = codigoitem;
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
		return "[codigoItem: " + codigoitem + ", " + "nome: " + nome + ", " + "descricaoItem: " + descricao + ", "
				+ "categoriaItem: " + categoria + ", " + "atributo1Item: " + atributo1 + ", " + "atributo2Item: "
				+ atributo2 + ", " + "atributo3Item: " + atributo3 + ", " + "atributo4Item: " + atributo4 + "]";
	}

}
