package org.janine.jian.etm.member.resources.repository;

import java.io.Serializable;
import org.janine.jian.common.base.BaseMotifyRepository;
import org.janine.jian.etm.member.resources.domain.MemberResources;
import org.springframework.stereotype.Repository;

/********************************************
 * 实体操作接口
 * @author janine
 * @since 2017-12-12
 *********************************************/
@Repository
public interface MemberResourcesRepository extends BaseMotifyRepository<MemberResources, Serializable>{

	
}
