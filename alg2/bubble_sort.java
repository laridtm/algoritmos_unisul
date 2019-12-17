import java.util.Arrays;
import javax.swing.JOptionPane;

public class bubble_sort{
	public static void main(String[] args) {

		int i, gaveta, fim, flag;
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor: "));
		int vetor[] = new int[tamanho];

		vetor[0]=27;
		vetor[1]=35;
		vetor[2]=12;
		vetor[3]=10;
		vetor[4]=82;
		vetor[5]=28;
		vetor[6]=30;

		flag = 1;
		fim = tamanho - 1;

		while(flag == 1) {
			flag = 0;
			for (i=0;i<fim;i++) {
				if (vetor[i]>vetor[i+1]) {
				gaveta = vetor[i+1];
				vetor[i+1] = vetor[i];
				vetor[i] = gaveta;
				flag = 1;
				}
			}
			fim = fim - 1;

			JOptionPane.showMessageDialog(null, "O vetor está na seguinte posição: " +  Arrays.toString(vetor));
		}
	}
}