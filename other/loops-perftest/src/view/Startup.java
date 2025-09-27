package view;

import java.math.BigDecimal;
import controller.Operacoes;

public class Startup {
    
    private static void batch(int size) {
        int[] test = new int[size];
        // Resultados
        System.out.println(" " + size + " pos. - Tempo 1: " + BigDecimal.valueOf(Operacoes.percorreVetor1(test)) + " s");
        System.out.println(" " + size + " pos. - Tempo 2: " + BigDecimal.valueOf(Operacoes.percorreVetor2(test)) + " s");
    }
    
    public static void main(String[] args) throws Exception {
        // Número de posições
        batch(1000);
        batch(10000);
        batch(100000);
    }
}
