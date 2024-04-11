public class SomaParUmaCem {
    public static void main(String[] args) {
        int soma = 0;

        System.out.println("Números pares de 1 a 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
                System.out.print(i + " ");
            }
        }

        System.out.println("\nSoma dos números pares de 1 a 100: " + soma);
    }
}

