package org.janine.jian.etm.member.role.controller;

import org.janine.jian.common.base.impl.BaseQueryRepositoryImpl;
import org.janine.jian.etm.member.role.api.MemberRoleApi;
import org.janine.jian.etm.member.role.domain.MemberRole;
import org.janine.jian.etm.member.role.service.MemberRoleService;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;



@Controller
public class MemberRoleCotrollor implements MemberRoleApi{
    @Autowired
	private MemberRoleService memberRoleService;
    @Autowired
    private BaseQueryRepositoryImpl<MemberRole, Serializable> baseQueryRepositoryImpl;
	
	public ResponseEntity<?> save(MemberRole memberRole) {
    	memberRoleService.save(memberRole);
    	return new ResponseEntity<MemberRole>(HttpStatus.OK);
	}
    
	public ResponseEntity<?> delete(MemberRole memberRole) {
		memberRoleService.delete(memberRole);
		return new ResponseEntity<MemberRole>(HttpStatus.OK);
	}
	
	public ResponseEntity<?> update(MemberRole memberRole) {
		memberRoleService.update(memberRole);
		return new ResponseEntity<MemberRole>(HttpStatus.OK);
	}
    
	public MemberRoleService getMemberRoleService() {
		return memberRoleService;
	}
	public void setMemberRoleService(MemberRoleService memberRoleService) {
		this.memberRoleService = memberRoleService;
	}
	public BaseQueryRepositoryImpl<MemberRole, Serializable> getBaseQueryRepositoryImpl() {
		return baseQueryRepositoryImpl;
	}
	public void setBaseQueryRepositoryImpl(
			BaseQueryRepositoryImpl<MemberRole, Serializable> baseQueryRepositoryImpl) {
		this.baseQueryRepositoryImpl = baseQueryRepositoryImpl;
	}

    
    
}
