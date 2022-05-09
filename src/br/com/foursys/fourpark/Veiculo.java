package br.com.foursys.fourpark;

public class Veiculo {
	private String placa;
	private String modelo;
	private String tipo;
	private String telefone;
	private String horaEntrada;
	private String horaSaida;

	public Veiculo () {}
		
		
	public Veiculo(String placa, String modelo, String tipo, String telefone, String horaEntrada) {
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
		this.telefone = telefone;
		this.horaEntrada = horaEntrada;
		
		
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}


	public String toString() {
		return "Placa do Veiculo: " + placa + ", Modelo do veiculo: " + modelo + ", Tipo do veiculo: " + tipo + ", Hora de Entrada: " + horaEntrada ;
	}

	
	
}
