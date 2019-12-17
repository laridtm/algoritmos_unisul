/*Considere que uma figura geométrica possui área, cor e tipo(1-Triangulo, 2-Circulo e 3-Quadrado).
 Faça um algoritmo que armazene N figuras geométricas em um vetor. Após a leitura determine:
a) O total da área das figuras geométricas;
b) O tipo da maior figura geométrica;
c) A quantidade de círculos;
d) O percentual de quadrado em relação ao total.*/

import javax.swing.JOptionPane;

public class ex2_classe{
    static class Figura{
        double area;
        String cor;
        int tipo;
    }
    public static void main(String[] args) {
        
        int TAMANHO = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas figuras você quer cadastrar?"));
        
        //declarando vetor figuras e instanciando a classe Figura no vetor
        Figura figuras[] = new Figura[TAMANHO];

        double area_total = 0;
        double maior_area = 0.0;
        int maior_tipo = 0;
        int circulos = 0;
        int quadrados = 0;
       
        /*Fazendo apenas uma varredura no vetor para ler as informações,
        somar todas as áreas, guardar a maior figura, contar quantos círculos e quadrados.*/
        for (int i = 0; i < TAMANHO; i++) {
            figuras[i] = new Figura();
            figuras[i].area = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a área da figura?"));
            figuras[i].cor = JOptionPane.showInputDialog(null, "Qual a cor da figura?");

            //voltar a repetir o menu até que seja escolhida uma opção válida.
            do {
                figuras[i].tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o tipo da figura? \n 1-Triangulo, 2-Circulo e 3-Quadrado"));
                if (figuras[i].tipo < 1 || figuras[i].tipo > 3) {
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
            } while (figuras[i].tipo < 1 || figuras[i].tipo > 3);
             
            
            area_total = area_total + figuras[i].area;

            
            if (figuras[i].area > maior_area) {
                maior_area = figuras[i].area;
                maior_tipo = figuras[i].tipo;
            }

            if (figuras[i].tipo == 2) {
                circulos = circulos + 1;
            }

            if (figuras[i].tipo == 3) {
                quadrados = quadrados + 1;
            }
        }
        
        JOptionPane.showMessageDialog(null, "A área de todas as figuras é: " + area_total);

        switch (maior_tipo) {
            case 1:
                JOptionPane.showMessageDialog(null, "A maior figura é um triângulo.");
            break;

            case 2:
                JOptionPane.showMessageDialog(null, "A maior figura é um círculo.");
            break;

            case 3:
                JOptionPane.showMessageDialog(null, "A maior figura é um quadrado.");
            break;
        }

        JOptionPane.showMessageDialog(null, "Das " + TAMANHO + " figuras, " + circulos + " são círculos.");
        
        double percentual = 0.0;
        percentual = (double)quadrados/TAMANHO;
        percentual = percentual * 100;
        JOptionPane.showMessageDialog(null, "O percentual de quadrados em relação ao total das figuras é: " + percentual + "%");
        
    }
}