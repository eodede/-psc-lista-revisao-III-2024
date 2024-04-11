import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro de 1 a 10: ");
    int num = scanner.nextInt();

    System.out.println("A taboada de " + num + " é:");
    for (int i = 1; i < 10; i++) {
    int resultado = num * i;
    System.out.println(num + " x " + i + " = " + resultado);
    }
    }
}
