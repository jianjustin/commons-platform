package ${package_name}.controller;

import ${root_package_name}.common.base.impl.BaseQueryRepositoryImpl;
import ${package_name}.api.${TableName}Api;
import ${package_name}.domain.${TableName};
import ${package_name}.service.${TableName}Service;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;



@Controller
public class ${TableName}Cotrollor implements ${TableName}Api{
    @Autowired
	private ${TableName}Service ${tableName}Service;
    @Autowired
    private BaseQueryRepositoryImpl<${TableName}, Serializable> baseQueryRepositoryImpl;
	
	public ResponseEntity<?> save(${TableName} ${tableName}) {
    	${tableName}Service.save(${tableName});
    	return new ResponseEntity<${TableName}>(HttpStatus.OK);
	}
    
	public ResponseEntity<?> delete(${TableName} ${tableName}) {
		${tableName}Service.delete(${tableName});
		return new ResponseEntity<${TableName}>(HttpStatus.OK);
	}
	
	public ResponseEntity<?> update(${TableName} ${tableName}) {
		${tableName}Service.update(${tableName});
		return new ResponseEntity<${TableName}>(HttpStatus.OK);
	}
    
	public ${TableName}Service get${TableName}Service() {
		return ${tableName}Service;
	}
	public void set${TableName}Service(${TableName}Service ${tableName}Service) {
		this.${tableName}Service = ${tableName}Service;
	}
	public BaseQueryRepositoryImpl<${TableName}, Serializable> getBaseQueryRepositoryImpl() {
		return baseQueryRepositoryImpl;
	}
	public void setBaseQueryRepositoryImpl(
			BaseQueryRepositoryImpl<${TableName}, Serializable> baseQueryRepositoryImpl) {
		this.baseQueryRepositoryImpl = baseQueryRepositoryImpl;
	}

    
    
}
