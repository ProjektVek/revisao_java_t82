import java.util.Scanner;

import farmacia.controller.ProdutoController;
import model.Cosmetico;
import model.Medicamento;
import model.Produto;

public class Menu {

	public static void main(String[] args) {
		
		int opcao = 0 ;
		Scanner leia = new Scanner(System.in);
		ProdutoController produtos = new ProdutoController();
		
		produtos.criaProduto(new Produto(1, "Trivium", 2, 500));
		produtos.criaProduto(new Produto(2, "Iron Maiden", 1, 1000));
		produtos.criaProduto(new Produto(3, "Gojira", 3, 3000));
		
		while(true) {
			System.out.printf("╔═══════════════════════════════════════════════════╗%n");
			System.out.printf("║                   Farmácia Online                 ║%n");
			System.out.printf("╠═══════════════════════════════════════════════════╣%n");
			System.out.printf("║                 1 - Criar Produto                 ║%n");
			System.out.printf("║                 2 - Listar Produto                ║%n");
			System.out.printf("║                 3 - Consultar Produto             ║%n");
			System.out.printf("║                 4 - Atualizar Produto             ║%n");
			System.out.printf("║                 5 - Deletar Produto               ║%n");
			System.out.printf("╠═══════════════════════════════════════════════════╣%n");
			System.out.printf("║ Digite a Opção Desejada: ");
				try {
					opcao = leia.nextInt();
				} catch(Exception e) {
					System.out.printf("║ Entrada Inválida, digite novamente: ");
				}
			System.out.printf("╚═══════════════════════════════════════════════════╝%n");
			
			switch(opcao) {
			
			case 1:
				break;
				
			case 2:
				produtos.listaProdutos();
				break;
				
			case 3:
				int id = 0;
				System.out.printf("╔═══════════════════════════════════════════════════╗%n");
				System.out.printf("║ Digite o Id do Produto: ");
				try {
					id = leia.nextInt();
				} catch(Exception e) {
					System.out.printf("║ Entrada Inválida, digite novamente: ");
				}
				System.out.printf("╚═══════════════════════════════════════════════════╝%n");
				if(!produtos.consultaProduto(id)) {
					
					System.out.printf("╔═══════════════════════════════════════════════════╗%n");
					System.out.printf("║               Produto Não encontrado!             ║%n");
					System.out.printf("╚═══════════════════════════════════════════════════╝%n");
				}
				break;
				
			case 4:
				break;
				
			case 5:
				int id5 = 0;
				System.out.printf("╔═══════════════════════════════════════════════════╗%n");
				System.out.printf("║ Digite o Id do Produto: ");
				try {
					id5 = leia.nextInt();
				} catch(Exception e) {
					System.out.printf("║ Entrada Inválida, digite novamente: ");
				}
				System.out.printf("╚═══════════════════════════════════════════════════╝%n");
				if(produtos.deletaProduto(id5)) {
					System.out.printf("╔═══════════════════════════════════════════════════╗%n");
					System.out.printf("║           Produto Deletado Com Sucesso!           ║%n");
					System.out.printf("╚═══════════════════════════════════════════════════╝%n");
				} else {
					System.out.printf("╔═══════════════════════════════════════════════════╗%n");
					System.out.printf("║               Produto Não encontrado!             ║%n");
					System.out.printf("╚═══════════════════════════════════════════════════╝%n");
				}
				break;
				
			}
		}

	}

}
