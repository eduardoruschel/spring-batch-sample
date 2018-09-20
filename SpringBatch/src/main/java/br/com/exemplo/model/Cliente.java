package br.com.exemplo.model;


/**
 * 

create sequence SEQ_CLIENTE
minvalue 1
maxvalue 9999999999
start with 1
increment by 1
nocache
cycle;

create table CLIENTE(
Id Integer not null,
nome VARCHAR(100),
cpf VARCHAR(100),
rg VARCHAR(100),
datanascimento VARCHAR(100),
sexo VARCHAR(10),
CONSTRAINT clientePk PRIMARY KEY (Id)
)
 * @author eduardo.ruschel
 *
 */

public class Cliente {
	
	private String nome;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
