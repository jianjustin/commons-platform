package ${package_name}.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ${package_name}.domain.${TableName};
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ${Prefix}_${Suffix}表api接口
 * @author codegen tools
 * 
 */
@Api(value = "${Prefix}_${Suffix}表接口")
public interface ${TableName}Api {

//----------------------------产品级实现------------------------------------------------------------------------------------------------------

	@ApiOperation(value = "创建${Prefix}_${Suffix}", notes = "", response = ${Prefix}${Suffix}.class, tags = { "${prefix}.${suffix}",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = ${Prefix}${Suffix}.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/${prefix}/${suffix}/save", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> save(
			@ApiParam(value = "${Prefix}_${Suffix}表对象", required = true) @RequestBody ${Prefix}${Suffix} ${prefix}${Suffix});
	
	@ApiOperation(value = "删除${Prefix}_${Suffix}", notes = "", response = ${Prefix}${Suffix}.class, tags = { "${prefix}.${suffix}",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = ${Prefix}${Suffix}.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/${prefix}/${suffix}/delete", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> delete(
			@ApiParam(value = "${Prefix}_${Suffix}表对象", required = true) @RequestBody ${Prefix}${Suffix} ${prefix}${Suffix});
	
	@ApiOperation(value = "修改${Prefix}_${Suffix}", notes = "", response = ${Prefix}${Suffix}.class, tags = { "${prefix}.${suffix}",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = ${Prefix}${Suffix}.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/${prefix}/${suffix}/update", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> update(
			@ApiParam(value = "${Prefix}_${Suffix}表对象", required = true) @RequestBody ${Prefix}${Suffix} ${prefix}${Suffix});
	

//----------------------------产品级实现------------------------------------------------------------------------------------------------------
//----------------------------应用级实现------------------------------------------------------------------------------------------------------
//----------------------------应用级实现------------------------------------------------------------------------------------------------------
	
}
