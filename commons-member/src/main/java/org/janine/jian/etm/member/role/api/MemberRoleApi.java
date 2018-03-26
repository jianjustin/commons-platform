package org.janine.jian.etm.member.role.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.janine.jian.etm.member.role.domain.MemberRole;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Member_Role表api接口
 * @author codegen tools
 * 
 */
@Api(value = "Member_Role表接口")
public interface MemberRoleApi {

	@ApiOperation(value = "创建Member_Role", notes = "", response = MemberRole.class, tags = { "member.role",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = MemberRole.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/member/role/save", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> save(
			@ApiParam(value = "Member_Role表对象", required = true) @RequestBody MemberRole memberRole);
	
	@ApiOperation(value = "删除Member_Role", notes = "", response = MemberRole.class, tags = { "member.role",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = MemberRole.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/member/role/delete", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> delete(
			@ApiParam(value = "Member_Role表对象", required = true) @RequestBody MemberRole memberRole);
	
	@ApiOperation(value = "修改Member_Role", notes = "", response = MemberRole.class, tags = { "member.role",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = MemberRole.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/member/role/update", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> update(
			@ApiParam(value = "Member_Role表对象", required = true) @RequestBody MemberRole memberRole);
	

	
}
