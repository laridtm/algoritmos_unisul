import javax.swing.JOptionPane;

public class ex_17{
	public static void main(String[] args) {

		String opcao;
		String profissao;

		opcao = JOptionPane.showInputDialog("Escolha a profissão de Tibúrcio: \n e - engenheiro \n p- programador \n m - médico \n a - advogado \n d - designer");

		switch(opcao){
			case "e":
				profissao = "engenheiro";
				JOptionPane.showMessageDialog(null, "Tibúrcio é: " + profissao);
			break;

			case "p":
				profissao = "programador";
				JOptionPane.showMessageDialog(null, "Tibúrcio é: " + profissao);
			break;

			case "m":
				profissao = "médico";
				JOptionPane.showMessageDialog(null, "Tibpurcio é: " + profissao);
			break;

			case "a":
				profissao = "advogado";
				JOptionPane.showMessageDialog(null, "Tibúrcio é: " + profissao);
			break;

			case "d":
				profissao = "designer";
				JOptionPane.showMessageDialog(null, "Tibúrcio é: " + profissao);
			break;

			default:
				profissao = "desempregado";
				JOptionPane.showMessageDialog(null, "Tibúrcio é: " + profissao);




		}

		
		
	}
}