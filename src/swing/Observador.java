package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");//Abre uma janela com nome observador
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//fecha app no 'X'
		janela.setSize(600,600);//largura X altura da janela
		janela.setLayout(new FlowLayout());//Inclui um novo Layout dentro da janela
		janela.setLocationRelativeTo(null);//centraliza na tela do pc(n�o da aplica��o atras)
		
		
		JButton botao = new JButton("Clicar");//Cria um bot�o com o nome Clicar
		janela.add(botao);//adiciona o bot�o na janela
		
		//M�TODO TRADICIONAL DE A��O DO BOT�O
		botao.addActionListener(new ActionListener() {//evento do clique no bot�o
			
			public void actionPerformed(ActionEvent e) {
				JFrame janela2 = new JFrame("Observador2");
				janela2.setVisible(true);
			}
		});
		
		//INTERFACE FUNCIONAL DE ACAO DO BOT�O
		//botao.addActionListener(e -> {
		//	JFrame janela2 = new JFrame("Observador2");
		//	janela2.setVisible(true);
		//});
		
		janela.setVisible(true);
	}
}
