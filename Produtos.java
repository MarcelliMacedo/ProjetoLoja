package ProjetoLoja;

public class Produtos {
	
	private String nomep;
	private int quantidade;
	private float preco;
	private String cor;
	
	
	public Produtos () {
		this.nomep = "";
		this.quantidade = 0;
		this.preco = 0;
		
	}
		public String getNome () {
		return nomep;
		}
	
	
	public void setNomep (String nomep) {
	    this.nomep = nomep;
	
	}
	
	  public int getQuantidade() {
	  return quantidade;
	  }
	  
	  
	  
	public void setQuantidade (int quantidade) {
		this.quantidade = quantidade;
		
		
	}
	
	public float getPreco() {
	return preco;
	}
	
	
	
	public void setPreco (float preco) {
		this.preco = preco;
	}
	
	
	public String getCor(){
    return cor;
	}
	
	
	
	public void setCor (String cor) {
		this.cor = cor;
	}
	
	
}
