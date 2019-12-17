import javax.swing.JOptionPane; 
public class matriz_h{
	public static void main(String args[]){
		int A[ ][ ] = new int[3][3]; 
		int i, j, menorElemento, menorLinha, menorColuna;
		for(i=0; i<3; i++){
			for (j=0; j<3; j++){ 
				A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha: "+i+" e coluna: "+j+""));
			} 
		} 
		menorElemento = A[0][0];
		menorLinha = 0;
		menorColuna = 0;
		for(i=0; i<3; i++){
			for (j=0; j<3; j++){ 
				if (A[i][j]< menorElemento) {
					menorElemento = A[i][j];
					menorLinha = i;
					menorColuna = j;
				}
			} 
		}
		JOptionPane.showMessageDialog(null, "O menor elemento da matriz é: " +menorElemento+ " e está na posição: " +menorLinha+ "," +menorColuna);
	}
}