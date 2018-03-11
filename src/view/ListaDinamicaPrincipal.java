package view;

import javax.swing.JOptionPane;

import controller.ListaDinamicaMetodos;

public class ListaDinamicaPrincipal {

	public static void main(String args[]) {

		ListaDinamicaMetodos l = new ListaDinamicaMetodos();
		int opc = 0, element = 0, pos = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Adiciona Início " + "\n 2 - Adiciona Final "
					+ "\n 3 - Adiciona Específica " + "\n 4 - Remove Início " + "\n 5 - Remove Final "
					+ "\n 6 - Remove Específica " + "\n 7 - Mostra Lista " + "\n 9 - Fim."));
			switch (opc) {
			case 1:
				element = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento."));
				l.adicionaInicio(element);
				break;
			case 2:
				element = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento."));
				l.adicionaFinal(element);
				break;
			case 3:
				element = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento."));
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição."));
				l.adicionaEspecifica(element, pos);
				break;
			case 4:
				l.removeInicio();
				break;
			case 5:
				l.removeFinal();
				break;
			case 6:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição."));
				l.removeEspecifica(pos);
				break;
			case 7:
				System.out.println(l.toString());
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida.");
			}
		}
	}

}
