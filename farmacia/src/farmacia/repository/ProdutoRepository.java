package farmacia.repository;

import model.Produto;

public interface ProdutoRepository {

	public boolean criaProduto(Produto produto);
	
	public void listaProdutos();
	
	public boolean consultaProduto(int id);
	
	public boolean atualizaProduto(int id, String nome, int tipo, double preco);
	
	public boolean deletaProduto(int id);
	
}
