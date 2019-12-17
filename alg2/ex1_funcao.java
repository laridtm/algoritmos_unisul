import javax.swing.JOptionPane;

// Nestes exercícios utilize somente sub-rotinas tipo função.
// Aplique o conceito de variável global e local. Todas os dados
// que forem necessários como entrada para a execução da
// sub-rotina devem ser passados como parâmetro e o dado de
// saída devem ser feita por retorno a sub-rotina.

// 1- Faça um algoritmo que leia um número N inteiro e positivo.
// O algoritmo deverá ter uma sub-rotina tipo função que irá
// calcular o fatorial deste número. A sub-rotina não deverá
// mostrar o resultado do cálculo, isto ficará a cargo do
// algoritmo principal ela também irá receber por parâmetros os
// dados necessários para o seu processamento e retornar o
// valor resultante. (passagem de parâmetro por valor)

// Fatorial é um número natural inteiro positivo, o qual é representado por n!
// O fatorial de um número é calculado pela multiplicação desse número por todos 
// os seus antecessores até chegar ao número 1. Note que nesses produtos, o zero (0) é excluído.
// O fatorial é representado por:
// n! = n . (n – 1) . (n – 2) . (n – 3)!
// 7! = 7 . 6 . 5 . 4. 3 . 2 . 1 = 5040


public class ex1_funcao{


    public static int calcular_fatorial(int n){
        
        int fatorial = 1;
        int fatoracao;
        for(int i=0; i<n; i++){
            fatoracao = n-i;
            fatorial = fatorial*fatoracao;
        }
        
        return fatorial;
    }

    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));

        int resultado = calcular_fatorial(n);

        JOptionPane.showMessageDialog(null, "O fatorial do número " + n + " é: " + resultado);

    }
}