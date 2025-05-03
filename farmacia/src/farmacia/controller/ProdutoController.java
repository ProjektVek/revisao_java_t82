package farmacia.controller;

import java.util.ArrayList;

import farmacia.repository.ProdutoRepository;
import model.Produto;

public class ProdutoController implements ProdutoRepository {
	
	private ArrayList<Produto> produtos = new ArrayList<Produto>();

	@Override
	public void listaProdutos() {
		for(Produto produto : this.produtos) {
			produto.visualizar();
		}
	}

	@Override
	public boolean criaProduto(Produto produto) {
		try {
			produtos.add(produto);
			return true;
		} catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean consultaProduto(int id) {
		for(Produto produto : this.produtos) {
			if(produto.getId() == id) {
				produto.visualizar();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean atualizaProduto(int id, String nome, int tipo, double preco) {
		Produto produtoAtualizado = new Produto(id,nome,tipo,preco);
		for (int i = 0; i < this.produtos.size(); i++) {
			if(this.produtos.get(i).getId() == id) {
				this.produtos.set(i, produtoAtualizado);
			}
		}
		return false;
	}

	@Override
	public boolean deletaProduto(int id) {
		for(Produto produto : this.produtos) {
			if(produto.getId() == id) {
				this.produtos.remove(produto);
				return true;
			}
		}
		return false;
	}

}
