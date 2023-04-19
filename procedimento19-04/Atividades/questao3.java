import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class questao3 {

	static Scanner sc = new Scanner(System.in);
	static Locale local;
	static LocalDate hoje = LocalDate.now();
	static DateTimeFormatter formato;
	static int dias, opcaoLocal;
	static LocalDate dataNova;
	static String dataFormatada;
	
	public static void main(String[] args) {
		
		System.out.print("Digite o n�mero de dias: ");
		dias = sc.nextInt();
		
		adicionarDias();
		
		System.out.println("Voc� quer formatar em que linguagem: \n1 - Portugu�s \n2 - Ingl�s \n3 - Franc�s \n4 - Espanhol \n-> ");
		opcaoLocal = sc.nextInt();
		
		switch (opcaoLocal) {
		case 1:
			local = new Locale("pt", "BR");
			break;
		case 2:
			local = new Locale("en", "US");
			break;
		case 3:
			local = new Locale("fr", "FR");
			break;
		case 4:
			local = new Locale("es", "ES");
			break;
		default:
			System.out.println("Op��o inv�lida!");
		}
		
		if (opcaoLocal == 2) {
			formato = DateTimeFormatter.ofPattern("MM/dd/yyyy (EEEE)", local);
		} else {
			formato = DateTimeFormatter.ofPattern("dd/MM/yyyy (EEEE)", local);			
		}
		
		formatarData();
		
		System.out.println("Daqui a " + dias + " dias ser�: " + dataFormatada);		
		
		sc.close();

	}
	
	static void adicionarDias() {
		dataNova = hoje.plusDays(dias);	
	}
	
	static void formatarData() {
		dataFormatada = dataNova.format(formato);		
	}

}