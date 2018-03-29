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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
public class ${TableName}Controllor implements ${TableName}Api{
    @Autowired
	private ${TableName}Service ${tableName}Service;
    @Autowired
    private BaseQueryRepositoryImpl<${TableName}, Serializable> baseQueryRepositoryImpl;
	

//----------------------------产品级实现------------------------------------------------------------------------------------------------------
	
	@ApiOperation(value = "创建${Prefix}_${Suffix}", notes = "", response = ${Prefix}${Suffix}.class, tags = { "${prefix}.${suffix}",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = ${Prefix}${Suffix}.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/${prefix}/${suffix}/save", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> save(
			@ApiParam(value = "${Prefix}_${Suffix}表对象", required = true) @RequestBody ${Prefix}${Suffix} ${prefix}${Suffix}){
    	${tableName}Service.save(${tableName});
    	return new ResponseEntity<${TableName}>(HttpStatus.OK);
	}
    
	@ApiOperation(value = "删除${Prefix}_${Suffix}", notes = "", response = ${Prefix}${Suffix}.class, tags = { "${prefix}.${suffix}",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = ${Prefix}${Suffix}.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/${prefix}/${suffix}/delete", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> delete(
			@ApiParam(value = "${Prefix}_${Suffix}表对象", required = true) @RequestBody ${Prefix}${Suffix} ${prefix}${Suffix}){
		${tableName}Service.delete(${tableName});
		return new ResponseEntity<${TableName}>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "修改${Prefix}_${Suffix}", notes = "", response = ${Prefix}${Suffix}.class, tags = { "${prefix}.${suffix}",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = ${Prefix}${Suffix}.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/${prefix}/${suffix}/update", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> update(
			@ApiParam(value = "${Prefix}_${Suffix}表对象", required = true) @RequestBody ${Prefix}${Suffix} ${prefix}${Suffix}){
		${tableName}Service.update(${tableName});
		return new ResponseEntity<${TableName}>(HttpStatus.OK);
	}


//----------------------------产品级实现------------------------------------------------------------------------------------------------------


//----------------------------应用级实现------------------------------------------------------------------------------------------------------	
//----------------------------应用级实现------------------------------------------------------------------------------------------------------

    
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
