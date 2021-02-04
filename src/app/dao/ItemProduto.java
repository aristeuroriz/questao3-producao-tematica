package app.dao;

public class ItemProduto {

	private Integer codigoproduto;
	private Integer codigoitem;
	private String nome;
	private String descricao;
	private String categoria;
	private String atributo1;
	private String atributo2;
	private String atributo3;
	private String atributo4;

	ItemProduto(Integer codigoproduto, Integer codigoitem, String nome, String descricao, String categoria, String atributo1, String atributo2,
			String atributo3, String atributo4) {
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
	

	public Integer getCodigoproduto() {
		return codigoproduto;
	}


	public void setCodigoproduto(Integer codigoproduto) {
		this.codigoproduto = codigoproduto;
	}


	public Integer getCodigoitem() {
		return codigoitem;
	}

	public void setCodigoitem(Integer codigoitem) {
		this.codigoitem = codigoitem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}

	public String getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}

	public String getAtributo3() {
		return atributo3;
	}

	public void setAtributo3(String atributo3) {
		this.atributo3 = atributo3;
	}

	public String getAtributo4() {
		return atributo4;
	}

	public void setAtributo4(String atributo4) {
		this.atributo4 = atributo4;
	}

}
