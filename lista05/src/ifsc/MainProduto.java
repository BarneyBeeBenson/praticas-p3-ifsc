package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.setCodBarras(1234567l);
		p1.setFornecedor("Coca-cola");
		p1.setNome("Veja");
		p1.setPreco(2d);
		
		Produto p2 = new Produto();
		p2.setCodBarras(1249677l);
		p2.setFornecedor("Diney");
		p2.setNome("A própria Marvel");
		p2.setPreco(2000000000000d);
		
		Produto p3 = new Produto();
		p3.setCodBarras(3340895l);
		p3.setFornecedor("Seu Zé");
		p3.setNome("gato frito");
		p3.setPreco(7.50d);
		
		ArrayList<Produto> produto = new ArrayList<Produto>();
		produto.add(p1);
		produto.add(p2);
		produto.add(p3);
		for (Produto i : produto) {
			System.out.println(i.getFornecedor());
			System.out.println(i.getNome());
			System.out.println(i.getCodBarras());
			System.out.println(i.getPreco());
		}

	}

}
