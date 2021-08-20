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
		janela.setLocationRelativeTo(null);//centraliza na tela do pc(não da aplicação atras)
		
		
		JButton botao = new JButton("Clicar");//Cria um botão com o nome Clicar
		janela.add(botao);//adiciona o botão na janela
		
		//MÉTODO TRADICIONAL DE AÇÃO DO BOTÃO
		botao.addActionListener(new ActionListener() {//evento do clique no botão
			
			public void actionPerformed(ActionEvent e) {
				JFrame janela2 = new JFrame("Observador2");
				janela2.setVisible(true);
			}
		});
		
		//INTERFACE FUNCIONAL DE ACAO DO BOTÃO
		//botao.addActionListener(e -> {
		//	JFrame janela2 = new JFrame("Observador2");
		//	janela2.setVisible(true);
		//});
		
		janela.setVisible(true);
	}
}
