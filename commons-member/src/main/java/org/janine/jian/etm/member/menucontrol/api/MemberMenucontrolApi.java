package org.janine.jian.etm.member.menucontrol.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.janine.jian.etm.member.menucontrol.domain.MemberMenucontrol;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Member_Menucontrol表api接口
 * @author codegen tools
 * 
 */
@Api(value = "Member_Menucontrol表接口")
public interface MemberMenucontrolApi {

//----------------------------产品级实现------------------------------------------------------------------------------------------------------

	@ApiOperation(value = "创建Member_Menucontrol", notes = "", response = MemberMenucontrol.class, tags = { "member.menucontrol",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = MemberMenucontrol.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/member/menucontrol/save", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> save(
			@ApiParam(value = "Member_Menucontrol表对象", required = true) @RequestBody MemberMenucontrol memberMenucontrol);
	
	@ApiOperation(value = "删除Member_Menucontrol", notes = "", response = MemberMenucontrol.class, tags = { "member.menucontrol",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = MemberMenucontrol.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/member/menucontrol/delete", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> delete(
			@ApiParam(value = "Member_Menucontrol表对象", required = true) @RequestBody MemberMenucontrol memberMenucontrol);
	
	@ApiOperation(value = "修改Member_Menucontrol", notes = "", response = MemberMenucontrol.class, tags = { "member.menucontrol",})
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "保存成功", response = MemberMenucontrol.class),
			@ApiResponse(code = 400, message = "输入参数非法", response = Void.class),
			@ApiResponse(code = 422, message = "保存失败", response = String.class) })
	@RequestMapping(value = "/member/menucontrol/update", produces = { "application/json" }, consumes = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> update(
			@ApiParam(value = "Member_Menucontrol表对象", required = true) @RequestBody MemberMenucontrol memberMenucontrol);
	

//----------------------------产品级实现------------------------------------------------------------------------------------------------------
//----------------------------应用级实现------------------------------------------------------------------------------------------------------
//----------------------------应用级实现------------------------------------------------------------------------------------------------------
	
}
