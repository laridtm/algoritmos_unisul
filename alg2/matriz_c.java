import javax.swing.JOptionPane; 
public class matriz_c{
	public static void main(String args[]){
		int A[ ][ ] = new int[3][3]; 
		int i, j;
		int produto; 
		for(i=0; i<3; i++){
			for (j=0; j<3; j++){ 
				A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha: "+i+" e coluna: "+j+""));
			} 
		} 
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				JOptionPane.showMessageDialog(null, "O valor contido na linha " +i+ " e coluna " +j+ " é " + A[i][j]);
			}
		}
		produto = A[0][0] * A[0][1] * A[0][2];
		JOptionPane.showMessageDialog(null, "O produto dos elementos da primeira linha é: " + produto);
	}
}
	