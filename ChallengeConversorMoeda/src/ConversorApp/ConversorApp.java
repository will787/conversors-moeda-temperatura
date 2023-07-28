package ConversorApp;

import javax.swing.JOptionPane;

public class ConversorApp extends OpcoesConversoes{

	public static String input;

	public static void main(String[] args) {

		
			while(true) {
			String[] opcoes = { "Conversor de Moeda", "Conversor de Temperatura" };
		
			String opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Selecione uma opção:",
	                "Menu", JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
			
			
			switch(opcaoSelecionada) {
	        case "Conversor de Moeda":
	        	try {
	                OpcoesConversoes conversor = new OpcoesConversoes();
	                String input = JOptionPane.showInputDialog("Digite um valor:");
	                double valorRecebido = Double.parseDouble(input);
	                conversor.ConversaoMoeda(valorRecebido);
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "Digite um valor numérico válido.");
	            } catch (NullPointerException e) {
	                JOptionPane.showMessageDialog(null, "Saindo do programa . . .");
	                System.exit(0);
	            }
	    		
	    		int decisao = JOptionPane.showConfirmDialog(null,
	    	             "Deseja continuar ?", "Selecione uma opção", JOptionPane.YES_NO_OPTION);
	    		
	    		if (decisao == JOptionPane.NO_OPTION){
	    			JOptionPane.showMessageDialog(null, "Programa finalizado");
	    			return;
	    		} else {
	    			JOptionPane.showMessageDialog(null, "Faça seu novo tipo de conversão");
	    			break;
	    		}
	    		
	    		
	        case "Conversor de Temperatura":
			   		JOptionPane.showInputDialog("Digite a Temperatura:"); 

	        	break;
	        }
			
			}
			

	       
  }
}


