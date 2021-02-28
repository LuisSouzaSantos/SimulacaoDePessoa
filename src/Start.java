
public class Start {

	
	public static void main(String[] args) {
		
		Pessoa pessoaCorinthiano = new Corinthiano();
		pessoaCorinthiano.setNome("Rogério");
		Pessoa pessoaPalmeirense = new Palmeirense();
		pessoaPalmeirense.setNome("Carla");
		
		System.out.println(pessoaCorinthiano.pergunta());
		System.out.println(pessoaPalmeirense.respostaPositiva());
		System.out.println("----------------------------");		
		System.out.println(pessoaPalmeirense.pergunta());
		System.out.println(pessoaCorinthiano.respostaPositiva());
		System.out.println("----------------------------");
		
		Corinthiano corinthiano = new Corinthiano();
		corinthiano.setNome("Pamela");
		Palmeirense palmeirense = new Palmeirense();
		palmeirense.setNome("Romulo");
		
		System.out.println(corinthiano.pergunta());
		System.out.println(palmeirense.respostaNegativa());
		System.out.println("----------------------------");		
		System.out.println(palmeirense.pergunta());
		System.out.println(corinthiano.respostaNegativa());
		System.out.println("----------------------------");
		
		
	}
}
