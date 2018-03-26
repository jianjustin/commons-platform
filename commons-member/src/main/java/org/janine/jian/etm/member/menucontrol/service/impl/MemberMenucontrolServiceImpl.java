package org.janine.jian.etm.member.menucontrol.service.impl;

import org.janine.jian.common.base.impl.BaseQueryRepositoryImpl;
import org.janine.jian.etm.member.menucontrol.domain.MemberMenucontrol;
import org.janine.jian.etm.member.menucontrol.repository.MemberMenucontrolRepository;
import org.janine.jian.etm.member.menucontrol.service.MemberMenucontrolService;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberMenucontrolServiceImpl implements MemberMenucontrolService{
	@Autowired
	private MemberMenucontrolRepository memberMenucontrolRepository;
	@Autowired
	private BaseQueryRepositoryImpl<MemberMenucontrol, Serializable> baseQueryRepositoryImpl;
	
	public MemberMenucontrol save(MemberMenucontrol memberMenucontrol) {
		return memberMenucontrolRepository.save(memberMenucontrol);
	}
	
	public MemberMenucontrol update(MemberMenucontrol memberMenucontrol) {
		return memberMenucontrolRepository.save(memberMenucontrol);
	}

	public MemberMenucontrol delete(MemberMenucontrol memberMenucontrol) {
		memberMenucontrolRepository.delete(memberMenucontrol);
	    return memberMenucontrol;
	}
	
	public  List<MemberMenucontrol> queryAllByJPQL(String jpql, List<Object> paramValueList) {
		return baseQueryRepositoryImpl.queryAllByJPQL(jpql, paramValueList, MemberMenucontrol.class);
	}

	public List<Map<String, Object>> queryAllColumnByJPQL(String jpql,List<Object> paramValueList) {
		return baseQueryRepositoryImpl.queryAllColumnByJPQL(jpql, paramValueList, MemberMenucontrol.class);
	}

	public  List<MemberMenucontrol> queryAllBySQL(String sql, List<Object> paramValueList) {
		return baseQueryRepositoryImpl.queryAllBySQL(sql, paramValueList, MemberMenucontrol.class);
	}

	public List<Map<String, Object>> queryAllColumnBySQL(String sql,List<Object> paramValueList) {
		return baseQueryRepositoryImpl.queryAllColumnBySQL(sql, paramValueList, MemberMenucontrol.class);
	}
	

	public MemberMenucontrolRepository getMemberMenucontrolRepository() {
		return memberMenucontrolRepository;
	}
	public void setMemberMenucontrolRepository(MemberMenucontrolRepository memberMenucontrolRepository) {
		this.memberMenucontrolRepository = memberMenucontrolRepository;
	}
	public BaseQueryRepositoryImpl<MemberMenucontrol, Serializable> getBaseQueryRepositoryImpl() {
		return baseQueryRepositoryImpl;
	}
	public void setBaseQueryRepositoryImpl(BaseQueryRepositoryImpl<MemberMenucontrol, Serializable> baseQueryRepositoryImpl) {
		this.baseQueryRepositoryImpl = baseQueryRepositoryImpl;
	}
}
