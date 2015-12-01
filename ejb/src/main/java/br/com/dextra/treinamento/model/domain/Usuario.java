package br.com.dextra.treinamento.model.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String login;
	private String senha;
	private String nome;
	private String sobrenome;
	private String email;
	private Date dataNasc;

	public Usuario() {
	}
	
	private List<PermissaoUsuario> permissions; 
	@Enumerated (EnumType.STRING)
	@ElementCollection(targetClass=PermissaoUsuario.class)
	@CollectionTable(name="usuario_permissao")
	//@OneToMany(mappedBy="usuario" , fetch= FetchType.EAGER)
	public List<PermissaoUsuario> getPermissions() {
		return permissions;
	}
	
	public void setPermissions(List<PermissaoUsuario> permissions) {
		this.permissions = permissions;
	}
	
	public Usuario(String usuario, String senha, String nome, String sobrenome,
			String email, Date dataNasc) {
		super();
		this.login = usuario;
		this.senha = senha;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.dataNasc = dataNasc;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}	
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String usuario) {
		this.login = usuario;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

}
