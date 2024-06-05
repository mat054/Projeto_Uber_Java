package trabalho;

import java.util.ArrayList;

/**
 * @author mateu
 * A classe dados armazerna 3 listas, de usuários, motoristas e viagens!
 */


public class Dados {
	private ArrayList<Usuario> listaUsuario;
	private ArrayList<Motorista> listaMotorista;
	private ArrayList<Viagem> listaViagens;
	
	public Dados() {
		this.listaUsuario = new ArrayList<>();
		this.listaMotorista = new ArrayList<>();
		this.listaViagens = new ArrayList<>();
		preencherDados();
	}

	public ArrayList<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	public ArrayList<Motorista> getListaMotorista() {
		return listaMotorista;
	}

	public void setListaMotorista(ArrayList<Motorista> listaMotorista) {
		this.listaMotorista = listaMotorista;
	}
	
	public void cadastrarUsuario(Usuario usuario) {
		listaUsuario.add(usuario);
	}
	
	public void cadastrarMotorista(Motorista motorista) {
		listaMotorista.add(motorista);
		}
	
	//public void cadastrarViagem(Motorista motorista, Usuario usuario, Viagem viagem) {
		//motorista.adicionarViagem(viagem);
		//usuario.adicionarViagem(viagem);
		
		//this.listaViagens.add(viagem);
	//}
	
	 public void adicionarViagensMotoristas(ArrayList<Motorista> motoristas) {
	        for (Motorista motorista : motoristas) {
	            this.listaViagens.addAll(motorista.getViagensMotorista());
	        }
	    }

	    public void adicionarViagensUsuarios(ArrayList<Usuario> usuarios) {
	        for (Usuario usuario : usuarios) {
	            this.listaViagens.addAll(usuario.getViagensUsuario());
	        }
	    }

	    // ... outros métodos ...

	    public void cadastrarViagem(Viagem viagem) {
	        this.listaViagens.add(viagem); // Adiciona a viagem à lista central
	    }

	
	
	public void listarUsuarios() {
	        System.out.println("### Lista de Usuários ###");
	        for (Usuario usuario : listaUsuario) {
	            System.out.println(usuario);
	        }
	    }

	public void listarMotoristas() {
	        System.out.println("### Lista de Motoristas ###");
	        for (Motorista motorista : listaMotorista) {
	            System.out.println(motorista);
	        }
	    }

	public void listarViagens() {
	        System.out.println("### Lista de Viagens ###");
	        for (Viagem viagem : listaViagens) {
	            System.out.println(viagem);
	        }
	    }
	

	public Usuario buscarUsuarioPorNome (String nomeUsuario) {
		for ( Usuario usuario : listaUsuario) {
			if(usuario.getNome().equalsIgnoreCase(nomeUsuario)) {
				return usuario;
			}
		}
		return null;
	}
	public Usuario buscarUsuarioPorEmail (String email) {
		for (Usuario usuario : listaUsuario) {
			if (usuario.getEmail().equalsIgnoreCase(email)) {
				return usuario;
			}
		}
		return null;
		
	}
	public Motorista buscarMotoristaPorNome (String nome) {
		for (Motorista motorista : listaMotorista) {
			if (motorista.getNome().equalsIgnoreCase(nome)) {
				return motorista;
			}
		}
		return null;
		
	}
	public Motorista buscarMotoristaPorPlaca (String placa) {
		for (Motorista motorista : listaMotorista) {
			if (motorista.getPlaca().equalsIgnoreCase(placa)) {
				return motorista;
			}
		}
		return null;
		
	}
	public Viagem buscarViagemPorId (String id) {
		for (Viagem viagem : listaViagens) {
			if(viagem.getId().equalsIgnoreCase(id)) {
				return viagem;
			}
		}
		return null;
	}
	public Viagem buscarViagemPorData (String data) {
		for (Viagem viagem : listaViagens) {
			if (viagem.getData().equalsIgnoreCase(data)) {
				return viagem;
			}
		}
		return null;
	}
	
	public void preencherDados() {
        for (int i = 0; i < 10; i++) {
            String s = String.valueOf(i);

           
            Usuario usuario = new Usuario("Usuario" + s, "Telefone" + s, "email" + s, "senha" + s);
            listaUsuario.add(usuario);

            Motorista motorista = new Motorista("Motorista" + s, "Telefone" + s, "email" + s, "senha" + s,
                    "Modelo" + s, "Placa" + s, "Cor" + s, "Bairro" + s);
            listaMotorista.add(motorista);

            Viagem viagem = new Viagem("Origem" + s, "Destino" + s, "Horário" + s, "Data" + s, i * 10.0, "Id"+ s);
            listaViagens.add(viagem);
        	}
		}
	}
	
	

	
	
	
	
	
	

