package MetodosMatematicos;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Arredondamento de Notas: Peça ao usuário para inserir uma nota com casas
		 * decimais e use Math.ceil para arredondá-la para cima para o próximo valor
		 * inteiro.
		 */

		double nota = 0;

		do {

			try {
				nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua nota"));

				if (nota < 0) {
					JOptionPane.showMessageDialog(null, "Não é possivel cadastrar uma nota negativa \n ERRO");
					break;
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Você digitou algo diferente de um número \n ERRO");
				break;
			}

			JOptionPane.showMessageDialog(null, "Sua nota é = " + Math.ceil(nota));

		}

		while (nota != 0);

	}

}
