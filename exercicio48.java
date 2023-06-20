import java.util.*;

public class exercicio48 {
    public static int total = 0;
    public static int numero = 0;

    public static void main(String[] args) {
        System.out.printf("Coloquem números para serem somados até você colocar input '0'.\n");
        do {
            System.out.printf("Coloque o próximo número: ");
            scan();
        } while (numero != 0);
        System.out.printf("O total é "+total);
    }

    private static void scan() {
        Scanner scanner = new Scanner(System.in);
        try {
            numero = scanner.nextInt();
            total = total + numero;
        } catch (InputMismatchException e) {
            System.out.printf("Peguei o erro!  ");
        }
    }

}


