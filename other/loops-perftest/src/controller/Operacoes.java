package controller;

public class Operacoes {
    
    // Teste 1: Laço "for" convencional
    public static double percorreVetor1(int[] vetor) {
        double t1 = System.nanoTime();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i]++;
            //System.out.print(vetor[i]);
        }
        double t2 = System.nanoTime();
        return ((t2-t1)/Math.pow(10, 9));
    }

    // Teste 2: "Enhanced for" (foreach)
    public static double percorreVetor2(int[] vetor) {
        double t1 = System.nanoTime();
        for (int i : vetor) {
            i++;
            //System.out.print(i);
        }
        double t2 = System.nanoTime();
        return ((t2-t1)/Math.pow(10, 9));
    }
}
