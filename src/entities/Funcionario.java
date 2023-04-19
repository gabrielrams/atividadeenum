package entities;

import java.util.List;

import entities.enums.Status;
import entities.enums.TipoDeDocumento;

public class Funcionario {

	private String nome;
	
	private String numeroDocumento;
	
	private TipoDeDocumento documento;
	
	private List<Projeto> projetos;
	
		

	public Funcionario(String nome, TipoDeDocumento documento, String numeroDocumento) {
		super();
		this.nome = nome;
		this.numeroDocumento = numeroDocumento;
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public TipoDeDocumento getDocumento() {
		return documento;
	}

	public void setDocumento(TipoDeDocumento documento) {
		this.documento = documento;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroDocumento == null) ? 0 : numeroDocumento.hashCode());
		result = prime * result + ((projetos == null) ? 0 : projetos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (documento != other.documento)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroDocumento == null) {
			if (other.numeroDocumento != null)
				return false;
		} else if (!numeroDocumento.equals(other.numeroDocumento))
			return false;
		if (projetos == null) {
			if (other.projetos != null)
				return false;
		} else if (!projetos.equals(other.projetos))
			return false;
		return true;
	}
	
	
	 
	
}
