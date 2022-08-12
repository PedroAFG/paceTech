package DesafioBingo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class DesafioBingo {

	public static void main(String[] args) {
		
		LinkedList<Integer> numerosSorteados = new LinkedList<Integer> ();
		
		Scanner teclado = new Scanner(System.in);
		
		int numeros = 0;
		
		int maior, menor = 0;
		
		System.out.println("Insira os numeros sorteados, para finalizar digite -1");
		
		while (numeros != -1) {
			numeros = teclado.nextInt();
			
			if (numeros != - 1) {
				numerosSorteados.add(numeros);
			}
		}
		System.out.println("");
		
		for (Integer sequencia : numerosSorteados) {
			System.out.println(sequencia);	
		}
		
		maior = Collections.max(numerosSorteados);
		menor = Collections.min(numerosSorteados);
		
		
		System.out.println("Os numeros sorteados foram: " +numerosSorteados);
		System.out.println("O maior número digitado foi: " +maior);
		System.out.println("O maior número digitado foi: " +menor);
		System.out.println("Foram digitados " +numerosSorteados.size()+ " números");
		
		teclado.close();

	}


}
