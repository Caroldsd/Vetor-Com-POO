// Caroline Dorneles

import java.util.Scanner;

public class MenuVetor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        FuncoesVetor vetor = new FuncoesVetor(20);

        int opcao = 0;
        do {
            vetor.menu();
            opcao = teclado.nextInt();
            if (opcao == 1) {
                vetor.vetorVazio();
            }
            if (opcao == 2) {
                vetor.inserirValor();
            }
            if (opcao == 3) {
                System.out.println("Digite o valor que deseja apagar: ");
                vetor.apagarValor();
            }
            if (opcao == 4) {
                System.out.println("Digite o valor que deseja consultar: ");
                vetor.consultarValor();
            }
            if (opcao == 5) {
                vetor.ocupamValores();
            }
            if (opcao == 6) {
                vetor.menorValor();
            }
            if (opcao == 7) {
                vetor.maiorValor();
            }
            if (opcao == 8) {
                vetor.mostrarVetor();
            }
        } while (opcao != 0);
        System.out.println("Voce saiu do menu.");
    }
}
