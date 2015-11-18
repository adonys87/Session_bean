package br.com.dextra.treinamento.model.service;

import java.util.List;

import javax.ejb.Local;

import br.com.dextra.treinamento.model.domain.Post;

@Local
public interface PostServiceLocal {

	List<Post> listar();

	void salvar(Post p);

}
