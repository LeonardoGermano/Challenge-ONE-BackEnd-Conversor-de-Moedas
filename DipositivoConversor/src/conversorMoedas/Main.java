package conversorMoedas;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Moedas moedas = new Moedas();
		Escalas escalas = new Escalas();
		String opcao = "";
		// apresenta ao usuario as opções de conversão
		do {
		String menu = JOptionPane.showInputDialog(null,"Escolha uma opção!","menu",
				JOptionPane.QUESTION_MESSAGE, null,new Object[] {"Conversor de moedas", "Conversor de temperatura"},"Escolha").toString();
	
		double valor = Double.parseDouble(JOptionPane.showInputDialog("insira um valor"));
		//verifica qual o tipo de conversor o usuario vai usar
		if (menu=="Conversor de moedas") {
		String	conversaoMoedas = JOptionPane.showInputDialog(null,"Escolha uma moeda","Moedas",
					JOptionPane.QUESTION_MESSAGE, null,new Object[] {"Dólar Americano (USD)",
							"Euro (EUR)",
							"Iene Japonês (JPY)",
							"Libra Esterlina (GBP)",
							"Franco Suíço (CHF)",
							"Dólar Canadense (CAD)",
							"Dólar Australiano (AUD)",
							"Coroa Norueguesa (NOK)",
							"Coroa Dinamarquesa (DKK)"},"Escolha").toString();
		    
			switch (conversaoMoedas) {
			case"Dólar Americano (USD)": {
				JOptionPane.showMessageDialog(null,"Valor convertido: R$"+ moedas.dolar(valor));
				break;
			}
			case"Euro (EUR)":{
				JOptionPane.showMessageDialog(null,"Valor convertido: R$"+ moedas.euro(valor));
				break;
			}
			case "Iene Japonês (JPY)":{
				JOptionPane.showMessageDialog(null,"Valor convertido: R$"+ moedas.iene(valor));
				break;
			}
			case "Libra Esterlina (GBP)":{
				JOptionPane.showMessageDialog(null,"Valor convertido: R$"+ moedas.libra(valor));
				break;
			}
			case "Franco Suíço (CHF)":{
				JOptionPane.showMessageDialog(null,"Valor convertido: R$"+ moedas.franco(valor));
				break;
			}
			case "Dólar Canadense (CAD)":{
				JOptionPane.showMessageDialog(null,"Valor convertido: R$"+ moedas.dolarCanadense(valor));
				break;
			}
			case "Dólar Australiano (AUD)":{
				JOptionPane.showMessageDialog(null,"Valor convertido: R$"+ moedas.dolarAutraliano(valor));
				break;
			}
			case "Coroa Norueguesa (NOK)":{
				JOptionPane.showMessageDialog(null,"Valor convertido: R$"+ moedas.coroaNorueguesa(valor));
				break;
			}case "Coroa Dinamarquesa (DKK)":{
				JOptionPane.showMessageDialog(null,"Valor convertido: R$"+ moedas.coroaDinamarquesa(valor));
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, 
					    "A moeda escolhida não exite em nosso banco de dados!",  
					    "error",                  
					    JOptionPane.ERROR_MESSAGE); 
			}
		
		} else {
			String temperatura =JOptionPane.showInputDialog(null,"Escalas de temperatura","Escalas",
					JOptionPane.QUESTION_MESSAGE, null,new Object[] {"Kelvin (K)", "Celsius (C)", "Fahrenheit (F)"},"Escolha").toString();
			switch (temperatura) {
			case "Kelvin (K)": {
				JOptionPane.showMessageDialog(null,"Temperatura: "+ escalas.kelvin(valor)+"º");
				break;
			}
			case "Celsius (C)" :{
				JOptionPane.showMessageDialog(null,"Temperatura: "+ escalas.cesius(valor)+"º");
				break;
			}
			case "Fahrenheit (F)" :{
				JOptionPane.showMessageDialog(null,"Temperatura: "+ escalas.fahrenheit(valor)+"º");
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, 
					    "A escala escolhida não exite em nosso banco de dados!",  
					    "error",                  
					    JOptionPane.ERROR_MESSAGE); 
			
			}
		}
		opcao = JOptionPane.showInputDialog(null,"Deseja continuar","menu",
				JOptionPane.QUESTION_MESSAGE, null,new Object[] {"sim", "não"},"Escolha").toString();
	
			
		}while(opcao=="sim");
	}
}