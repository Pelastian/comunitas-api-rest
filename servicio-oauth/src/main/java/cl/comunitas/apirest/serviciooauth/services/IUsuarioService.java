package cl.comunitas.apirest.serviciooauth.services;

import cl.comunitas.apirest.comunes.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
	
	public Usuario update(Usuario usuario, Long id);

}
