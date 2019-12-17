import javax.swing.JOptionPane;

    // Nestes exercícios utilize somente sub-rotinas tipo
    // procedimento. Não utilize parâmetros nem variáveis
    // locais, faça somente a divisão dos algoritmos em
    // sub-rotinas.

    // 2 - Faça um algoritmo que possui uma sub-rotina
    // para ler um vetor A de N elementos reais. O valor de
    // N devera ser lido. Após a utilização da sub-rotina de
    // leitura, chame outra sub-rotina que mostre a soma
    // dos elementos do vetor A.

public class ex2_procedimento{

    static int N;
    static double vetorA[];
    static double soma = 0;

    public static void ler_vetor(){
        N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tamanho do vetor A: "));
        vetorA = new double[N];
        for (int i = 0; i < N; i++) {
            vetorA[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor a ser armazenado: "));
        }
    }

    public static void soma_elementos(){
        for (int i = 0; i < N; i++) {
            soma = vetorA[i] + soma;
        }
        JOptionPane.showMessageDialog(null, "A soma de todos os elementos do vetor A é: " + soma);
    }

    public static void main(String[] args) {
        
        ler_vetor();

        soma_elementos();
    }
}