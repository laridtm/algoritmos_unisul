import javax.swing.JOptionPane;

public class ex_12 {
	public static void main(String[] args) {
		
		int num1;
		int num2;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero:"));

		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, num1 + " � maior que " + num2);
		}else{
			if (num1 < num2) {
				JOptionPane.showMessageDialog(null, num2 + " � maior que " + num1);
			}else{
				JOptionPane.showMessageDialog(null, num1 + " � igual ao " +num2);
			}
			
		}

	}
}