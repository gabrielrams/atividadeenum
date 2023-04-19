package entities;

import java.util.ArrayList;
import java.util.Date;

import entities.enums.Cargo;
import entities.enums.Status;

public class Contratacao {
	
	private Date data;
	
	private Cargo cargo;
	
	private Status status;
	
	private Funcionario funcionario;
	
	private Projeto projeto;

	public Contratacao(Date data, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		super();
		this.data = data;
		this.cargo = cargo;
		this.projeto = projeto;
		this.funcionario = funcionario;
		this.status = Status.PENDENTE;
		
		if(projeto.getContratacoes() == null) {
			projeto.setContratacoes(new ArrayList<Contratacao>());
		}
		
		projeto.adicionarContratacao(this);
	}

	public Contratacao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void pendente() {
		this.status = Status.PENDENTE;
	}
	
	public void contratar() {
		this.status = Status.CONTRATADO;
	}
	
	public void demitir() {
		this.status = status.DEMITIDO;
		
		if(projeto.getContratacoes() != null) {
			projeto.removerContratacao(this);
		}
		
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Contratacao other = (Contratacao) obj;
		if (cargo != other.cargo)
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	
	
	
}
