package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import entities.Funcionario;

public class FuncionarioRepository {

	public void exportarDados(Funcionario funcionario) {

		try {

			var fileWrite = new FileWriter("c:\\temp\\funcionarios.txt", true);
			var printWrite = new PrintWriter(fileWrite);

			printWrite.write("\nId do Funcionário.....:" + funcionario.getId());
			printWrite.write("\nNome......:" + funcionario.getNome());
			printWrite.write("\nMatrícula.......:" + funcionario.getMatricula());
			printWrite.write("\nData de admissão.......:" + funcionario.getDataAdmissao());
			printWrite.write("\nTipo de contratação.........:" + funcionario.getTipoContratacao());
			printWrite.write("\n");

			printWrite.close();

			JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");

		}

		catch (Exception e) {

			System.out.println("\nFalha ao gravar o arquivo: " + e.getMessage());
		}
	}

}
