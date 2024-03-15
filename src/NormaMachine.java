public class NormaMachine {
    // B1 OU A1 == 0 - POSITIVO
    // B2 OU A2 == 1 - NEGATIVO
    public String addAB(int A1,  int A2, int B1, int B2) {

        if (B1 == 0) {
            while(B2 != 0){
                if(A2 == 0) {
                    A2++;
                    B2--;
                    A1--;
                }
                A2++;
                B2--;
            }
        } else {
            while(B2 != 0){
                if(A2 == 0) {
                    A2--;
                    B2++;
                    A1++;
                }
                A2--;
                B2++;
            }
        }

        return "Resultado da operação A + B: " + A2;
    }

    public String addABWithC(int A, int B){
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
        return "\nResultado A + B com C: " + A + "\nB: " + B + "\nC: " + C;
    }

    public int AReceiveBWithC(int A, int B){
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

       return A;
    }

    public String AMultB(int A, int B){
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

        return "\nA X B = " + E + "\nA: " + A + "\nB: " + B + "\nC: " + C + "\nD: " + D;
    }

    public boolean isPrimo(int A) {
        int B = 0;
        int C = 0;
        C = AReceiveBWithC(C, A);

        while(C != 0) {
            if (A % C == 0) {
                B++;
            }
            C--;
        }
        B--;
        B--;

        return B == 0;
    }

}
