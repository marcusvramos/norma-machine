public class NormaMachine {
    // B1 OU A1 == 0 - POSITIVO
    // B2 OU A2 == 1 - NEGATIVO
    public String addAB(int A1,  int A2, int B1, int B2) {
        System.out.println("\nOperação de soma de A + B");

        System.out.println("Valores iniciais: " + "A1: " + A1 + " A2: " + A2 + " B1: " + B1 + " B2: " + B2 + "\n");

        if (B1 == 0) {
            while(B2 != 0){
                if(A2 == 0) {
                    A2++;
                    B2--;
                    A1--;
                    System.out.println("A1: " + A1 + " A2: " + A2 + " B1: " + B1 + " B2: " + B2);
                }
                A2++;
                B2--;
                System.out.println("A1: " + A1 + " A2: " + A2 + " B1: " + B1 + " B2: " + B2);
            }
        } else {
            while(B2 != 0){
                if(A2 == 0) {
                    A2--;
                    B2++;
                    A1++;
                    System.out.println("A1: " + A1 + " A2: " + A2 + " B1: " + B1 + " B2: " + B2);
                }
                A2--;
                B2++;
                System.out.println("A1: " + A1 + " A2: " + A2 + " B1: " + B1 + " B2: " + B2);
            }
        }

        return "Valores finais da operação: " + "A1: " + A1 + " A2: " + A2 + " B1: " + B1 + " B2: " + B2;
    }

    public String addABWithC(int A, int B){
        System.out.println("\nOperação de soma de A + B com C");
        int C = 0;
        System.out.println("Valores iniciais: " + "A: " + A + " B: " + B + " C: " + C + "\n");
        while(B != 0){
            B--;
            C++;
            System.out.println("A: " + A + " B: " + B + "C: " + C);
        }

        while(C != 0){
            C--;
            A++;
            B++;
            System.out.println("A: " + A + " B: " + B + "C: " + C);
        }
        return "\nResultado A + B com C = " + " A: " + A + " B: " + B + " C: " + C;
    }

    public int AReceiveBWithC(int A, int B){
       int C = 0;
       System.out.println("\nOperação de A recebe B com C");
       System.out.println("Valores iniciais: " + "A: " + A + " B: " + B + " C: " + C + "\n");
       while(B != 0){
           B--;
           C++;
           System.out.println("A: " + A + " B: " + B + "C: " + C);
       }

       while(A != 0){
           A--;
           System.out.println("A: " + A + " B: " + B + "C: " + C);
       }

       while(C != 0){
           A++;
           B++;
           C--;
           System.out.println("A: " + A + " B: " + B + "C: " + C);
       }

        System.out.println("Resultado de A recebe B com C = " + "A: " + A + " B: " + B + " C: " + C + "\n");

       return A;
    }

    public String AMultB(int A, int B){
        int C = 0, D = 0, E = 0;
        System.out.println("\nOperação de multiplicação de A * B");
        System.out.println("Valores iniciais: " + "A: " + A + " B: " + B + "C: " + C + "D: " + D + "E: " + E + "\n");

        while(B != 0){
            C++;
            B--;
            System.out.println("A: " + A + " B: " + B + "C: " + C + "D: " + D + "E: " + E);
        }

        while(C != 0){
            B++;
            C--;
            System.out.println("A: " + A + " B: " + B + "C: " + C + "D: " + D + "E: " + E);
            while(A != 0){
                A--;
                D++;
                E++;
                System.out.println("A: " + A + " B: " + B + "C: " + C + "D: " + D + "E: " + E);
            }
            while(D!=0){
                D--;
                A++;
                System.out.println("A: " + A + " B: " + B + "C: " + C + "D: " + D + "E: " + E);
            }
        }

        return "Resultado de A * B: " + A + " B: " + B + " C: " + C + " D: " + D + " E: " + E;
    }

    public boolean isPrimo(int A) {
        int B = 0;
        int C = 0;
        System.out.println("\nOperação de verificação de número primo");
        System.out.println("Valores iniciais: " + "A: " + A + " B: " + B + "C: " + C + "\n");
        C = AReceiveBWithC(C, A);

        while(C != 0) {
            if (A % C == 0) {
                B++;
                System.out.println("A: " + A + " B: " + B + "C: " + C);
            }
            C--;
            System.out.println("A: " + A + " B: " + B + "C: " + C);
        }
        B--;
        B--;
        System.out.println("A: " + A + " B: " + B + "C: " + C + "\n");

        return B == 0;
    }

}
