public class NormaMachine {
    private int A;
    private int B;
    private int C = 0;
    private int D;

    public void addAB() {
        int aux = 0;
        while(aux == 0){
            A++;
            B--;
            if(B == 0) aux = aux + 1;
        }
    }

    public void addABWithC(){
        int aux = 0;
        while(aux == 0){
            B--;
            C++;
            if (B == 0) aux = aux + 1;
        }

        aux = 0;
        while(aux == 0){
            C--;
            A++;
            B++;
            if (C == 0) aux += 1;
        }
    }

    public void AReceiveBWithC(){
        int aux = 0;
        while (aux == 0) {
            B--;
            A++;
            C++;
            if (B == 0) aux += 1;
        }

        aux = 0;
        while(aux == 0) {
            B++;
            C--;
            if (C == 0) aux += 1;
        }
    }

    public void AMultB(){
        int aux = 0;



    }
}
