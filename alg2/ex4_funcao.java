import javax.swing.JOptionPane;

// Nestes exercícios utilize somente sub-rotinas tipo função.
// Aplique o conceito de variável global e local. Todas os dados
// que forem necessários como entrada para a execução da
// sub-rotina devem ser passados como parâmetro e o dado de
// saída devem ser feita por retorno a sub-rotina.

// 4 - Faça uma sub-rotina do tipo função que receba dois
// números inteiros positivos por parâmetro e retorne a soma
// dos N números existentes entre eles. Faça um algoritmo para
// utilizar a função e mostrar a soma.

public class ex4_funcao{

    public static int soma(int num1, int num2){
        int soma2 = 0;
        for (int i = num1+1; i < num2; i++) {
            soma2 = soma2+i;
        }
        return soma2;
    }
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));

        int resultado = soma(num1,num2);

        JOptionPane.showMessageDialog(null, "A soma dos números existentes entre " + num1+ " e " +num2+ " é: " +resultado);
    }
}