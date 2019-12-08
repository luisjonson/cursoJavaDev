
package cursojava.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.auxiliares.FuncaoAutenticacao;
import cursojava.interfaces.PermitirAcesso;

public class Principal {
	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe a login");
		String senha = JOptionPane.showInputDialog("Informe a senha");

		List<Aluno> alunos = new ArrayList<Aluno>();

		// FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();

		// PermitirAcesso permitirAcesso = new Secretario(login, senha);

		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {// vou travar o contrato para autoriza
																				// somente quem realmente tem o contrato
																				// 100% legitimo.

			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 2; qtd++) {
				String nome = JOptionPane.showInputDialog("Qual é o nome do aluno" + qtd + " ?");

				String idade = JOptionPane.showInputDialog("Qual a Idade?");
				String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
				String rg = JOptionPane.showInputDialog("Registro geral?:");
				String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
				String mae = JOptionPane.showInputDialog("Nome da mãe");
				String pai = JOptionPane.showInputDialog("Nome do pai");
				String matricula = JOptionPane.showInputDialog("Data da matricula");
				String serie = JOptionPane.showInputDialog("Qual a serie");
				String escola = JOptionPane.showInputDialog("Nome da escola");

				Aluno aluno1 = new Aluno();

				aluno1.setNome(nome);

				aluno1.setIdade(Integer.valueOf(idade));
				aluno1.setDataNascimento(dataNascimento);
				aluno1.setRegistroGeral(rg);
				aluno1.setNumeroCpf(cpf);
				aluno1.setNomeMae(mae);
				aluno1.setNomePai(pai);
				aluno1.setDateMatricula(matricula);
				aluno1.setSerieMatricula(serie);
				aluno1.setNomeEscola(escola);

				Disciplina disciplina1 = new Disciplina();
				disciplina1.setDisciplina("Java");
				disciplina1.setNota(10);

				Disciplina disciplina2 = new Disciplina();
				disciplina2.setDisciplina("php");
				disciplina2.setNota(10);

				Disciplina disciplina3 = new Disciplina();
				disciplina3.setDisciplina("javascript");
				disciplina3.setNota(20);

				Disciplina disciplina4 = new Disciplina();
				disciplina4.setDisciplina("Banco de dados");
				disciplina4.setNota(80);

				for (int pos = 1; pos <= 4; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Digite a Disciplina " + pos);
					String nomeNota = JOptionPane.showInputDialog("Digite a nota " + pos);

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(nomeNota));

					aluno1.getDiciplinas().add(disciplina);

				}

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remmover uma disciplina");

				if (escolha == 0) {// Opão sin é zero

					int continuarRemover = 0;
					int posicao = 1;
					while (continuarRemover == 0) {
						String diciplinaRemove = JOptionPane
								.showInputDialog("Qual disciplina deseja remover 1, 2, 3 ou 4 ?");
						// -1 ordena a lista para remover o resultado correto.
						aluno1.getDiciplinas().remove(Integer.valueOf(diciplinaRemove).intValue() - posicao);
						posicao++;

						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
					}

				}

				alunos.add(aluno1);

			}
			for (Aluno aluno : alunos) {
				if (aluno.getNome().equalsIgnoreCase("Jonson")) {
					// System.out.println(aluno);
					System.out.println("Media do aluno " + aluno.getMediaNota());
					System.out.println("Resultado " + aluno.getAlunoAprovado());
				}

				System.out.println("_____________________________________");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso Negado.");
		}
	}
}
