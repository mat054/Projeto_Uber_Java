package trabalho;

public class Viagem {
	private String origem;
	private String destino;
	private String horario;
	private String data;
	private double valor;
	private String id;
	
	public Viagem(String origem, String destino, String horario, String data, double valor, String id) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.horario = horario;
		this.data = data;
		this.valor = valor;
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return id;
	}
	public void alterarDestino(String novoDestino) {
	    this.destino = novoDestino;
	    System.out.println("Destino alterado para: " + novoDestino);
	}
	public void alterarOrigem (String novaOrigem) {
		this.origem = novaOrigem;
		System.out.println("Ponto de partida alterado para: "+ novaOrigem);
	}

	

}
