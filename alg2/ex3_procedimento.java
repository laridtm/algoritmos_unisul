import javax.swing.JOptionPane;

    // Nestes exercícios utilize somente sub-rotinas tipo
    // procedimento. Não utilize parâmetros nem variáveis
    // locais, faça somente a divisão dos algoritmos em
    // sub-rotinas.

    // 3 - Faça um algoritmo que possui uma sub-rotina
    // para ler uma matriz de ordem 2x4 de números
    // inteiros e outra sub-rotina para imprimir os
    // elementos da matriz.

public class ex3_procedimento{

    static int A[][];
    static String imprimir = "";

    public static void ler_matriz(){
        A = new int[2][4]; 
        for(int i=0; i<2; i++){
			for (int j=0; j<4; j++){ 
				A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha: "+i+" e coluna: "+j+""));
			} 
		} 
    }

    public static void imprimir_matriz(){
        for (int i=0; i<2; i++){
            for (int j=0; j<4; j++){
                imprimir = imprimir + A[i][j] + " ";
            }
            imprimir = imprimir + "\n";
        }
        JOptionPane.showMessageDialog(null, imprimir);
    }
    public static void main(String[] args) {
        
        ler_matriz();

        imprimir_matriz();
    }
}