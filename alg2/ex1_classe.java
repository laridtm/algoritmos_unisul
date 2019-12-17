/*Faça um programa que possua uma constante para o tamanho do vetor que será utilizado
e uma classe interna chamada Pessoa para manipular os seguintes dados de cada pessoa.
nome(String),
altura(Double),
idade (int),
profissao(String)
Construa um vetor do tipo Pessoa de tamanho 3, solicite todos os dados para o usu�rio
e depois mostre o resultado de cada pessoa.*/
 
import javax.swing.JOptionPane;

public class ex1_classe{
    static final int TAMANHO = 3;
    static class Pessoa{
        String nome;
        double altura;
        int idade;
        String profissao;
    }
    
    public static void main(String args[])   {
        Pessoa Pessoa[] = new Pessoa[TAMANHO];
        //int Pessoa[] = new int[TAMANHO];

        for (int i = 0; i < TAMANHO; i++) {
            Pessoa[i] = new Pessoa();
            Pessoa[i].nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
            Pessoa[i].altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a sua altura?"));
            Pessoa[i].idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade:"));
            Pessoa[i].profissao = JOptionPane.showInputDialog(null, "Qual a sua profissão?");    
        }

        String print = "";
        for (int i = 0; i < TAMANHO; i++) {
            print = print + Pessoa[i].nome + ", " + Pessoa[i].altura + ", " + Pessoa[i].idade + " anos, " + Pessoa[i].profissao + ".\n"; 
        }

        JOptionPane.showMessageDialog(null, print);
    }
    
}