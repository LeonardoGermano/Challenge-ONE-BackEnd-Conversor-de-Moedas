package conversorMoedas;

public class Escalas {
//metodo para tranformar celsius em kelvin
	public double kelvin(double valor) {
		valor += 273.15;
		return valor;
		
	}
	//metodo para tranformar celsius em fahrenheit
	public double fahrenheit(double valor) {
		valor = (valor*9/5)+32;
		return valor;
	}
	//metodo que retorna celsius
	public double cesius(double valor) {
		
		return valor;
	}
}
