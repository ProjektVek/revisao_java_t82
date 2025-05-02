package model;

public class Medicamento extends Produto {
	
	private String generico;
	
	// Constructor
	
	public Medicamento(int id, String nome, int tipo, double preco, String generico) {
		super(id, nome, tipo, preco);
		this.generico = generico;
	}
	
	// Getters e Setters
	
	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
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
		System.out.printf("║ Generico: %-28s            ║%n", this.generico);
		System.out.printf("╚═══════════════════════════════════════════════════╝%n");
	}

}
