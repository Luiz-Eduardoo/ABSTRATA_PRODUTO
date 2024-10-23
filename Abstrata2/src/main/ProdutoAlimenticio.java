package main;

import java.time.LocalDate; // importa localDate para poder fazer o sistema de data de validade

// Classe produtoAlimenticio que herda as caracteristicas comuns e o metodo de calcular lucro da classe Produto
public class ProdutoAlimenticio extends Produto {
	// atributos específicos
	protected int caloria;
	protected int proteina;
	protected int gordura;
	protected int carboidrato;
	protected LocalDate dataVal;
	
	// metodo construtor para adicionar as caracteristicas especificas  junto com as caracteristicas comuns
	public ProdutoAlimenticio(String nome, float precoCusto, float precoVenda, int caloria, int proteina, int gordura, int carboidrato, LocalDate dataVal) {
		super(nome, precoCusto, precoVenda);
		setCaloria(caloria);
		setProteina(proteina);
		setGordura(gordura);
		setCarboidrato(carboidrato);
		setDataVal(dataVal);
	}
	// método get para acessar o atributo
	public int getCaloria() {
		return caloria;
	}

	// método set para modificar o valor do atributo
	public void setCaloria(int caloria) {
		if(caloria < 0) { // se a caloria for abaixo de 0 ele vai dar exceção
			throw new IllegalArgumentException("Caloria não pode ser negativa");
		}
		this.caloria = caloria;
	}


	public int getProteina() {
		return proteina;
	}


	public void setProteina(int proteina) {
		if(proteina < 0) { // se a proteina for abaixo de 0 ele vai dar exceção
			throw new IllegalArgumentException("Proteina não pode ser negativa");
		}
		this.proteina = proteina;
	}


	public int getGordura() {
		return gordura;
	}


	public void setGordura(int gordura) {
		if(gordura < 0) { // se a gordura for abaixo de 0 ele vai dar exceção
			throw new IllegalArgumentException("Gordura não pode ser negativa");
		}
		this.gordura = gordura;
	}


	public int getCarboidrato() {
		return carboidrato;
	}


	public void setCarboidrato(int carboidrato) {
		if(carboidrato < 0) { // se a carboidrato for abaixo de 0 ele vai dar exceção
			throw new IllegalArgumentException("Carboidrato não pode ser negativo");
		}
		this.carboidrato = carboidrato;
	}


	public LocalDate getDataVal() {
		return dataVal;
	}


	public void setDataVal(LocalDate dataVal) {
		if(dataVal == null) { // se a data estiver nula vai dar exceção
			throw new IllegalArgumentException("A data de validade deve ser informada");
		}
		this.dataVal = dataVal;
	}
	// método para formatar a string e adicionar as caracteristicas específicas junto com as caracteristicas comuns
	public String descricao()  {
		return super.descricao() + "\nInformações Nutricionais: " + "\nCalorias: " + caloria + "\nProteinas: " + proteina + "\nGorduras: " + gordura + "\nCarboidratos: " + carboidrato + "\nData de validade: " + dataVal;
	}
	// Método string com o comando SQL para salvar o produto
	 public String salvarProduto(int id) {
	        return "INSERT INTO produtos_alimenticios (id, nome, preco_custo, preco_venda, caloria, proteina, gordura, carboidrato, data_validade) VALUES (" + id + ", " + getNome() + ", " + getPrecoCusto() + ", " + getPrecoVenda() + ", " + getCaloria() + ", " + getProteina() + ", " + getGordura() + ", " + getCarboidrato() + ", " + getDataVal() + ")";
	    }

// Método string com o comando SQL para atualizar o produto
public String atualizarProduto(int id) {
    return "UPDATE produtos_alimenticios SET nome = " + getNome() + ", preco_custo = " + getPrecoCusto() + ", preco_venda = " + getPrecoVenda() + ", caloria = " + getCaloria() + ", proteina = " + getProteina() + ", gordura = " + getGordura() + ", carboidrato = " + getCarboidrato() + ", data_validade = " + getDataVal() + " WHERE id = " + id;
}

// Método string com o comando SQL para deltar o produto
public String deletarProduto(int id) {
    return "DELETE FROM produtos_alimenticios WHERE id = " + id;
}
}
