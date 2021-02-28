
public class Corinthiano extends Pessoa implements TorcedorInterface {
	
	@Override
	public String respostaPositiva() {
		return this.nome+": Manooooooooo "+super.respostaPositiva();
	}
	
	@Override
	public String respostaNegativa() {
		return this.nome+": Corinthians perdeu ontem, "+super.respostaNegativa();
	}

	@Override
	public int getCampeonatoBrasileiro() {
		return 7;
	}

	@Override
	public int getMundial() {
		return 2;
	}
}
