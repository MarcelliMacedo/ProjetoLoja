package ProjetoLoja;

public class Main {

	public static void main(String[] args) {
		ItemVenda sacola = new ItemVenda();
	
		//simulando um banco de dados com dados dos itens
		
		Produtos pA = new Produtos();
		pA.setNomep("Maça");
		pA.setQuantidade(1);
		pA.setPreco (5.50f);
		pA.setCor ("vermelha");
		
		
		
		Produtos pB = new Produtos();
		pB.setNomep ("Banana");
		pB.setQuantidade(1);
		pB.setPreco (10.99f);
		pB.setCor ("amarelo");
		
		
		
		Produtos pC = new Produtos();
		pC.setNomep ("Melancia");
		pC.setQuantidade(1);
		pC.setPreco (21.90f);
		pC.setCor ("verde");

	
	
		Item item1 = new Item(pA, 2);
		Item item2 = new Item(pC, 4);
		
		//adicionando itens na sacola
		
		sacola.inserirItem(item1);
		sacola.inserirItem(item2);
		
		//opção para remover itens da sacola
		
		sacola.removerItem(item2);
		
		sacola.imprimirCompra();
		
		sacola.finalizarCompra();
		
		
	}

}
