package cl.comunitas.apirest.servicios.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import cl.comunitas.apirest.comunes.models.entity.Empleado;

@RepositoryRestResource(path = "empleados")
public interface IEmpleadoDao extends PagingAndSortingRepository<Empleado, Long>{

}
