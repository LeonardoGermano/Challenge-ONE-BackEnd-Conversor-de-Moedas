package conversorMoedas;

public class Moedas {

	public double dolar(double valor) {
		valor *= 5.45;
		return valor;
	}
	public double euro(double valor) {
		valor *= 5.57;
		return valor;
	}
	public double iene(double valor) {
		valor *= 0.039;
		return valor;
	}
	public double libra(double valor) {
		valor *= 6.31;
		return valor;
	}
	public double franco(double valor) {
		valor *= 5.58;
		return valor;
	}
	public double dolarCanadense(double valor) {
		valor *= 3.77;
		return valor;
	}
	public double dolarAutraliano(double valor) {
		valor *= 3.42;
		return valor;
		
	}
	public double coroaNorueguesa(double valor) {
		valor *= 0.49;
		return valor;
		
	}
	public double coroaDinamarquesa(double valor) {
		valor *= 0.75;
		return valor;
		
	}
	
}
