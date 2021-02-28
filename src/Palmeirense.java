
public class Palmeirense extends Pessoa implements TorcedorInterface {

	@Override
	public String respostaPositiva() {
		return this.nome+": Oinc Oinc, "+super.respostaPositiva();
	}
	
	@Override
	public String respostaNegativa() {
		return this.nome+": Sem mundial, "+super.respostaNegativa();
	}

	@Override
	public int getCampeonatoBrasileiro() {
		return 10;
	}

	@Override
	public int getMundial() {
		return 0;
	}
	
}
