import javax.swing.JOptionPane;

public class ex_13 {
	public static void main(String[] args) {
		double salar;
		double prest;

		salar = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu sal�rio:"));
		prest = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da presta��o que voc� deseja:"));
	
		if (prest<=salar*0.3) {
			JOptionPane.showMessageDialog(null,"Seu empr�stimo foi aprovado.");
			
		}else{
			JOptionPane.showMessageDialog(null,"Seu empr�stimo n�o foi aprovado.");
		}

	}
}