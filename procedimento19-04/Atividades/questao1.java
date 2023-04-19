import java.util.Scanner;

public class questao1 {
	
	static Scanner leia = new Scanner (System.in);
	static int opcao = 0;
	static double reais = 0, dolar = 0.30 , yenes = 30.00, valor = 0;;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Insira um valor em reais: ");
		reais = leia.nextInt();
		
		System.out.println("\nDeseja converter para qual moeda?: \n1 - para dólar \n2 - para yenes");
		opcao = leia.nextInt();
		
		if (opcao == 1) {
			conversaoDolar ();
			System.out.println("U$ " + valor);
		
		} else if (opcao == 2) {
			conversaoDolar ();
			System.out.println("¥ " + valor);
			
		} else {
	
			System.out.println("Opção inválida!");
		}
		
	}
	
	static void conversaoDolar () {
		
	valor = reais * dolar;
	}
	
	static void conversaoYenes () {
		valor = reais * yenes;
	}
	
}
