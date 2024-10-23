package main;

//Classe produtoVestuario que herda as caracteristicas comuns e o metodo de calcular lucro da classe Produto
public class ProdutoVestuario extends Produto {
	// atributos específicos
	protected String tamanho;
	protected String cor;
	protected String material;
	
	// metodo construtor para adicionar as caracteristicas especificas  junto com as caracteristicas comuns
	public ProdutoVestuario(String nome, float precoCusto, float precoVenda, String tamanho, String cor, String material) {
		super(nome, precoCusto, precoVenda);
		setTamanho(tamanho);
		setCor(cor);
		setMaterial(material);
	}
	// método get para acessar o atributo
	public String getTamanho() {
		return tamanho;
	}
	// método set para modificar o valor do atributo
	public void setTamanho(String tamanho) {
		if( tamanho == null || tamanho.trim().isEmpty()) { // trim para tirar os espaços desnecessários e isEmpty para avisar se estiver vazio
			throw new IllegalArgumentException("O tamanho não pode estar vazio");
		}
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		if( cor == null || cor.trim().isEmpty()) {
			throw new IllegalArgumentException("Cor não pode estar vazio");
		}
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		if( material == null || material.trim().isEmpty()) {
			throw new IllegalArgumentException("O material não pode estar vazio");
		}
		this.material = material;
	}
	// método para formatar a string e adicionar as caracteristicas específicas junto com as caracteristicas comuns
	public String descricao() {
		return super.descricao() + "\nTamanho: " + tamanho + "\nCor: " + cor + "\nMaterial: " + material;
	}

	// Método string com o comando SQL para salvar o produto
	public String salvarProduto(int id) {
	    return "INSERT INTO produtos_vestuario (id, nome, preco_custo, preco_venda, tamanho, cor, material) VALUES ("
	            + id + ", " + getNome() + ", " + getPrecoCusto() + ", " + getPrecoVenda() + ", " 
	            + getTamanho() + ", " + getCor() + ", " + getMaterial() + ")";
	}

	// Método string com o comando SQL para atualizar o produto
    public String atualizarProduto(int id) {
        return "UPDATE produtos_vestuario SET nome = " + getNome() + ", preco_custo = " + getPrecoCusto() 
                + ", preco_venda = " + getPrecoVenda() + ", tamanho = " + getTamanho() + ", cor = " + getCor() 
                + ", material = " + getMaterial() + " WHERE id = " + id;
    }

 // Método string com o comando SQL para deltar o produto
    public String deletarProduto(int id) {
        return "DELETE FROM produtos_vestuario WHERE id = " + id;
    }
}

