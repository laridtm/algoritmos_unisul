import javax.swing.JOptionPane;

public class ex_11{

	public static void main(String[] args) {
 		int num;

 		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));

		if (num % 2==0) {
 			JOptionPane.showMessageDialog(null, num + " � m�ltiplo de 2.");
 		}else{
 			JOptionPane.showMessageDialog(null, num + " n�o � m�ltiplo de 2.");
 		}
	}
}



