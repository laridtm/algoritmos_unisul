import javax.swing.JOptionPane; 
public class matriz_e{
	public static void main(String args[]){
		int A[ ][ ] = new int[3][3]; 
		int i, j;
		int soma, contador, media;
		soma = 0;
		for(i=0; i<3; i++){
			for (j=0; j<3; j++){ 
				A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da linha: "+i+" e coluna: "+j+""));
			} 
		} 
		contador = 0;
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				soma = A[i][j] + soma;
				contador ++;
			}
		}
		media = soma/contador;
		JOptionPane.showMessageDialog(null, "A média dos elementos da matriz é: " + media);
	}
}