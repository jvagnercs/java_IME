package jogador;

class Main {
	public static void main(String[] args) {
		
		Clube clube = new Clube("PSG", 1902, 11);
		
		Jogador neymar = new Jogador("Neymar Junior");
		// neymar.setNome();
		neymar.setClube(clube);
		neymar.setGols(8);
		neymar.setPartidas(19);
		
		System.out.println(neymar.toString());
		
		/*Jogador cr7 = new Jogador();
		cr7.setNome("Cristino Ronaldo");
		cr7.clube = "Juventus";
		cr7.gols = 19;
		cr7.partidas = 11;
		*/
		neymar.imprimeInformacoes();
		// cr7.imprimeInformacoes();

		//System.out.println(neymar.clube);
	
	}
}