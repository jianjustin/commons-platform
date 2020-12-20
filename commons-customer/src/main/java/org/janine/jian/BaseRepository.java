package org.janine.jian;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
@Repository
public interface BaseRepository<T,ID extends Serializable> extends CrudRepository<T, Serializable>{

	
	
	
}
