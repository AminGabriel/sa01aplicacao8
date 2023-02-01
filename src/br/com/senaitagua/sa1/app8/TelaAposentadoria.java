package br.com.senaitagua.sa1.app8;

import java.awt.FlowLayout;


import javax.swing.*;


public class TelaAposentadoria extends JFrame{ //Definindo um componente swing título
	JLabel titulo;
	
	JButton btnGravar,btnLer,btnLimpar;
	
	JTextArea txtArea;
	
	//construtor 
	public TelaAposentadoria() {
		
		super("Aplicativo 8");
		getContentPane().setLayout(new FlowLayout());
		//instanciação do objeto título
		titulo = new JLabel("aplicativo 8 - Aposentadoria do Piloto");
		//instanciação dos botões
		btnGravar = new JButton("Gravar");
		btnLer = new JButton("Ler");
		btnLimpar = new JButton("Limpar");
		//instanciação da área de texto
		//(linha,coluna)
		txtArea = new JTextArea(5,10);
		getContentPane().add(titulo);
		getContentPane().add(txtArea);
		getContentPane().add(btnGravar);
		getContentPane().add(btnLer);
		getContentPane().add(btnLimpar);
		setSize(800,600);
		
	}
	

}
