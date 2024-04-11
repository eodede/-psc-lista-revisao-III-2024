import java.util.Scanner;
import java.util.Random;

public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(15) + 1;
        int tentativas = 0;
        int tentativa;

        System.out.println("Bem-vindo ao Jogo da Adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        do {
            System.out.print("Digite a sua tentativa: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto em " + tentativas + " tentativas.");
            }
        } while (tentativa != numeroSecreto);

        scanner.close();
    }
}
