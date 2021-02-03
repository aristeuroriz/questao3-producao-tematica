package app.DAO;

public class Product {
	
	   private String name;
	   private String description;
	   private String category;
	   private String attribute1;
	   private String attribute2;
	   private String attribute3;
	   private String attribute4;
	   

	   Product(String name, String description, String category, String attribute1, String attribute2, String attribute3, String attribute4){
	      this.name = name;
	      this.description = description;
	      this.category = category;
	      this.attribute1 = attribute1;
	      this.attribute2 = attribute2;
	      this.attribute3 = attribute3;
	      this.attribute4 = attribute4;
	   }


	public String getNome() {
		return name;
	}


	public void setNome(String nome) {
		this.name = nome;
	}


	public String getDescricao() {
		return description;
	}


	public void setDescricao(String descricao) {
		this.description = descricao;
	}


	public String getCategoria() {
		return category;
	}


	public void setCategoria(String categoria) {
		this.category = categoria;
	}


	public String getAtributo1() {
		return attribute1;
	}


	public void setAtributo1(String atributo1) {
		this.attribute1 = atributo1;
	}


	public String getAtributo2() {
		return attribute2;
	}


	public void setAtributo2(String atributo2) {
		this.attribute2 = atributo2;
	}


	public String getAtributo3() {
		return attribute3;
	}


	public void setAtributo3(String atributo3) {
		this.attribute3 = atributo3;
	}


	public String getAtributo4() {
		return attribute4;
	}


	public void setAtributo4(String atributo4) {
		this.attribute4 = atributo4;
	}

}
