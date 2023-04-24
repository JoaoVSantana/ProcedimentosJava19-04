package Funcoes;

import java.util.Scanner;
import java.util.Random;

public class questao1 {
	
	static Scanner leia = new Scanner (System.in);
	static Random aleatorio = new Random();
	static int numero, palpite, tentativas = 0;

	public static void main(String[] args) {
		
		numero = aleatorio.nextInt(1000) + 1;
		
		System.out.println("Um numero foi sorteado...\n");
		
		do {

		System.out.println("Digite seu palpite: ");
		palpite = leia.nextInt();
		
		if(palpite != numero) {
			if(palpite > numero) {
			System.out.println("Palpite incorreto, tente um numero menor\n");
			tentativas ++;
			
			} else if (palpite < numero) {
				System.out.println("Palpite incorreto, tente um numero maior\n");
				tentativas ++;
			}
		} else {
			tentativas ++;
			System.out.println("Acertou! o número sorteado era " + numero);
			System.out.println("Tentaivas necessárias: " + tentativas);
		}
		
		} while(palpite != numero);
		
	}

}
