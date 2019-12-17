import javax.swing.JOptionPane;

    // Nestes exercícios utilize somente sub-rotinas tipo
    // procedimento. Não utilize parâmetros nem variáveis
    // locais, faça somente a divisão dos algoritmos em
    // sub-rotinas.

    // 1 - Faça um algoritmo que possui uma sub-rotina
    // para ler um vetor A de N elementos inteiros. O valor
    // de N deverá ser lido. Após a utilização da sub-rotina
    // de leitura, chame outra sub-rotina que mostre os
    // elementos do vetor A.

public class ex1_procedimento{

    static int N;
    static int vetorA[];

    public static void ler_vetor(){
        N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor A: "));
        vetorA = new int[N];
        for (int i = 0; i < N; i++) {
            vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor a ser armazenado: "));
        }
    }

    public static void mostrar_vetor(){
        for (int i = 0; i < N; i++) {
            JOptionPane.showMessageDialog(null, "O valor da posição " + i + " é: " + vetorA[i]);
        }
    }
    public static void main(String[] args) {
        
        ler_vetor();

        mostrar_vetor();
 
    }  
}