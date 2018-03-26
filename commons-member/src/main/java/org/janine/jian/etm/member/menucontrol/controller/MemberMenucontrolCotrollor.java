package org.janine.jian.etm.member.menucontrol.controller;

import org.janine.jian.common.base.impl.BaseQueryRepositoryImpl;
import org.janine.jian.etm.member.menucontrol.api.MemberMenucontrolApi;
import org.janine.jian.etm.member.menucontrol.domain.MemberMenucontrol;
import org.janine.jian.etm.member.menucontrol.service.MemberMenucontrolService;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;



@Controller
public class MemberMenucontrolCotrollor implements MemberMenucontrolApi{
    @Autowired
	private MemberMenucontrolService memberMenucontrolService;
    @Autowired
    private BaseQueryRepositoryImpl<MemberMenucontrol, Serializable> baseQueryRepositoryImpl;
	
	public ResponseEntity<?> save(MemberMenucontrol memberMenucontrol) {
    	memberMenucontrolService.save(memberMenucontrol);
    	return new ResponseEntity<MemberMenucontrol>(HttpStatus.OK);
	}
    
	public ResponseEntity<?> delete(MemberMenucontrol memberMenucontrol) {
		memberMenucontrolService.delete(memberMenucontrol);
		return new ResponseEntity<MemberMenucontrol>(HttpStatus.OK);
	}
	
	public ResponseEntity<?> update(MemberMenucontrol memberMenucontrol) {
		memberMenucontrolService.update(memberMenucontrol);
		return new ResponseEntity<MemberMenucontrol>(HttpStatus.OK);
	}
    
	public MemberMenucontrolService getMemberMenucontrolService() {
		return memberMenucontrolService;
	}
	public void setMemberMenucontrolService(MemberMenucontrolService memberMenucontrolService) {
		this.memberMenucontrolService = memberMenucontrolService;
	}
	public BaseQueryRepositoryImpl<MemberMenucontrol, Serializable> getBaseQueryRepositoryImpl() {
		return baseQueryRepositoryImpl;
	}
	public void setBaseQueryRepositoryImpl(
			BaseQueryRepositoryImpl<MemberMenucontrol, Serializable> baseQueryRepositoryImpl) {
		this.baseQueryRepositoryImpl = baseQueryRepositoryImpl;
	}

    
    
}
