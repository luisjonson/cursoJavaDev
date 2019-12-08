package cursojava.classes;

public class TestandoClasseFilhas {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("jonson");
		aluno.setNomeEscola("dev");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("lasdkbhkvjblakjsnbvl");
		diretor.setNome("Egidio");
		diretor.setIdade(20);

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNome("njkbakjsbhgo");
		secretario.setIdade(40);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println(aluno.salario());
		System.out.println(secretario.salario());
		System.out.println("Salario bonificado " + diretor.salario());
		System.out.println("------------------------------------------");
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}

	public static void teste(Pessoa pessoa) {
		
		System.out.println("Essa pessoa é demais " +
		pessoa.getNome() + " e o salario é de " + pessoa.salario());
		
	}
}
