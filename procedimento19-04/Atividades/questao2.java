import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class questao2 {

	static int dia = 19, mes = 4, ano = 2023, q = 0, diaSemana = 0;
	static String diaSemanaE = "";
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date now = new Date();

		System.out.println("Quantos dias deseja calcular?: ");
		q = leia.nextInt();

		dia = dia + q;

		calculo();

		System.out.println("Daqui a " + q + " dias será " + dia + "/" + mes + "/" + ano + " " + diaSemanaE);

		// diaSemana = dia % 7;
		// diaSemanaE = diasSemana[diaSemana - 1];

	}

	static void calculo() {

		String[] diasSemana = { "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo", "Segunda-feira",
				"Terca-feira" };

		while (dia >= 31) {
			mes++;
			dia = dia - 29;

		}

		while (mes >= 13) {
			ano++;
			mes = mes - 11;
		}

		int diaSemana = q % 7;
		diaSemanaE = diasSemana[diaSemana];
	}
}
