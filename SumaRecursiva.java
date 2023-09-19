import java.util.Scanner;

public class SumaRecursiva {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese un numero como limite inferior:");
            int limI = scanner.nextInt();

            System.out.println("Ingrese un numero como limite superior:");
            int limS = scanner.nextInt();

            int sumatoria = calcularSumatoria(limI, limS);

            System.out.println("La sumatoria de los cuadrados es: " + sumatoria);
        }
    }

    private static int calcularSumatoria(int limI, int limS) {
        if (limI > limS) {
            return 0;
        } else {
            int cuadrado = limI * limI;
            return cuadrado + calcularSumatoria(limI + 1, limS);
        }
    }
}