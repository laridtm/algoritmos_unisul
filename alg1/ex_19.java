import javax.swing.JOptionPane;

public class ex_19{
	public static void main(String[] args) {

		String frase;
		int vezes;
		int i;

		frase = JOptionPane.showInputDialog("Digite uma frase:");
		vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vezes que a frase ser� repetida:"));

		for(i=1; i<=vezes; i++){
			JOptionPane.showMessageDialog(null, frase);
		}
	}
}