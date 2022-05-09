package br.com.foursys.fourpark;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int TAMANHO = 50;
		Vaga[] estacionamento = new Vaga[TAMANHO];
		Scanner sc = new Scanner(System.in);
		Integer opcao = null;

		for (int i = 0; i < estacionamento.length; i++) {
			estacionamento[i] = new Vaga();
			estacionamento[i].setPosicao(i + 1);
			estacionamento[i].setOcupado(false);

		}

		do {

			System.out.println("##----------MENU ESTACIONAMENTO-----------##\n");
			System.out.print("|--------------------------------------------|\n");
			System.out.print("| Opção 1 - Registrar entrada do veículo     |\n");
			System.out.print("| Opção 2 - Registrar saída do veículo       |\n");
			System.out.print("| Opção 3 - Verificar vagas disponíveis      |\n");
			System.out.print("| Opção 4 - Verificar as vagas ocupadas      |\n");
			System.out.print("| Opção 0 - Sair                             |\n");
			System.out.print("|--------------------------------------------|\n");
			System.out.print("|           Selecione uma opção!             |\n");

			opcao = sc.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Obrigado por utilizar nosso sistema! ");
				break;

			case 1:
				Veiculo veiculo = new Veiculo();
				sc.nextLine();
				System.out.println("Favor informar a placa do veiculo!");
				veiculo.setPlaca(sc.nextLine());
				System.out.println("Favor informar a modelo do veiculo!");
				veiculo.setModelo(sc.nextLine());
				System.out.println("Favor informar o Tipo do veiculo!");
				veiculo.setTipo(sc.nextLine());
				System.out.println("Informe o horario de entrada no estacionamento!");
				veiculo.setHoraEntrada(sc.nextLine());

				for (int i = 0; i < estacionamento.length; i++) {
					if (!estacionamento[i].getOcupado()) {
						estacionamento[i].setVeiculo(veiculo);
						estacionamento[i].setOcupado(true);
						System.out.println("A vaga " + estacionamento[i].getPosicao() + " foi ocupada com sucesso!");
						System.out.println("O veiculo entrou no estacionamento "
								+ estacionamento[i].getVeiculo().getHoraEntrada());
						break;
					}
				}
				break;

			case 2:
				int vaga;
				boolean validaPosicao;
				do {
					System.out.println("Favor informar a Vaga em que seu veiculo se encontra!");
					vaga = sc.nextInt();
					validaPosicao = vaga > estacionamento.length || vaga < 1;
					if (validaPosicao) {
						System.err.println("Valor inválido! ");
					}
				} while (validaPosicao);

				vaga = vaga - 1;
				sc.nextLine();
				if (estacionamento[vaga].getOcupado()) {
					System.out.println("Qual é o horario de saida? ");
					estacionamento[vaga].getVeiculo().setHoraSaida(sc.nextLine());
					System.out.println("Sua vaga foi desocupada! ");
					System.out.println("Horario de saida: " + estacionamento[vaga].getVeiculo().getHoraSaida());
					estacionamento[vaga].setOcupado(false);
					estacionamento[vaga].setVeiculo(null);
				} else {
					System.out.println("A vaga está vazia! ");
				}
				break;

			case 3:
				for (int i = 0; i < estacionamento.length; i++) {
					if (!estacionamento[i].getOcupado()) {
						System.out.println("A vaga " + estacionamento[i].getPosicao() + " está disponível! ");
					}
				}
				break;
			case 4:
				int cont = 0;
				for (int i = 0; i < estacionamento.length; i++) {
					if (estacionamento[i].getOcupado()) {
						System.out.println("A vaga " + estacionamento[i].getPosicao() + " está Ocupada! ");
						System.out.println(estacionamento[i].getVeiculo().toString());
						cont = 1;
					}
				}

				if (cont == 0) {
					System.out.println(" No momento não possuimos vagas ocupadas!");
				}
				break;
			}

		} while (opcao != 0);
		sc.close();

	}

}
