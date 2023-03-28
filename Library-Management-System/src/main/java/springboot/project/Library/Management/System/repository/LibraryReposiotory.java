package springboot.project.Library.Management.System.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Library;

public class LibraryRepository 

	public interface LibraryRepository extends CrudRepository<Library,Integer>{

}
