import javax.swing.JOptionPane;

public class ex_17{
	public static void main(String[] args) {

		String opcao;
		String profissao;

		opcao = JOptionPane.showInputDialog("Escolha a profiss�o de Tib�rcio: \n e - engenheiro \n p- programador \n m - m�dico \n a - advogado \n d - designer");

		switch(opcao){
			case "e":
				profissao = "engenheiro";
				JOptionPane.showMessageDialog(null, "Tib�rcio �: " + profissao);
			break;

			case "p":
				profissao = "programador";
				JOptionPane.showMessageDialog(null, "Tib�rcio �: " + profissao);
			break;

			case "m":
				profissao = "m�dico";
				JOptionPane.showMessageDialog(null, "Tibpurcio �: " + profissao);
			break;

			case "a":
				profissao = "advogado";
				JOptionPane.showMessageDialog(null, "Tib�rcio �: " + profissao);
			break;

			case "d":
				profissao = "designer";
				JOptionPane.showMessageDialog(null, "Tib�rcio �: " + profissao);
			break;

			default:
				profissao = "desempregado";
				JOptionPane.showMessageDialog(null, "Tib�rcio �: " + profissao);




		}

		
		
	}
}