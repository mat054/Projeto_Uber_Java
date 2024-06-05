package trabalho;

import java.util.ArrayList;

public class Motorista extends Pessoa{
	private String modeloCarro;
	private String placa;
	private String corVeiculo;
	private String bairro;
	private ArrayList<Viagem> viagensMotorista;
	
	public Motorista(String nome, String numeroTelefone, String email, String senha, String modeloCarro, String placa,
			String corVeiculo, String bairro) {
		super(nome, numeroTelefone, email, senha);
		this.modeloCarro = modeloCarro;
		this.placa = placa;
		this.corVeiculo = corVeiculo;
		this.bairro = bairro;
		this.viagensMotorista = new ArrayList<>();
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCorVeiculo() {
		return corVeiculo;
	}

	public void setCorVeiculo(String corVeiculo) {
		this.corVeiculo = corVeiculo;
	}

	public String getBairro() {
		return bairro;
	}

	public ArrayList<Viagem> getViagensMotorista() {
		return viagensMotorista;
	}

	public void setViagensMotorista(ArrayList<Viagem> viagensMotorista) {
		this.viagensMotorista = viagensMotorista;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	public String toString() {
		return nome;
	}
	
	
	public void adicionarViagem(Viagem viagem) {
		viagensMotorista.add(viagem);
	}
	
	public void atualizarLocalizacao(String novoBairro) {
	    this.bairro = novoBairro;
	    System.out.println("Localização atualizada para: " + novoBairro);
	}
	
	
	

}
