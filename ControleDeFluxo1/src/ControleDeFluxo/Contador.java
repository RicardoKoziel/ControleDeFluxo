package ControleDeFluxo;

import java.util.Iterator;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite um número: ");
		numero1 = leitor.nextInt();
		System.out.println("Digite outro número: ");
		numero2 = leitor.nextInt();
		
		try {
			contar(numero1, numero2);
		} catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		leitor.close();
	}
	
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo deve ser maior que o primeiro");
		}
		
		int contagem = parametroUm - parametroDois;
		
		for (int i = 0; i < contagem; i++) {
			System.out.println("número: " + i);
		}
}
}