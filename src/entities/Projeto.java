package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {

	private String nome;
	
	private Date dt_Inicio;
	
	private Date dt_Termino;
	
	private List<Contratacao> contratacoes;	
	

	public Projeto(String nome, Date dt_Inicio, Date dt_Termino) {
		super();
		this.nome = nome;
		this.dt_Inicio = dt_Inicio;
		this.dt_Termino = dt_Termino;
	}

	public Projeto() {
		super();
	}

	public boolean adicionarContratacao(Contratacao contratacao) {
		if(contratacoes == null) {
			contratacoes = new ArrayList<Contratacao>();
		}
		
		if(contratacoes != null && !contratacoes.contains(contratacao)) {
			contratacoes.add(contratacao);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean removerContratacao(Contratacao contratacao) {
		if(contratacoes != null && contratacoes.contains(contratacao)) {
			contratacoes.remove(contratacao);
			return true;
		}else {
			return false;
		}
	}
	
	public void listarContratacao() {
		if(contratacoes != null && contratacoes.isEmpty()) {
			System.out.println();
			System.out.println("***NENHUM REGISTRO ENCONTRADO***");
		}else{
			System.out.println("***CONTRATAÇÕES***\n");
			System.out.println("Projetos:\n");
			System.out.println("\t" + this.getNome() + "\n");
			System.out.println("Funcionario(s):\n");
			for(Contratacao c : contratacoes) {
				System.out.println("\t" + c.getFuncionario().getNome() + " [Status: " + c.getStatus() + "]\n");
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDt_Inicio() {
		return dt_Inicio;
	}

	public void setDt_Inicio(Date dt_Inicio) {
		this.dt_Inicio = dt_Inicio;
	}

	public Date getDt_Termino() {
		return dt_Termino;
	}

	public void setDt_Termino(Date dt_Termino) {
		this.dt_Termino = dt_Termino;
	}

	public List<Contratacao> getContratacoes() {
		return contratacoes;
	}

	public void setContratacoes(List<Contratacao> contratacoes) {
		this.contratacoes = contratacoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contratacoes == null) ? 0 : contratacoes.hashCode());
		result = prime * result + ((dt_Inicio == null) ? 0 : dt_Inicio.hashCode());
		result = prime * result + ((dt_Termino == null) ? 0 : dt_Termino.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Projeto other = (Projeto) obj;
		if (contratacoes == null) {
			if (other.contratacoes != null)
				return false;
		} else if (!contratacoes.equals(other.contratacoes))
			return false;
		if (dt_Inicio == null) {
			if (other.dt_Inicio != null)
				return false;
		} else if (!dt_Inicio.equals(other.dt_Inicio))
			return false;
		if (dt_Termino == null) {
			if (other.dt_Termino != null)
				return false;
		} else if (!dt_Termino.equals(other.dt_Termino))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
}
