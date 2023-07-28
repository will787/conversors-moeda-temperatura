package ConversorApp;

import javax.swing.JOptionPane;

public class OpcoesConversoes {
	
 	private static double cotacaoDolar = 4.73;
    private static double cotacaoEuro = 5.22;
    private static double cotacaoLibra = 6.08;
    private static double cotacaoPesoArgentino = 0.017;
    private static double cotacaoPesoChileno = 0.0057;	


	public void ConversaoMoeda(double valorRecebido) {
		double resultado;

		String[] moedas = { "De Reais a Dolar", "De Reais a Euro", "De Reais a Libras"
				,"De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólar a Reais", "De Euros a Reais", "De Libras a Reais","De Peso Argentino a Reais", "Peso Chileno a Reais"  };
		String moedaSelecionada = (String) JOptionPane.showInputDialog(null, "Escolha a moeda que para a qual você deseja girar seu dinheiro",
		    		"Moedas", JOptionPane.PLAIN_MESSAGE, null, moedas, moedas);
		
		
		    
		    switch(moedaSelecionada) {
		        case "De Reais a Dolar" -> {  
	                resultado = valorRecebido / cotacaoDolar;
	                
	                String mensagemFinal = String.format("Agora você tem U$ %.2f dolares", resultado);
		        	JOptionPane.showMessageDialog(null, mensagemFinal);

		        }
		        case "De Reais a Euro" -> {
	                resultado = valorRecebido / cotacaoEuro;
	                
	                String mensagemFinal = String.format("Agora você tem € %.2f euros", resultado);
		        	JOptionPane.showMessageDialog(null, mensagemFinal);
		        }
		        case "De Reais a Libras" -> {
		        	resultado = valorRecebido / cotacaoLibra;
	                
		        	String mensagemFinal = String.format("Agora você tem £ %.2f libras", resultado);
		        	JOptionPane.showMessageDialog(null, mensagemFinal);
		        	
		        }
		        case "De Reais a Peso Argentino" -> {
		        	resultado = valorRecebido / cotacaoPesoArgentino;
	                
		        	String mensagemFinal = String.format("Agora você tem $ %.2f pesos argentinos", resultado);
		        	JOptionPane.showMessageDialog(null, mensagemFinal);
		        }
		        case "De Reais a Peso Chileno" -> {
		        	resultado = valorRecebido / cotacaoPesoChileno;
	                
		        	String mensagemFinal = String.format("Agora você tem $ %.2f pesos chilenos", resultado);
		        	JOptionPane.showMessageDialog(null, mensagemFinal);
		        }
		        case "De Dólar a Reais" -> {
		        	resultado = valorRecebido * cotacaoDolar ;
	                
		        	String mensagemFinal = String.format("Agora você tem R$ %.2f reais", resultado);
		        	JOptionPane.showMessageDialog(null, mensagemFinal);
		        }
		        case "De Euros a Reais" -> {
		        	resultado = valorRecebido * cotacaoEuro ;
	                
		        	String mensagemFinal = String.format("Agora você tem R$ %.2f reais", resultado);
		        	JOptionPane.showMessageDialog(null, mensagemFinal);
		        }
		        case "De Libras a Reais" ->{
		        	resultado = valorRecebido * cotacaoLibra;
	                
		        	String mensagemFinal = String.format("Agora você tem R$ %.2f reais", resultado);
		        	JOptionPane.showMessageDialog(null, mensagemFinal);
		        }
		        case "De Peso Argentino a Reais" ->{
		        	resultado = valorRecebido * cotacaoPesoArgentino ;
	                
		        	String mensagemFinal = String.format("Agora você tem R$ %.2f reais", resultado);
		        	JOptionPane.showMessageDialog(null, mensagemFinal);
		        }
		        case "Peso Chileno a Reais" ->{
		        	resultado = valorRecebido * cotacaoPesoChileno ;
	                
		        	String mensagemFinal = String.format("Agora você tem R$ %.2f reais", resultado);
		        	JOptionPane.showMessageDialog(null, mensagemFinal);
		        }

		        
		        
		    }
		    
			}      

					
}
