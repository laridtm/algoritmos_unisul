import javax.swing.JOptionPane; 
public class matriz_a{
	public static void main(String args[]){
		int A[ ][ ] = new int[3][3]; 
		int i, j;
		int soma;
		for(i=0; i<3; i++){
			for (j=0; j<3; j++){ 
				A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha: "+i+" e coluna: "+j+""));
			} 
		} 
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				JOptionPane.showMessageDialog(null, "O valor contido na linha " +i+ " e coluna " +j+ " � " + A[i][j]);
			}
		}
		soma = 0;
		for (i=0; i<3; i++) {
			soma = A[i][0] + soma;
		}
		JOptionPane.showMessageDialog(null, "A soma dos elementos da primeira coluna �: " + soma);
		//soma = A[0][0] + A[1][0] + A[2][0];
		//JOptionPane.showMessageDialog(null, "A soma dos elementos da primeira coluna �: " + soma);
	}
}