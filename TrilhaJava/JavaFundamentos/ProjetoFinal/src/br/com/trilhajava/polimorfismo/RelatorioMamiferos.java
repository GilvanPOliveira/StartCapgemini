package br.com.trilhajava.polimorfismo;

/**
 *
 * @author Gilvan
 */

import java.util.ArrayList;
import java.util.List;

public class RelatorioMamiferos {

    public static void executarPolimorfismo() {
        System.out.println("\n=== RELATÓRIO DE MAMÍFEROS (POLIMORFISMO) ===");

        List<Mamifero> mamiferos = new ArrayList<>();
        mamiferos.add(new Elefante());
        mamiferos.add(new Rato());
        mamiferos.add(new Vaca());

        double totalLeite = 0.0;

        for (Mamifero m : mamiferos) {
            double cota = m.cotaDiariaLeite();
            totalLeite += cota;
            System.out.printf("%s -> cota diária de leite: %.2f litros%n",
                    m.getDescricao(), cota);
        }

        System.out.printf("TOTAL de leite necessário por dia: %.2f litros%n", totalLeite);
    }
}

