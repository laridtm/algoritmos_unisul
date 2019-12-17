import javax.swing.JOptionPane; 
public class matriz_j{
	public static void main(String args[]){
		int A[ ][ ] = new int[3][3]; 
		int i, j;
		for(i=0; i<3; i++){
			for (j=0; j<3; j++){ 
				A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha: "+i+" e coluna: "+j+""));
			} 
		} 
		for(i=0; i<3; i++){
			for (j=0; j<3; j++){ 
				if (i < j) {
					JOptionPane.showMessageDialog(null, "Elemento da triângulo superior: " + A[i][j]);
				
				}
			} 
		}
	}
}