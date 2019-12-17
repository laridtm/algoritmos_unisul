import javax.swing.*;
import java.util.Arrays;

public class Trabalho2 {

    static class Correntista {
        String nome;
        int conta;
        double saldo;
    }

    static final int LINHA = 3;
    static final int COLUNA = 3;
    static Correntista registro[][] = new Correntista[LINHA][COLUNA];

    public static void preencher_registro() {
        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                registro[i][j] = new Correntista();
            }
        }

        registro[0][0].nome = "Tiburcio";
        registro[0][0].conta = 111;
        registro[0][0].saldo = 0.0;

        registro[0][1].nome = "Ricardo";
        registro[0][1].conta = 222;
        registro[0][1].saldo = 0.0;

        registro[0][2].nome = "Joao";
        registro[0][2].conta = 333;
        registro[0][2].saldo = 0.0;

        registro[1][0].nome = "Felisbino";
        registro[1][0].conta = 444;
        registro[1][0].saldo = 0.0;

        registro[1][1].nome = "Seu Zé";
        registro[1][1].conta = 555;
        registro[1][1].saldo = 0.0;

        registro[1][2].nome = "Dona Maria";
        registro[1][2].conta = 666;
        registro[1][2].saldo = 0.0;

        registro[2][0].nome = "Gedonstrôncio";
        registro[2][0].conta = 777;
        registro[2][0].saldo = 0.0;

        registro[2][1].nome = "Batman";
        registro[2][1].conta = 888;
        registro[2][1].saldo = 0.0;

        registro[2][2].nome = "Homem de Ferro";
        registro[2][2].conta = 999;
        registro[2][2].saldo = 0.0;
    }

    /* 1 – Inserir Recebimento (+): Solicite ao usuário o número da conta e depois o valor. Some o
    recebimento ao saldo da conta deste usuário e depois mostre o saldo desta pessoa usando o
    seguinte formato:
    “(CORRENTISTA) seu saldo atual é de: ”+ SALDO.*/

    public static Correntista depositar(int conta, double valor) {
        int auxI = 0;
        int auxJ = 0;
        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                if (conta == registro[i][j].conta) {
                    registro[i][j].saldo = registro[i][j].saldo + valor;
                    auxI = i;
                    auxJ = j;
                }
            }
        }
        return registro[auxI][auxJ];
    }

    /* 2 – Inserir Pagamento (-): Solicite ao usuário o número da conta e depois o valor. Subtraia o
    pagamento do salto atual e depois mostre o novo saldo desta pessoa usando o seguinte
    formato:
    “(CORRENTISTA) seu saldo atual é de: ”+ SALDO. */

    public static Correntista pagar(int conta, double valor) {
        int auxI = 0;
        int auxJ = 0;
        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                if (conta == registro[i][j].conta) {
                    registro[i][j].saldo = registro[i][j].saldo - valor;
                    auxI = i;
                    auxJ = j;
                }
            }
        }
        return registro[auxI][auxJ];
    }

    /* 3 – Mostre em apenas uma mensagem todos os Números de Conta, Correntistas e Saldos respectivos. */

    public static String mostrar_status() {
        String status = "";
        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                status = status + " Conta: " + registro[i][j].conta + "; Nome: " + registro[i][j].nome + "; Saldo: "
                        + registro[i][j].saldo + "\n";
            }
        }
        return status;
    }

    /* 4 – Mostre em apenas uma mensagem o Número da Conta, o Nome do Correntista e o saldo do correntista mais RICO. */

    public static String maior_saldo() {
        double maiorValor = 0.0;
        int auxI = 0;
        int auxJ = 0;

        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                if (maiorValor < registro[i][j].saldo) {
                    maiorValor = registro[i][j].saldo;
                    auxI = i;
                    auxJ = j;
                }
            }
        }
        String resultado = "O maior saldo é de: " + registro[auxI][auxJ].saldo + " do(a) correntista: "
        + registro[auxI][auxJ].nome + " dono(a) da conta: " + registro[auxI][auxJ].conta;
        return resultado;
    }

    /* 5 – Mostre em apenas uma mensagem todos os saldos ordenados do menor para o maior.
    Para isso coloque todos os saldos dentro de um vetor e ordene usando BubbleSort. */

    public static void ordenar_registro() {
        double[] vetorOrdenado = new double[LINHA * COLUNA];
        int posicaoVetor = 0;

        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                vetorOrdenado[posicaoVetor] = registro[i][j].saldo;
                posicaoVetor++;
            }
        }

        int flag = 1;
        int fim = vetorOrdenado.length - 1;
        double aux = 0;

        while (flag == 1) {

            flag = 0;

            for (int i = 0; i < fim; i++) {

                if (vetorOrdenado[i] > vetorOrdenado[i + 1]) {
                    aux = vetorOrdenado[i + 1];
                    vetorOrdenado[i + 1] = vetorOrdenado[i];
                    vetorOrdenado[i] = aux;
                    flag = 1;
                }
            }

            fim = fim - 1;

        }

        JOptionPane.showMessageDialog(null, "A ordem crescente dos saldos é: " +  Arrays.toString(vetorOrdenado));
    }

    public static void main(String[] args) {
        int opcao = 1;
        int conta = 0;
        double valor = 0;
        Correntista correntista;
        
        preencher_registro();
        
        while (opcao > 0 && opcao < 6) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Depósito \n 2 - Pagamento \n 3 - Mostrar Status Correntistas "
            + "\n 4 - Correntista com maior Saldo \n 5 - Saldo ordenado por valor \n 6 - Sair"));

            switch (opcao) {
            case 1:
                conta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da conta: "));
                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser depositado: "));
                correntista = depositar(conta, valor);
                JOptionPane.showMessageDialog(null, correntista.nome + " seu saldo atual é de: " + correntista.saldo);
                break;

            case 2:
                conta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da conta: "));
                valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser debitado: "));
                correntista = pagar(conta, valor);
                JOptionPane.showMessageDialog(null, correntista.nome + " seu saldo atual é de: " + correntista.saldo);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, mostrar_status());
                break;

            case 4:
                JOptionPane.showMessageDialog(null, maior_saldo());
                break;

            case 5:
                ordenar_registro();
                break;

            case 6:
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
            }

        }
    }
}