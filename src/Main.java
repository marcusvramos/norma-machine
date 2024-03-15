import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NormaMachine machine = new NormaMachine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("A é negativo (1 - NEGATIVO ou 0 - POSITIVO): ");
        int A1 = scanner.nextInt();

        System.out.println("VALOR DE A: ");
        int A2 = scanner.nextInt();

        System.out.println("B é negativo (1 - NEGATIVO ou 0 - POSITIVO): ");
        int B1 = scanner.nextInt();

        System.out.println("VALOR DE B: ");
        int B2 = scanner.nextInt();

        String res1 = machine.addAB(A1,A2,B1,B2);
        System.out.println(res1);

        String res2 = machine.addABWithC(9,3);
        System.out.println(res2);

        int res3 = machine.AReceiveBWithC(3,8);
        System.out.println("A = " + res3);

        String res4 = machine.AMultB(8,4);
        System.out.println(res4);

        boolean isPrimo = machine.isPrimo(1);
        if (isPrimo) System.out.println("Número é primo");
        else System.out.println("Número não é primo");
    }
}