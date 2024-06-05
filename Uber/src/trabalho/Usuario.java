package trabalho;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Usuario extends Pessoa{
	private ArrayList<Viagem> viagensUsuario;

	public Usuario(String nome, String numeroTelefone, String email, String senha) {
		super(nome, numeroTelefone, email, senha);
		this.viagensUsuario = new ArrayList<>();
	}

	public ArrayList<Viagem> getViagensUsuario() {
		return viagensUsuario;
	}

	public void setViagensUsuario(ArrayList<Viagem> viagensUsuario) {
		this.viagensUsuario = viagensUsuario;
	}
	
	
	
	public String toString() {
		return nome;
	}
	
	public void adicionarViagem(Viagem viagem) {
		viagensUsuario.add(viagem);
	}
	
	 public boolean solicitarViagem(String origem, String destino,String data, String horario) {

		 	String idViagem = UUID.randomUUID().toString(); //gera um ID aleatório para a viagem

	        double valorViagem = gerarValorViagemAleatorio(); //gera um valor aleatório (para representar como seria a solicitação de uma viagem)

	        Viagem novaViagem = new Viagem(origem, destino, horario, data, valorViagem, idViagem);

	        viagensUsuario.add(novaViagem);
	        if (viagensUsuario.add(novaViagem)) {
	        	
	            System.out.println("Viagem solicitada! ID da viagem: " + idViagem);

	            return true; // Retorna true se a viagem foi adicionada com sucesso à lista de viagens do usuário
	        } else {
	            return false; // Retorna false se a viagem não pôde ser adicionada à lista de viagens
	        }
	    }

	  private double gerarValorViagemAleatorio() {
	        // Geração de um valor aleatório para a viagem, só para demonstrar a solicitação de uma viagem
		  	Random rand = new Random();
	        return rand.nextDouble() * 10; // Valor aleatório entre 0 e 100 (exemplo)
	    }
	  
	  public boolean cancelarViagem(String idViagem) {
		    for (Viagem viagem : viagensUsuario) {
		        if (viagem.getId().equals(idViagem)) {
		            viagensUsuario.remove(viagem);
		            return true; // Retorna true se a viagem foi encontrada e cancelada com sucesso
		        }
		    }
		    return false; // Retorna false se a viagem com o ID especificado não foi encontrada
		}
}
