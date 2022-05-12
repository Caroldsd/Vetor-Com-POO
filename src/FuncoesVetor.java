// Caroline Dorneles

import java.util.Scanner;

public class FuncoesVetor {

    Scanner teclado = new Scanner(System.in);

    private int vetor[];
    private int i;
    private int valor;
    private int qntsValoresOcupam;
    private int maior;
    private int menor;
    private int posicao;
    private int tam;
    private boolean existePosicao = false;

    public FuncoesVetor(int tam) {
        vetor = new int[tam];
        this.tam = tam;
    }

    public int lerInteiro() {
        int num = teclado.nextInt();
        while (num < 0) {
            System.out.println("Valor invalido.");
            num = teclado.nextInt();
        }
        return num;
    }

    public void menu() {
        System.out.println("---------------------------------------- \n" +
                "Escolha uma opcao: \n" +
                "1- Criar vetor vazio ou zerar vetor. \n" +
                "2- Inserir um valor. \n" +
                "3- Apagar um valor. \n" +
                "4- Consultar se existe determinado valor. \n" +
                "5- Consultar quantos valores ja ocupam. \n" +
                "6- Consultar o menor valor. \n" +
                "7- Consultar o maior valor. \n" +
                "8- Listar valores. \n" +
                "0- Sair do programa. \n" +
                "----------------------------------------");
    }

    public void vetorVazio() {
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
            mostrarVetor();
            break;
        }
    }

    public void apagarValor() {
        valor = lerInteiro();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                vetor[i] = 0;
            }
        }
    }

    public void inserirValor() {
        for (i = 0; i < vetor.length; i++) {
            if (vetor[i] == 0) {
                System.out.println("Digite o valor que deseja inserir:");
                valor = lerInteiro();
                vetor[i] = valor;
                break;
            }
        }
    }

    public void consultarValor() {
        valor = lerInteiro();
        for (i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                System.out.println("Esse valor esta na posicao " + i);
                existePosicao = true;
                break;
            } else {
                existePosicao = false;
            }
        }
        if (existePosicao == false) {
            System.out.println("Nao existe esse valor.");
        }
    }

    public void ocupamValores() {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                qntsValoresOcupam += 1;
            }
        }
        System.out.println("Ja ocupam " + qntsValoresOcupam + " valores.");
    }

    public void menorValor() {
        menor = vetor[0];
        posicao = 0;
        for (i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicao = i;
            }
        }
        System.out.println("O menor valor e - " + menor + " e esta na posicao - " + posicao);
    }

    public void maiorValor() {
        maior = vetor[0];
        posicao = 0;
        for (i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }
        System.out.println("O maior valor e - " + maior + " e esta na posicao - " + posicao);
    }

    public void mostrarVetor() {
        for (i = 0; i < vetor.length; i++) {
            System.out.println("Posicao " + i + " - " + vetor[i]);
        }
    }
}