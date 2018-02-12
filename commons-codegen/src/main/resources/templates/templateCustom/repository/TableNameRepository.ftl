package ${package_name}.repository;

import java.io.Serializable;
import java.util.List;
import javax.transaction.Transactional;

import ${root_package_name}.common.base.BaseMotifyRepository;
import ${package_name}.domain.${TableName};
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/********************************************
 * 实体操作接口
 * @author janine
 * @since 2017-12-12
 *********************************************/
@Repository
public interface ${TableName}Repository extends BaseMotifyRepository<${TableName}, Serializable>{

	
}
