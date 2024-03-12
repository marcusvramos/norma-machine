public class NormaMachine {
    public void addAB(int A, int B) {
        while(B != 0){
            A++;
            B--;
        }
        System.out.println("A: " + A + " B: " + B);
    }

    public void addABWithC(int A, int B){
        int C = 0;
        while(B != 0){
            B--;
            C++;
        }

        while(C != 0){
            C--;
            A++;
            B++;
        }
        System.out.println("A: " + A + " B: " + B + " C: " + C);
    }

    public void AReceiveBWithC(int A, int B){
       int C = 0;
       while(B != 0){
           B--;
           C++;
       }

       while(A != 0){
           A--;
       }

       while(C != 0){
           A++;
           B++;
           C--;
       }
       System.out.println("A: " + A + " B: " + B + " C: " + C);
    }

    public void AMultB(int A, int B){
        int C = 0, D = 0, E = 0;

        while(B != 0){
            C++;
            B--;
        }

        while(C != 0){
            B++;
            C--;
            while(A != 0){
                A--;
                D++;
                E++;
            }
            while(D!=0){
                D--;
                A++;
            }
        }

        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D + " Resultado final: " + E);
    }
}
