package ProjetoLoja;

public class Item {
     //utilizei metodos GET e SET para facilitar na busca das informaçoes de cada item
	private Produtos produto;
	private int quantidade;
	
	public Item(Produtos p, int qtd) {
		this.produto = p;
		this.quantidade = qtd;
	}
	
	public Produtos getProduto(){
	 return produto;
	}
	
	public int getQuantidade(){
		return quantidade;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
		
	}

   public void setQuantidade(int quantidade) {
	   this.quantidade = quantidade;
   }



}






