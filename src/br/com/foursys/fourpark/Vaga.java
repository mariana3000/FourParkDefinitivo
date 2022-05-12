package br.com.foursys.fourpark;

public class Vaga {

	private Integer posicao;
	private Boolean ocupado = false;
	private Veiculo veiculo;
	private Double valorHora = 15.00;
	
	
	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public Boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Double calcularPagamento(Vaga estacionamento) {
		double valorMinuto = valorHora/60;
		double pagamento = 0.0;
		int hora, minuto, horaEntrada, minutoEntrada, horaSaida, minutoSaida;
		
		horaEntrada = Integer.parseInt(estacionamento.getVeiculo().getHoraEntrada().substring(0,2));
		minutoEntrada = Integer.parseInt(estacionamento.getVeiculo().getHoraEntrada().substring(3,5)); 
		
		horaSaida = Integer.parseInt(estacionamento.getVeiculo().getHoraSaida().substring(0,2));
		minutoSaida = Integer.parseInt(estacionamento.getVeiculo().getHoraSaida().substring(3,5)); 
		
		hora = horaSaida - horaEntrada;
		minuto = minutoSaida - minutoEntrada;
		pagamento = minuto* valorMinuto + hora*valorHora;
		
		return pagamento;
		
		
	}
	
}
