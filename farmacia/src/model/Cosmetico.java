package model;

public class Cosmetico extends Produto {

	private String fragancia;
	
	// Constructor
	
	public Cosmetico(int id, String nome, int tipo, double preco, String fragancia) {
		super(id, nome, tipo, preco);
		this.fragancia = fragancia;
	}
	
	// Getters e Setters
	
	public String getFragancia() {
		return fragancia;
	}

	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}
	
	// Métodos
	@Override
	public void visualizar() {
		System.out.printf("╔═══════════════════════════════════════════════════╗%n");
		System.out.printf("║                   DADOS DO PRODUTO                ║%n");
		System.out.printf("╠═══════════════════════════════════════════════════╣%n");
		System.out.printf("║ ID do Produto: %-23s            ║%n", this.getId());
		System.out.printf("║ Nome do Produto: %-21s            ║%n", this.getNome());
		System.out.printf("║ Tipo do Produto: %-21s            ║%n", this.getTipo());
		System.out.printf("║ Preco do Produto: %-20s            ║%n", this.getPreco());
		System.out.printf("║ Fragancia: %-27s            ║%n", this.fragancia);
		System.out.printf("╚═══════════════════════════════════════════════════╝%n");
	}
	

}
