package controller;

import model.No;

public class ListaDinamicaMetodos {
	
	private No inicio;

	public ListaDinamicaMetodos() {
		inicio = null;
	}

	public void adicionaInicio(int e) {
		No novo = new No(e);
		novo.prox = inicio; 
		inicio = novo; 
	}

	public void adicionaFinal(int e) {
		No novo = new No(e);
		if (inicio == null) {
			inicio = novo;
		} else {
			No aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = novo;
		}
	}

	public void adicionaEspecifica(int e, int pos) {
		if (inicio == null) {
			No novo = new No(e);
			novo.prox = inicio;
			inicio = novo;
		} else {
			No aux = inicio;
			int cont = 1;
			while (aux.prox != null && cont < pos - 1) {
				aux = aux.prox;
				cont++;
			}
			if (cont != pos - 1) {
				System.out.println("Erro! Posição inválida.");
			} else {
				No novo = new No(e);
				novo.prox = aux.prox;
				aux.prox = novo;
			}
		}
	}

	public int removeInicio() {
		int r = -1;
		if (inicio == null) {
			System.out.println("Erro! Lista vazia");
		} else {
			r = inicio.dado;
			inicio = inicio.prox;
		}
		return r;
	}

	public int removeFinal() {
		int r = -1;
		if (inicio == null) {
			System.out.println("Erro! Lista vazia.");
		} else if (inicio.prox == null) {
			r = inicio.dado;
			inicio = null;
		} else {
			No aux1 = inicio;
			No aux2 = null;
			while (aux1.prox != null) {
				aux2 = aux1;
				aux1 = aux1.prox;
			}
			r = aux1.dado;
			aux2.prox = null;
		}
		return r;
	}

	public int removeEspecifica(int pos) {
		int r = -1;
		if (inicio == null) {
			System.out.println("Erro! Lista vazia.");
		} else if (inicio.prox == null) {
			r = inicio.dado;
			inicio = null;
		} else {
			No aux = inicio;
			No aux2 = null;
			int cont = 0;
			while (aux.prox != null && cont < pos - 1) {
				aux2 = aux;
				aux = aux.prox;
				cont++;
			}
			if (cont != pos - 1) {
				System.out.println("Erro! Posição inválida.");
			} else {
				r = aux.dado;
				aux2.prox = aux.prox;
			}
		}
		return r;
	}

	public String toString() {
		String r = "";
		No aux = inicio;
		while (aux != null) {
			r = r + " " + aux.dado;
			aux = aux.prox;
		}
		return r;
	}

}
