package cl.comunitas.apirest.servicios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import cl.comunitas.apirest.comunes.models.entity.Archivo;
import cl.comunitas.apirest.comunes.models.entity.Empleado;
import cl.comunitas.apirest.comunes.models.entity.Role;
import cl.comunitas.apirest.comunes.models.entity.Tarea;
import cl.comunitas.apirest.comunes.models.entity.TipoTarea;
import cl.comunitas.apirest.comunes.models.entity.Usuario;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(
				Usuario.class, 
				Role.class, 
				Empleado.class, 
				Tarea.class, 
				TipoTarea.class, 
				Archivo.class);
	}

}
