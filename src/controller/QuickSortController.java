package controller;

import br.edu.fateczl.matheus.marti.ordenar.vetores.OrdenarVetor;

public class QuickSortController {

	public QuickSortController() {
		super();
	}

	public int[] quickSort (int[] vet, int inicio, int fim) {
		OrdenarVetor ordVet = new OrdenarVetor();
		int[] vetOrdenado = ordVet.quickSort(vet, inicio, fim);
		return vetOrdenado;
	}
	
}
