package aula_10;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private char sexo;
	private LocalDate dtaNascimento;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public LocalDate getDtaNascimento() {
		return dtaNascimento;
	}
	public void setDtaNascimento(LocalDate dtaNascimento) {
		this.dtaNascimento = dtaNascimento;
	}
	

	
	@Override
	public String toString() {
		return 
				"[==============================================================]\n"
			  + "[========= Nome= " + nome +"\n"                              
			  + "[========= Sobrenome= " + sobrenome +"\n"                            
			  + "[========= Data de Nascimento= " + dtaNascimento +"\n"                
			  + "[========= Sexo= " + sexo +"\n"                                            
			  + "";
	}
	

}
