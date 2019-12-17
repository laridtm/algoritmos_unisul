import javax.swing.JOptionPane;

public class Trabalho2{
	public static void main(String[] args) {

		int tema;
		int resposta;

		tema = Integer.parseInt(JOptionPane.showInputDialog("Escolha entre esses cinco temas: "
			+ "\n 1.Série \n 2.Filme \n 3.Livro \n 4.Anime \n 5.Música"));

		switch(tema){

			case 1:
				resposta = 	Integer.parseInt(JOptionPane.showInputDialog("Sobre Game of Thrones: Quem é o personagem que não sabe de nada?"
					+"\n 1)John Snow \n 2)Daenerys Targaryen \n 3)Joffrey Baratheon"));
				if (resposta == 1) {
					JOptionPane.showMessageDialog(null,"Resposta correta");
				}else{
					JOptionPane.showMessageDialog(null,"Resposta incorreta");	
				}
			break;

			case 2:
				resposta = Integer.parseInt(JOptionPane.showInputDialog("Sobre Matrix: Quem Neo procura no segundo filme da trilogia?"
					+"\n 1)Engenheiro \n 2)Piscicólogo \n 3)Chaveiro"));
				if (resposta == 3) {
					JOptionPane.showMessageDialog(null,"Resposta correta");
				}else{
					JOptionPane.showMessageDialog(null,"Resposta incorreta");
				}
			break;

			case 3:
				resposta = Integer.parseInt(JOptionPane.showInputDialog("Sobre A menina que roubava livros: Em qual país se passa a história?"
					+"\n 1)Inglaterra \n 2)Alemanha \n 3)Itália"));
				if (resposta == 2) {
					JOptionPane.showMessageDialog(null,"Resposta correta");
				}else{
					JOptionPane.showMessageDialog(null,"Resposta incorreta");
				}
			break;

			case 4:
				resposta = Integer.parseInt(JOptionPane.showInputDialog("Sobre naruto: Quantas caudas tem a raposa Kyuubi?"
					+"\n 1) 9 \n 2) 7 \n 3) 5"));
				if (resposta == 1) {
					JOptionPane.showMessageDialog(null,"Resposta correta");
				}else{
					JOptionPane.showMessageDialog(null,"Resposta incorreta");
				}
			break;

			case 5:
				resposta = Integer.parseInt(JOptionPane.showInputDialog("Sobre música: Quem canta a música Epitáfio?"
					+"\n 1)Ana Carolina \n 2)Titãs \n 3)Skank"));
				if (resposta == 2) {
					JOptionPane.showMessageDialog(null,"Resposta correta");
				}else{
					JOptionPane.showMessageDialog(null,"Resposta incorreta");
				}
			break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida.");
			break;

		}
	}
}