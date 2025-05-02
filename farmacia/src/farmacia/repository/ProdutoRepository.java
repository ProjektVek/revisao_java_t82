package farmacia.repository;

public interface ProdutoRepository {

	public boolean criaProduto();
	
	public void listaProdutos();
	
	public boolean consultaProduto();
	
	public boolean atualizaProduto();
	
	public boolean deletaProduto();
	
}
