package org.janine.jian.etm.member.user.controller;

import org.janine.jian.common.base.impl.BaseQueryRepositoryImpl;
import org.janine.jian.etm.member.user.api.MemberUserApi;
import org.janine.jian.etm.member.user.domain.MemberUser;
import org.janine.jian.etm.member.user.service.MemberUserService;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;



@Controller
public class MemberUserCotrollor implements MemberUserApi{
    @Autowired
	private MemberUserService memberUserService;
    @Autowired
    private BaseQueryRepositoryImpl<MemberUser, Serializable> baseQueryRepositoryImpl;
	
	public ResponseEntity<?> save(MemberUser memberUser) {
    	memberUserService.save(memberUser);
    	return new ResponseEntity<MemberUser>(HttpStatus.OK);
	}
    
	public ResponseEntity<?> delete(MemberUser memberUser) {
		memberUserService.delete(memberUser);
		return new ResponseEntity<MemberUser>(HttpStatus.OK);
	}
	
	public ResponseEntity<?> update(MemberUser memberUser) {
		memberUserService.update(memberUser);
		return new ResponseEntity<MemberUser>(HttpStatus.OK);
	}
    
	public MemberUserService getMemberUserService() {
		return memberUserService;
	}
	public void setMemberUserService(MemberUserService memberUserService) {
		this.memberUserService = memberUserService;
	}
	public BaseQueryRepositoryImpl<MemberUser, Serializable> getBaseQueryRepositoryImpl() {
		return baseQueryRepositoryImpl;
	}
	public void setBaseQueryRepositoryImpl(
			BaseQueryRepositoryImpl<MemberUser, Serializable> baseQueryRepositoryImpl) {
		this.baseQueryRepositoryImpl = baseQueryRepositoryImpl;
	}

    
    
}
