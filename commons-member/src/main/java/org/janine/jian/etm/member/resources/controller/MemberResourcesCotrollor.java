package org.janine.jian.etm.member.resources.controller;

import org.janine.jian.common.base.impl.BaseQueryRepositoryImpl;
import org.janine.jian.etm.member.resources.api.MemberResourcesApi;
import org.janine.jian.etm.member.resources.domain.MemberResources;
import org.janine.jian.etm.member.resources.service.MemberResourcesService;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;



@Controller
public class MemberResourcesCotrollor implements MemberResourcesApi{
    @Autowired
	private MemberResourcesService memberResourcesService;
    @Autowired
    private BaseQueryRepositoryImpl<MemberResources, Serializable> baseQueryRepositoryImpl;
	
	public ResponseEntity<?> save(MemberResources memberResources) {
    	memberResourcesService.save(memberResources);
    	return new ResponseEntity<MemberResources>(HttpStatus.OK);
	}
    
	public ResponseEntity<?> delete(MemberResources memberResources) {
		memberResourcesService.delete(memberResources);
		return new ResponseEntity<MemberResources>(HttpStatus.OK);
	}
	
	public ResponseEntity<?> update(MemberResources memberResources) {
		memberResourcesService.update(memberResources);
		return new ResponseEntity<MemberResources>(HttpStatus.OK);
	}
    
	public MemberResourcesService getMemberResourcesService() {
		return memberResourcesService;
	}
	public void setMemberResourcesService(MemberResourcesService memberResourcesService) {
		this.memberResourcesService = memberResourcesService;
	}
	public BaseQueryRepositoryImpl<MemberResources, Serializable> getBaseQueryRepositoryImpl() {
		return baseQueryRepositoryImpl;
	}
	public void setBaseQueryRepositoryImpl(
			BaseQueryRepositoryImpl<MemberResources, Serializable> baseQueryRepositoryImpl) {
		this.baseQueryRepositoryImpl = baseQueryRepositoryImpl;
	}

    
    
}
