package entities.enums;

public enum TipoDeDocumento {

	RG("Registro Geral"),
	CPF("Cadastro de Pessoa F�sica"),
	CNPJ("Cadastro de Pessoa Jur�dica");
	
	private String descricao;

	private TipoDeDocumento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
