package cl.comunitas.apirest.servicios.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cl.comunitas.apirest.comunes.models.entity.Tarea;

@RepositoryRestResource(path = "tareas")
public interface ITareaDao extends PagingAndSortingRepository<Tarea, Long> {

}
