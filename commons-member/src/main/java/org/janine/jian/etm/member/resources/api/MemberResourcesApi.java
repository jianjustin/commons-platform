package org.janine.jian.etm.member.resources.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.janine.jian.etm.member.resources.domain.MemberResources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Member_Resources表api接口
 * @author codegen tools
 * 
 */
@Api(value = "Member_Resources表接口")
public interface MemberResourcesApi {

//----------------------------产品级实现------------------------------------------------------------------------------------------------------

	@ApiOperation(value = "创建Member_Resources", notes = "", response = MemberResources.class, tags = { "member.resources",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = MemberResources.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/member/resources/save", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> save(
			@ApiParam(value = "Member_Resources表对象", required = true) @RequestBody MemberResources memberResources);
	
	@ApiOperation(value = "删除Member_Resources", notes = "", response = MemberResources.class, tags = { "member.resources",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = MemberResources.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/member/resources/delete", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> delete(
			@ApiParam(value = "Member_Resources表对象", required = true) @RequestBody MemberResources memberResources);
	
	@ApiOperation(value = "修改Member_Resources", notes = "", response = MemberResources.class, tags = { "member.resources",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = MemberResources.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/member/resources/update", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> update(
			@ApiParam(value = "Member_Resources表对象", required = true) @RequestBody MemberResources memberResources);
	

//----------------------------产品级实现------------------------------------------------------------------------------------------------------
//----------------------------应用级实现------------------------------------------------------------------------------------------------------
//----------------------------应用级实现------------------------------------------------------------------------------------------------------
	
}
