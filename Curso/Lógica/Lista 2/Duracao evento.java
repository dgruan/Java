import java.util.Scanner;

public class exercicios {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int horaInicial, horaFinal, duracaoTotal;

		System.out.print("Digite a hora inicial do evento: ");
		horaInicial = sc.nextInt();

		System.out.print("Digite a hora que o evento se encerrou: ");
		horaFinal = sc.nextInt();

		if (horaInicial < horaFinal) {
			duracaoTotal = horaFinal - horaInicial;
		} else if (horaInicial > horaFinal) {
			duracaoTotal = (24 - horaInicial) + horaFinal;
		} else {
			duracaoTotal = 24;
		}

		System.out.printf("O JOGO DUROU %d HORA(S)", duracaoTotal);

		sc.close();
	}
}
