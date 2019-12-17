import javax.swing.JOptionPane; 
public class matriz_b{
	public static void main(String args[]){
		int A[ ][ ] = new int[3][3]; 
		int i, j;
		int soma1, soma2, soma3;
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
		soma1=0;
		for (i=0; i<3; i++) {
			soma1 += A[i][0];
		}
		JOptionPane.showMessageDialog(null, "A soma dos elementos da primeira coluna é: " + soma1);
		soma2=0;
		for (i=0; i<3; i++) {
			soma2 = A[i][1] + soma2;
		}
		JOptionPane.showMessageDialog(null, "A soma dos elementos da primeira coluna é: " + soma2);
		soma3=0;
		for (i=0; i<3; i++) {
			soma3 = A[i][2] + soma3;
		}
		JOptionPane.showMessageDialog(null, "A soma dos elementos da primeira coluna é: " + soma3);
		
		//soma1 = A[0][0] + A[1][0] + A[2][0];
		//JOptionPane.showMessageDialog(null, "A soma dos elementos da primeira coluna é: " + soma1);
		//soma2 = A[0][1] + A[1][1] + A[2][1];
		//JOptionPane.showMessageDialog(null, "A soma dos elementos da segunda coluna é: " + soma2);
		//soma3 = A[0][2] + A[1][2] + A[2][2];
		//JOptionPane.showMessageDialog(null, "A soma dos elementos da terceira coluna é: " + soma3);
	}
}
	