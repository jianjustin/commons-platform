package org.janine.jian.etm.member.resources.service.impl;

import org.janine.jian.common.base.impl.BaseQueryRepositoryImpl;
import org.janine.jian.etm.member.resources.domain.MemberResources;
import org.janine.jian.etm.member.resources.repository.MemberResourcesRepository;
import org.janine.jian.etm.member.resources.service.MemberResourcesService;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberResourcesServiceImpl implements MemberResourcesService{
	@Autowired
	private MemberResourcesRepository memberResourcesRepository;
	@Autowired
	private BaseQueryRepositoryImpl<MemberResources, Serializable> baseQueryRepositoryImpl;
	
	public MemberResources save(MemberResources memberResources) {
		return memberResourcesRepository.save(memberResources);
	}
	
	public MemberResources update(MemberResources memberResources) {
		return memberResourcesRepository.save(memberResources);
	}

	public MemberResources delete(MemberResources memberResources) {
		memberResourcesRepository.delete(memberResources);
	    return memberResources;
	}
	
	public  List<MemberResources> queryAllByJPQL(String jpql, List<Object> paramValueList) {
		return baseQueryRepositoryImpl.queryAllByJPQL(jpql, paramValueList, MemberResources.class);
	}

	public List<Map<String, Object>> queryAllColumnByJPQL(String jpql,List<Object> paramValueList) {
		return baseQueryRepositoryImpl.queryAllColumnByJPQL(jpql, paramValueList, MemberResources.class);
	}

	public  List<MemberResources> queryAllBySQL(String sql, List<Object> paramValueList) {
		return baseQueryRepositoryImpl.queryAllBySQL(sql, paramValueList, MemberResources.class);
	}

	public List<Map<String, Object>> queryAllColumnBySQL(String sql,List<Object> paramValueList) {
		return baseQueryRepositoryImpl.queryAllColumnBySQL(sql, paramValueList, MemberResources.class);
	}
	

	public MemberResourcesRepository getMemberResourcesRepository() {
		return memberResourcesRepository;
	}
	public void setMemberResourcesRepository(MemberResourcesRepository memberResourcesRepository) {
		this.memberResourcesRepository = memberResourcesRepository;
	}
	public BaseQueryRepositoryImpl<MemberResources, Serializable> getBaseQueryRepositoryImpl() {
		return baseQueryRepositoryImpl;
	}
	public void setBaseQueryRepositoryImpl(BaseQueryRepositoryImpl<MemberResources, Serializable> baseQueryRepositoryImpl) {
		this.baseQueryRepositoryImpl = baseQueryRepositoryImpl;
	}
}
