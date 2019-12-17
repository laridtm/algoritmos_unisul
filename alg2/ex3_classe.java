/*Faça um algoritmo que:
a) Defina um Registro para aluno tendo os seguintes campos: Nome, Semestre, Sala, Curso, Notas(total de seis).
b) Ler as informações, descritas acima.
c) Ampliar a definição anterior, acrescentando a definição de um outro campo(Endereço) que será também um Registro, 
o qual terá os seguintes campos:  Rua, Numero,  Bairro, Cidade, Estado, CEP.
d) Ler as informações de um aluno, junto com o endereço descrito acima.
e) Declare um Vetor de 100 posições de alunos, os campos serão os mesmos descritos nos itens anteriores.
f) Ler as informações de N alunos.
g) Ordene crescentemente pelo Nome, os alunos. Mostre os dados antes e depois da ordenação.*/

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ex3_classe{
    static class Aluno{
        String nome;
        int semestre;
        int sala;
        String curso;
        double notas[] = new double[6];
        Endereco endereco;
    }

    static class Endereco{
        String rua;
        int num;
        String bairro;
        String cidade;
        String estado;
        int CEP;
    }

    public static void main(String[] args) {
        
        int TAMANHO = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos alunos você quer registrar?"));

        Aluno alunos[] = new Aluno[TAMANHO];

        for (int i = 0; i < TAMANHO; i++) {
            alunos[i] = new Aluno();
            alunos[i].nome = JOptionPane.showInputDialog(null, "Nome do aluno:");
            alunos[i].semestre = Integer.parseInt(JOptionPane.showInputDialog(null, "Semestre do aluno:"));
            alunos[i].sala = Integer.parseInt(JOptionPane.showInputDialog(null, "Sala do aluno:"));
            alunos[i].curso = JOptionPane.showInputDialog(null, "Curso do aluno:");
            for (int j = 0; j < 6; j++) {
                alunos[i].notas[j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota " + (j+1) + " do aluno:"));
            }
            //instanciando a variavel alunos[i].endereco.
            alunos[i].endereco = new Endereco();
            alunos[i].endereco.rua = JOptionPane.showInputDialog(null, "Rua do aluno:");
            alunos[i].endereco.num = Integer.parseInt(JOptionPane.showInputDialog(null, "Número da rua do aluno:"));
            alunos[i].endereco.bairro = JOptionPane.showInputDialog(null, "Bairro do aluno:");
            alunos[i].endereco.cidade = JOptionPane.showInputDialog(null, "Cidade do aluno:");
            alunos[i].endereco.estado = JOptionPane.showInputDialog(null, "Estado do aluno:");
            alunos[i].endereco.CEP = Integer.parseInt(JOptionPane.showInputDialog(null, "CEP do aluno:"));
        }

        String todos_alunos[] = new String [TAMANHO];

        for (int i = 0; i < TAMANHO; i++) {
            todos_alunos[i] = 
            "Nome: " + alunos[i].nome + "\n"
            + "Semestre: " + alunos[i].semestre + "\n"
            + "Sala: " + alunos[i].sala + "\n"
            + "Curso: " + alunos[i].curso + "\n"
            + "Endereço: " + "\n" 
                + "Rua:" + alunos[i].endereco.rua + "\n" 
                + "Número: " + alunos[i].endereco.num + "\n"
                + "Bairro: " + alunos[i].endereco.bairro + "\n"
                + "Cidade: " + alunos[i].endereco.cidade + "\n"
                + "Estado: " + alunos[i].endereco.estado + "\n"
                + "CEP: " + alunos[i].endereco.CEP + "\n"
            + "Notas: " + "\n" 
                + "Nota 1: " + alunos[i].notas[0] + "\n" 
                + "Nota 2: " + alunos[i].notas[1] + "\n" 
                + "Nota 3: " + alunos[i].notas[2] + "\n" 
                + "Nota 4: " + alunos[i].notas[3] + "\n" 
                + "Nota 5: " + alunos[i].notas[4] + "\n" 
                + "Nota 6: " + alunos[i].notas[5];
            }

        for (int i = 0; i < TAMANHO; i++) {
            JOptionPane.showMessageDialog(null, todos_alunos[i]);
        }

        String todos_alunos_ordenado[] = new String [TAMANHO];

        Arrays.sort(todos_alunos);
        todos_alunos_ordenado = todos_alunos;

        JOptionPane.showMessageDialog(null, "Alunos em ordem alfabética:");
        for (int i = 0; i < TAMANHO; i++) {
            JOptionPane.showMessageDialog(null, todos_alunos_ordenado[i]);
        } 

    } 
}