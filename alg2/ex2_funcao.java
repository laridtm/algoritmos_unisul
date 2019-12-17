import javax.swing.JOptionPane;

// Nestes exercícios utilize somente sub-rotinas tipo função.
// Aplique o conceito de variável global e local. Todas os dados
// que forem necessários como entrada para a execução da
// sub-rotina devem ser passados como parâmetro e o dado de
// saída devem ser feita por retorno a sub-rotina.

// 2- Faça um algoritmo que possui uma sub-rotina tipo função
// que calcule um valor A inteiro elevado a um expoente B
// também inteiro. Não usar A** B e sim uma estrutura de
// repetição. A sub-rotina não deverá mostrar o resultado do
// calculo, isto ficará a cargo do algoritmo principal.
// (use passagem de parâmetro por referência)

public class ex2_funcao{

    public static int potencia(int A, int B){
        int mult = 1;
        for (int i = 0; i < B; i++) {
            mult = A*mult;
        }
        return mult;
    }
    public static void main(String[] args) {
        
        int A = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        int B = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número a ser elevado ao " + A));

        int resultado = potencia(A,B);

        JOptionPane.showMessageDialog(null, "O resultado de " + A + " elevado a " + B + " é: " + resultado);
    }
}