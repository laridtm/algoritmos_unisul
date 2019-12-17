import javax.swing.JOptionPane; 
public class matriz_g{
	public static void main(String args[]){
		int A[ ][ ] = new int[3][3]; 
		int i, j, maiorElemento, maiorLinha, maiorColuna;
		for(i=0; i<3; i++){
			for (j=0; j<3; j++){ 
				A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha: "+i+" e coluna: "+j+""));
			} 
		} 
		maiorElemento = 0;
		maiorLinha = 0;
		maiorColuna = 0;
		for(i=0; i<3; i++){
			for (j=0; j<3; j++){ 
				if (A[i][j]> maiorElemento) {
					maiorElemento = A[i][j];
					maiorLinha = i;
					maiorColuna = j;
				}
			} 
		}
		JOptionPane.showMessageDialog(null, "O maior elemento da matriz é: " +maiorElemento+ " e está na posição: " +maiorLinha+ "," +maiorColuna);
	}
}
