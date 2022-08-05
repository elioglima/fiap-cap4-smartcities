package br.fiap.smartcities.domain;

import java.util.Calendar;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_professores")
public class Professores{	 

	@Id
	@SequenceGenerator(name="professores",sequenceName="sq_tbl_professores",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="professores")
	@Column(name = "id_professor")
	private Integer id;

	@Column(name = "nome_professor", length = 50)
	private String nome;	
	
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
