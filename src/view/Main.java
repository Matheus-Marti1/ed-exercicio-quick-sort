package view;

import controller.QuickSortController;

public class Main {

	public static void main(String[] args) {
		QuickSortController qSort = new QuickSortController();

		int vet1[] = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
		int vet2[] = { 44, 43, 42, 41, 40, 39, 38 };
		int vet3[] = { 31, 32, 33, 34, 99, 98, 97, 96 };
		
		System.out.println("Vetor 1:");
		for (int value : vet1) {
			System.out.print(value + "\t");
		}
		
		qSort.quickSort(vet1, 0, vet1.length - 1);
		
		System.out.println();
		System.out.println();
		System.out.println("Vetor 1 Ordenado por Quick Sort:");
		for (int value : vet1) {
			System.out.print(value + "\t");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Vetor 2:");
		for (int value : vet2) {
			System.out.print(value + "\t");
		}
		
		qSort.quickSort(vet2, 0, vet2.length - 1);
		
		System.out.println();
		System.out.println();
		System.out.println("Vetor 2 Ordenado por Quick Sort:");
		for (int value : vet2) {
			System.out.print(value + "\t");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Vetor 3:");
		for (int value : vet3) {
			System.out.print(value + "\t");
		}
		
		qSort.quickSort(vet3, 0, vet3.length - 1);
		
		System.out.println();
		System.out.println();
		System.out.println("Vetor 3 Ordenado por Quick Sort:");
		for (int value : vet3) {
			System.out.print(value + "\t");
		}

	}

}
