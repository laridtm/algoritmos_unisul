import javax.swing.JOptionPane;

public class ex_13 {
	public static void main(String[] args) {
		double salar;
		double prest;

		salar = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário:"));
		prest = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação que você deseja:"));
	
		if (prest<=salar*0.3) {
			JOptionPane.showMessageDialog(null,"Seu empréstimo foi aprovado.");
			
		}else{
			JOptionPane.showMessageDialog(null,"Seu empréstimo não foi aprovado.");
		}

	}
}