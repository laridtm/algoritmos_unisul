import javax.swing.JOptionPane;
import java.util.Arrays;

    // Nestes exercícios utilize somente sub-rotinas tipo
    // procedimento. Não utilize parâmetros nem variáveis
    // locais, faça somente a divisão dos algoritmos em
    // sub-rotinas.

    // 4 - Faça um algoritmo para armazenar na memória as
    // informações de N alunos, tais como: Nome, idade e sexo.
    // Construa um menu de opções para chamar sub-rotinas que
    // deverão executar as seguintes operações:
    // a) Ler as informações de um aluno;
    // b) Emitir um relatório dos dados ordenado crescentemente pelo
    // Nome;
    // c) Emitir um relatório ordenado dos dados decrescentemente pela
    // idade;
    // d) Informar qual o percentual de alunos do sexo feminino.

public class ex4_procedimentos{

    static Aluno alunos[];
    static int N;
    static int meninas = 0;
    static double percentual = 0.0;
    static Aluno aux;
    static int flag;
    static String dados = "";

    static class Aluno{
        String nome;
        int idade;
        String sexo;
    }

    public static void ler_informacoes(){
        for (int i = 0; i < N; i++) {
            alunos[i] = new Aluno();
            alunos[i].nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");
            alunos[i].idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do aluno: "));
            alunos[i].sexo = JOptionPane.showInputDialog(null, "Digite o sexo do aluno: ");
        }
    }

    public static void ordenar_nome(){

        flag = 1;
        while (flag==1) {
            flag = 0;
            for (int i = 0; i < N-1; i++) {
                if (alunos[i].nome.compareTo(alunos[i+1].nome) > 0) {
                    aux = alunos[i];
                    alunos[i] = alunos[i+1];
                    alunos[i+1] = aux;
                    flag = 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            dados = dados + alunos[i].nome + ", " + alunos[i].idade + " anos, " + alunos[i].sexo + "\n";
        }
        JOptionPane.showMessageDialog(null, "Relatório ordenado dos dados decrescentemente pela idade: \n" + dados);
        dados = "";
    }

    public static void ordenar_idade(){
        flag = 1;
        while (flag==1) {
            flag = 0;
            for (int i = 0; i < N-1; i++) {
                if (alunos[i].idade < alunos[i+1].idade) {
                    aux = alunos[i];
                    alunos[i] = alunos[i+1];
                    alunos[i+1] = aux;
                    flag = 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            dados = dados + alunos[i].nome + ", " + alunos[i].idade + " anos, " + alunos[i].sexo + "\n";
        }
        JOptionPane.showMessageDialog(null, "Relatório ordenado dos dados decrescentemente pela idade: \n" + dados);
        dados = "";
    }
    
    public static void percentual_fem(){
        for (int i = 0; i < N; i++) {
            if (alunos[i].sexo.equalsIgnoreCase("feminino")) {
              meninas = meninas + 1;  
            }
        }
        percentual = (double)meninas/N;
        percentual = percentual * 100;
        JOptionPane.showMessageDialog(null, "O percentual de meninas da turma é: " + percentual + "%");
    }

    public static void main(String[] args) {
        
        N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de alunos a serem registrados: "));
        alunos = new Aluno[N];

        int menu;
        do { 
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual opção deseja?\n"
				+ "1 - Cadastrar as informações de um aluno.\n"
				+ "2 - Emitir um relatório dos dados ordenado crescentemente pelo nome.\n"
				+ "3 - Emitir um relatório ordenado dos dados decrescentemente pela idade. \n"
				+ "4 - Informar qual o percentual de alunos do sexo feminino.\n"
                + "5 - Sair"));
                
            switch (menu) {
                case 1:
                    ler_informacoes();
                    break;

                case 2:
                    ordenar_nome();
                    break;
                
                case 3:
                    ordenar_idade();
                    break;

                case 4:
                    percentual_fem();
                    break;

                case 5:

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
            
        } while (menu != 5);
        
    }

    
}