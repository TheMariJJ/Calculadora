package aula_calc;

import java.awt.Container; //biblioteca do "Container"
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame; //criacao de interface
import javax.swing.JTextField;

public class Calculadora extends JFrame{
	JTextField txtVisor = new JTextField(); //Visor de texto- "txt" obrigatorio
	JButton btnMc = new JButton("MC"); //criando botao - "btn" obrigatorio
	JButton btnMr = new JButton("MR"); //"MR" botao oq aparece no botao
	JButton btnMs = new JButton("MS");
	JButton btnMma = new JButton("M+");
	JButton btnMme = new JButton("M-");
	JButton btnSeta = new JButton("←"); //ALT + 27
	JButton btnCe = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaMe = new JButton("+-"); 
	JButton btnRaiz = new JButton("V");
	JButton btnSete = new JButton("7");
	JButton btnOito = new JButton("8");
	JButton btnNove = new JButton("9");
	JButton btnDiv = new JButton("/");
	JButton btnPorc = new JButton("%");
	JButton btnQuatro = new JButton("4");
	JButton btnCinco = new JButton("5");
	JButton btnSeis = new JButton("6");
	JButton btnMult = new JButton("*");
	JButton btnUmX = new JButton("1/x");
	JButton btnUm = new JButton("1");
	JButton btnDois = new JButton("2");
	JButton btnTres = new JButton("3");
	JButton btnMenos = new JButton("-");
	JButton btnIgual = new JButton("=");
	JButton btnZero = new JButton("0");
	JButton btnVirg = new JButton(",");
	JButton btnMais = new JButton("+");
	
	double valor1, valor2, total;
	String op;
	
	public Calculadora(){ //construtor
		super("Calculadora"); //"super" responsavel por colocar o rotulo na janela
		
		Container paine = this.getContentPane(); //"Container" classe responsavel pela fixação dos itens na tela -- não esquecer de IMPORTAR!		
		paine.add(txtVisor);						
		txtVisor.setBounds(20, 15, 295, 60); //tamanho do visor: esquerda p direita - cima p baixo - largura do item - altura
		
		paine.add(btnMc);
		btnMc.setBounds(20, 80, 55, 55); //medidas botao "Mc"
		
		paine.add(btnMr);
		btnMr.setBounds(80, 80, 55, 55);
		
		paine.add(btnMs);
		btnMs.setBounds(140, 80, 55, 55);
		
		paine.add(btnMma);
		btnMma.setBounds(200, 80, 55, 55);
		
		paine.add(btnMme);
		btnMme.setBounds(260, 80, 55, 55);
		
		paine.add(btnSeta);
		btnSeta.setBounds(20, 140, 55, 55);
		
		paine.add(btnCe);
		btnCe.setBounds(80, 140, 55, 55);
		
		paine.add(btnC);
		btnC.setBounds(140, 140, 55, 55);
		btnC.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(""); //
			}
		});
		
		paine.add(btnMaMe);
		btnMaMe.setBounds(200, 140, 55, 55);
		
		paine.add(btnRaiz);
		btnRaiz.setBounds(260, 140, 55, 55);
		
		paine.add(btnSete);
		btnSete.setBounds(20, 200, 55, 55);
		btnSete.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
				txtVisor.setText(txtVisor.getText() + "7"); //botao no visor
			}
		});
		paine.add(btnOito);
		btnOito.setBounds(80, 200, 55, 55);
		btnOito.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
				txtVisor.setText(txtVisor.getText() + "8");
			}
		});
		
		paine.add(btnNove);
		btnNove.setBounds(140, 200, 55, 55);
		btnNove.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
				txtVisor.setText(txtVisor.getText() + "9");
			}
		});
		
		paine.add(btnDiv);
		btnDiv.setBounds(200, 200, 55, 55);
		btnDiv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){				
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				op = "DIV";
			}
		});
		
		paine.add(btnPorc);
		btnPorc.setBounds(260, 200, 55, 55);
		
		paine.add(btnQuatro);
		btnQuatro.setBounds(20, 260, 55, 55);
		btnQuatro.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
				txtVisor.setText(txtVisor.getText() + "4");
			}
		});
		
		paine.add(btnCinco);
		btnCinco.setBounds(80, 260, 55, 55);
		btnCinco.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
				txtVisor.setText(txtVisor.getText() + "5");
			}
		});
		
		paine.add(btnSeis);
		btnSeis.setBounds(140, 260, 55, 55);
		btnSeis.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
				txtVisor.setText(txtVisor.getText() + "6");
			}
		});
		
		paine.add(btnMult);
		btnMult.setBounds(200, 260, 55, 55);
		btnMult.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){				
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				op = "MULT";
			}
		});
		
		paine.add(btnUmX);
		btnUmX.setBounds(260, 260, 55, 55);
		
		paine.add(btnUm);
		btnUm.setBounds(20, 320, 55, 55);
		btnUm.addActionListener(new ActionListener(){ //IMPORTAR!
			public void actionPerformed(ActionEvent e){ //IMPORTAR "Event" ANTES do "Action"
				txtVisor.setText(txtVisor.getText() + "1");
			}
		});
		
		paine.add(btnDois);
		btnDois.setBounds(80, 320, 55, 55);
		btnDois.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
				txtVisor.setText(txtVisor.getText() + "2");
			}
		});
		
		paine.add(btnTres);
		btnTres.setBounds(140, 320, 55, 55);
		btnTres.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
				txtVisor.setText(txtVisor.getText() + "3");
			}
		});
		
		paine.add(btnMenos);
		btnMenos.setBounds(200, 320, 55, 55);
		btnMenos.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){				
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				op = "SUBT";
			}
		});
		
		paine.add(btnIgual);
		btnIgual.setBounds(260, 320, 55, 115);
		btnIgual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor2 = Double.parseDouble(txtVisor.getText());
				Calculo cal = new Calculo();
				if(op.equals("SOMAR")){
					txtVisor.setText("" + cal.soma(valor1, valor2));
				}
				else
					if(op.equals("SUBT")){
						txtVisor.setText("" + cal.subtracao(valor1, valor2));
					}
					else
						if(op.equals("MULT")){
							txtVisor.setText("" + cal.multiplicacao(valor1, valor2));
						}
						else
							if(op.equals("DIV")){
								txtVisor.setText("" + cal.divisao(valor1, valor2));
							}
				// txtVisor.setText(String.valueOf(total));
			}
		});
				
		
		paine.add(btnZero);
		btnZero.setBounds(20, 380, 115, 55);
		btnZero.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e){ 
				txtVisor.setText(txtVisor.getText() + "0");
			}
		});
		
		paine.add(btnVirg);
		btnVirg.setBounds(140, 380, 55, 55);
		
		paine.add(btnMais);
		btnMais.setBounds(200, 380, 55, 55);	
		btnMais.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				op = "SOMAR";
			}
		});
				
		this.setLayout(null); //METODO "layout": responsavel por definir o posicionamento dos objetos no layout/tela
		this.setVisible(true); //"Visible": responsavel por deixar a tela visivel
		this.setSize(350, 490); //"Size" define tamanho da tela		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //para fechar aplicacao		
	
	}
	public static void main(String args[]){
		Calculadora calc = new Calculadora(); //instanciador 		
	}
}
