import javax.swing.JOptionPane;

// Nestes exercícios utilize somente sub-rotinas tipo função.
// Aplique o conceito de variável global e local. Todas os dados
// que forem necessários como entrada para a execução da
// sub-rotina devem ser passados como parâmetro e o dado de
// saída devem ser feita por retorno a sub-rotina.

// 5 – Faça uma sub-rotina que receba um parâmetro
// inteiro(peso em Kg) outro double (altura em metros) e uma
// string(para o nome). Calcule o índice de massa corporal
// (IMC) que é igual ao peso dividido pela altura ao quadrado.
// No programa principal solicite estes parâmetros ao usuário e
// chame a sub- rotina. A sub-rotina deve mostrar o resultado
// com o nome e IMC calculado (double).

public class ex5_funcao{

    public static double calculo_imc(String nome, double altura, int peso){
        double imc = peso/(altura*altura);
        return imc;
    }
    public static void main(String[] args) {
     
        String nome = JOptionPane.showInputDialog(null, "Informe o nome:");
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura:"));
        int peso = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o peso:"));

        double IMC = calculo_imc(nome, altura, peso);

        JOptionPane.showMessageDialog(null, "O IMC do(a) " +nome+ " é: " +IMC);
    }
}