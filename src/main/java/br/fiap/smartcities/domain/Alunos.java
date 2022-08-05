package br.fiap.smartcities.domain;

import java.util.Calendar;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_alunos")
public class Alunos{	 

	@Id
	@SequenceGenerator(name="alunos",sequenceName="sq_tbl_alunos",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="alunos")
	@Column(name = "id_aluno")
	private Integer id;

	@Column(name = "nome_aluno", length = 50)
	private String nome;
	
	@Column(name = "rm_aluno")
	private int rm;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dh_criacao")
	private Calendar dataCriacao;
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dh_modificacao")
	private Calendar dataModificacao;

	 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}
	
	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public Calendar getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Calendar dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

}
