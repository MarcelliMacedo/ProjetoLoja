package ProjetoLoja;

	import java.util.ArrayList;

     //ações para simular uma compra no site
	
public class ItemVenda {

	private ArrayList<Item> compras;
	
	public ItemVenda() {
		this.compras = new ArrayList<>();
	}
	
	public void inserirItem(Item item) {
		this.compras.add(item);
	}
	
	public void removerItem(Item item) {
		this.compras.remove(item);
	}
	
	public void finalizarCompra(){
		@SuppressWarnings("unused")
		Double valorTotal = null;
		System.out.println("==================================");
		System.out.println("  compra finalizada :) volte sempre!");
	}
	
	public void imprimirCompra() {
		float valorTotal = 0;
		
		for(Item itemCompra: compras) {
			String nomeProduto  = itemCompra.getProduto().getNome();
			float precoProduto = itemCompra.getProduto().getPreco();
			int qtd = itemCompra.getQuantidade();
			
			System.out.println("Produto: " + nomeProduto);
			System.out.println("Valor: R$" + precoProduto);
			System.out.println("Quantidade " + qtd);
			System.out.println("Total: " + precoProduto*qtd);
			
			valorTotal += precoProduto*qtd;
			
			
			System.out.println("...................................");
			
			
		}
		
		System.out.println ("O total da compra é R$: " + valorTotal);
	}
}
