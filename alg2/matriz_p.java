import javax.swing.JOptionPane; 
public class matriz_p{
	public static void main(String args[]){
		int A[ ][ ] = new int[3][3]; 
		int i, j, soma;
		for(i=0; i<3; i++){
			for (j=0; j<3; j++){ 
				A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha: "+i+" e coluna: "+j+""));
			} 
		} 
		soma = 0;
		for(i=0; i<3; i++){
			for (j=0; j<3; j++){ 
				if (i + j == 2) {
					//JOptionPane.showMessageDialog(null, "Elemento da diagonal secundária: " + A[i][j]);
					soma = A[i][j] + soma;
				}
			} 
		}
		JOptionPane.showMessageDialog(null, "A soma dos elementos da diagonal secundária é: " + soma);
	}
}