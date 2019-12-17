import javax.swing.JOptionPane;

// Nestes exercícios utilize somente sub-rotinas tipo função.
// Aplique o conceito de variável global e local. Todas os dados
// que forem necessários como entrada para a execução da
// sub-rotina devem ser passados como parâmetro e o dado de
// saída devem ser feita por retorno a sub-rotina.

// 3 - Faça uma sub-rotina do tipo função que retorne 1 se o
// número inteiro passado por parâmetro for positivo e 0 se o
// número for negativo. Leia um número e passe para função e
// diga se o mesmo é positivo ou negativo.

public class ex3_funcao{
   
    public static int verificar(int num){
        int volta;
        if (num>0) {
            volta = 1;
        } else {
            volta = 0;
        }
        return volta;
    }
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));

        if (verificar(num)== 1) {
            JOptionPane.showMessageDialog(null, "O número é positivo"); 
        } else {
            JOptionPane.showMessageDialog(null, "O número é negativo"); 
        }
         
    }
}