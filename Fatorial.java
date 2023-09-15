package Projetos;
import javax.swing.JOptionPane;
public class Fatorial {

	public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("Digite um número para realização da tarefa: ");
	int numero = Integer.parseInt(input);
	
	long fatorial = 1;

    for (int i = 1; i <= numero; i++) {
        fatorial *= i;
    }
    JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + fatorial);

	}

}
