package jogador;

public class Jogador {
	private String nome;
	private Clube clube;
	private int gols;
	private int partidas;
	
	// construtor
	public Jogador (String nome) {
		this.nome = nome;
	}
	
	// getters e setters
	public String getNome() {
		return nome;
	}
	//public void setNome(String nome) {
	//	this.nome = nome;
	//}
	
	public Clube getClube() {
		return clube;
	}
	public void setClube(Clube clube) {
		this.clube = clube;
	}
	
	public String getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}
	
	public int getPartidas() {
		return partidas;
	}
	public void setPartidas(int partidas) {
		this.partidas = partidas;
	}
	
	public void imprimeInformacoes() {
		System.out.println("Nome: " + getNome());
		System.out.println("Clube: " + clube.getNome());
		System.out.println("Gols: " + gols);
		System.out.println("Partidas: " + partidas);
		System.out.println();
	}
	
	public String toString() {
		return nome;
	}
}
