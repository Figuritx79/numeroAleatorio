import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int intentos = 3;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroRandom = random.nextInt(10);

        System.out.println("Ingresa el numero");
        int numeroIngresado = scanner.nextInt();
        System.out.println(numeroRandom);
        for (int i = 1; i < 3; i++) {
            if (numeroIngresado == numeroRandom) {
                System.out.println("Adivinaste el numero en el " + i + " Intento");
                System.exit(0);
            } else {
                if (numeroIngresado > numeroRandom) {
                    System.out.println("El numero que ingresaste es mayor al numero random,vuelve a ingresarlo");
                    System.out.println("LO siento no adivinaste el numero, te restan " + intentos + " Intentos");
                    System.out.println("-------------------------------------------------");
                } else {
                    System.out.println("El numero que ingresaste es menor al numero random, vuelve a ingresarlo");
                    System.out.println("LO siento no adivinaste el numero, te restan " + intentos + " Intentos");
                    System.out.println("-------------------------------------------------");
                }
                System.out.println("Ingresa el numero");
                numeroIngresado = scanner.nextInt();
                intentos = intentos - 1;
            }
        }

        scanner.close();
    }
}
