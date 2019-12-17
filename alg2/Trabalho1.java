import java.util.Arrays;
import javax.swing.*;

public class Trabalho1{

    /* Imagine um pequeno módulo de um sistema de movimentações financeiras. Vamos controlar
    a título de exemplo, a movimentação de saldo na conta de 9 correntista usando JAVA.
    Vamos inserir recebimentos e pagamentos e com isso vamos calcular os saldos respectivos que
    se iniciam com ZERO. Crie 3 Matrizes.
    A - Tipo String - Uma 3x3 que armazene os nomes dos correntistas.
    B - Tipo Int – Uma 3x3 que armazene os números das contas.
    C – Tipo Double -Uma 3x3 que armazene os saldos respectivos. */

    public static void main(String[] args) {
        
        int option = 1;
        
        String A[][] = new String[3][3];
        int B[][] = new int[3][3];
        double C[][] = new double[3][3];
        
        A[0][0] = "Tiburcio";
        A[0][1] = "Ricardo";
        A[0][2] = "Joao";
        A[1][0] = "Felisbino";
        A[1][1] = "Seu Zé";
        A[1][2] = "Dona Maria";
        A[2][0] = "Gedonstrôncio";
        A[2][1] = "Batman";
        A[2][2] = "Homem de Ferro";

        B[0][0] = 111;
        B[0][1] = 222;
        B[0][2] = 333;
        B[1][0] = 444;
        B[1][1] = 555;
        B[1][2] = 666;
        B[2][0] = 777;
        B[2][1] = 888;
        B[2][2] = 999;

        C[0][0] = 0.0;
        C[0][1] = 0.0;
        C[0][2] = 0.0;
        C[1][0] = 0.0;
        C[1][1] = 0.0;
        C[1][2] = 0.0;
        C[2][0] = 0.0;
        C[2][1] = 0.0;
        C[2][2] = 0.0;

        // Implemente um Menu(usando while e switch) com as Seguintes Funcionalidades:

        while(option >= 1 && option <= 5){
            
            option = Integer.parseInt(JOptionPane.showInputDialog(null, 
            " 1 - Depósito \n 2 - Pagamento \n 3 - Mostrar Status Correntistas "
            +"\n 4 - Correntista com maior Saldo \n 5 - Saldo ordenado por valor \n 6 - Sair"));
            
            switch(option){

                /* 1 – Inserir Recebimento (+): Solicite ao usuário o número da conta e depois o valor. Some o
                recebimento ao saldo da conta deste usuário e depois mostre o saldo desta pessoa usando o
                seguinte formato:
                “(CORRENTISTA) seu saldo atual é de: ”+ SALDO.*/

                case 1:
                
                    int setConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da conta: "));
                    double setValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser depositado: "));
                    
                    for (int i = 0; i < B.length; i++){
                        for (int j = 0; j < B.length; j++){
                            if (setConta == B[i][j]){
                                C[i][j] = C[i][j] + setValor;
                                JOptionPane.showMessageDialog(null, A[i][j]+" seu saldo atual é de: " + C[i][j]);
                            }
                        }
                    }


                break;

                /* 2 – Inserir Pagamento (-): Solicite ao usuário o número da conta e depois o valor. Subtraia o
                pagamento do salto atual e depois mostre o novo saldo desta pessoa usando o seguinte
                formato:
                “(CORRENTISTA) seu saldo atual é de: ”+ SALDO. */

                case 2:

                    setConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da conta: "));
                    setValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do pagamento: "));

                    for (int i = 0; i < B.length; i++){
                        for (int j = 0; j < B.length; j++){
                            if (setConta == B[i][j]){
                                C[i][j] = C[i][j] - setValor; 
                                JOptionPane.showMessageDialog(null, A[i][j]+" seu saldo atual é de: " + C[i][j]);
                            }
                        }
                    }

                break;
                
                /* 3 – Mostre em apenas uma mensagem todos os Números de Conta, Correntistas e Saldos
                respectivos. */

                case 3:
                    
                    String correntistas = "";

                    for (int i = 0; i < B.length; i++){
                        for (int j = 0; j < B.length; j++){
                            correntistas = correntistas + " Conta: " + B[i][j] + "; Nome: " + A[i][j] + "; Saldo: " + C[i][j] + "\n";
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Correntistas e saldos respectivos: \n" + correntistas);
                    
                break;

                /* 4 – Mostre em apenas uma mensagem o Número da Conta, o Nome do Correntista e o saldo
                do correntista mais RICO. */

                case 4:

                    double maiorValor = 0.0;
                    int auxI = 0;
                    int auxJ = 0;
                    
                    for (int i = 0; i < C.length; i++){
                        for(int j = 0; j < C.length; j++){
                            if (maiorValor < C[i][j]){
                                maiorValor = C[i][j];
                                auxI = i;
                                auxJ = j;
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, A[auxI][auxJ]+ " da conta " + B[auxI][auxJ] + " possui o saldo de " + C[auxI][auxJ]);

                break;

                /* 5 – Mostre em apenas uma mensagem todos os saldos ordenados do menor para o maior.
                Para isso coloque todos os saldos dentro de um vetor e ordene usando BubbleSort. */

                case 5:

                    double[] vet = new double[C.length * C.length];
                    int posicaoVet = 0;
                    for (int i = 0; i < C.length; i++) {
                        for (int j = 0; j < C.length; j++) {
                            vet[posicaoVet] = C[i][j];
                            posicaoVet++;
                        }
                    }
                    
                    int flag = 1;
                    int fim = vet.length - 1;
                    double gaveta = 0;

                    while(flag == 1) {

                        flag = 0;

                        for (int i=0;i<fim;i++) {

                            if (vet[i]>vet[i+1]) {
                                gaveta = vet[i+1];
                                vet[i+1] = vet[i];
                                vet[i] = gaveta;
                                flag = 1;
                            }
                        }

                        fim = fim - 1;

                    }

                    JOptionPane.showMessageDialog(null, "A ordem crescente dos saldos é: " +  Arrays.toString(vet));

                break;

                /* 6 - Sair. */

                case 6:

                    System.exit(0);
                    
                break;
                
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida.");
                    option = 1;
            }
        }
    }
}