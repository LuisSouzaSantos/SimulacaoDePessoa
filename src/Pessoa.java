
public abstract class Pessoa {
	
	protected String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String pergunta() {
		return "Ol�, tudo bem?";
	}
	
	public String respostaPositiva() {
		return "Estou bem sim";
	}
	
	public String respostaNegativa() {
		return "N�o estou bem";
	}
	
	
}
