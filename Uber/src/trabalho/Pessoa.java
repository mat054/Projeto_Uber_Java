package trabalho;

public abstract class  Pessoa {
	protected String nome;
	protected String numeroTelefone;
	protected String email;
	protected String senha;
	
	public Pessoa (String nome, String numeroTelefone, String email, String senha) {
		this.nome = nome;
		this.numeroTelefone = numeroTelefone;
		this.email = email;
		this.senha = senha;
		
	}
	
	public String getNome() {
		return nome;
	}
//	public void 
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}
	
	public void visualizarPerfil() {
		System.out.println("Nome: "+ nome);
		System.out.println("Email: "+ email);
		System.out.println("Numero de telefone: "+ numeroTelefone);
	}
	
	public void atualizarPerfil(String novaSenha, String novoEmail, String novoNumeroTelefone) {
		this.setEmail(novoEmail);
		this.setSenha(novaSenha);
		this.setNumeroTelefone(novoNumeroTelefone);
		
	}
	
	public boolean fazerLogin(String login) {
		return true;
	}
}
