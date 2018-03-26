package org.janine.jian.etm.member.resources.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 描述：member_resources模型
* @author tools
*/
@Entity
@Table(name="member_resources")
public class MemberResources{
	
    /**
    *
    */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
    @Column(name = "PK_ID",columnDefinition = "bigint")
    private Long pkId;

    /**
    *
    */
    @Column(name = "RESOURCES_CODE",columnDefinition = "varchar")
    private String resourcesCode;

    /**
    *
    */
    @Column(name = "MEMBER_RESOURCES_CODE",columnDefinition = "varchar")
    private String memberResourcesCode;

    /**
    *
    */
    @Column(name = "MEMBER_RESOURCES_NAME",columnDefinition = "varchar")
    private String memberResourcesName;

    /**
    *
    */
    @Column(name = "MEMBER_RESOURCES_ROUTER",columnDefinition = "varchar")
    private String memberResourcesRouter;

    /**
    *
    */
    @Column(name = "MEMBER_RESOURCES_TYPE",columnDefinition = "varchar")
    private String memberResourcesType;

    /**
    *
    */
    @Column(name = "MEMBER_RESOURCES_CREATE_DATE",columnDefinition = "datetime")
    private Date memberResourcesCreateDate;


    public Long getpkId() {
        return this.pkId;
    }

    public void setpkId(Long pkId) {
        this.pkId = pkId;
    }

    public String getresourcesCode() {
        return this.resourcesCode;
    }

    public void setresourcesCode(String resourcesCode) {
        this.resourcesCode = resourcesCode;
    }

    public String getmemberResourcesCode() {
        return this.memberResourcesCode;
    }

    public void setmemberResourcesCode(String memberResourcesCode) {
        this.memberResourcesCode = memberResourcesCode;
    }

    public String getmemberResourcesName() {
        return this.memberResourcesName;
    }

    public void setmemberResourcesName(String memberResourcesName) {
        this.memberResourcesName = memberResourcesName;
    }

    public String getmemberResourcesRouter() {
        return this.memberResourcesRouter;
    }

    public void setmemberResourcesRouter(String memberResourcesRouter) {
        this.memberResourcesRouter = memberResourcesRouter;
    }

    public String getmemberResourcesType() {
        return this.memberResourcesType;
    }

    public void setmemberResourcesType(String memberResourcesType) {
        this.memberResourcesType = memberResourcesType;
    }

    public Date getmemberResourcesCreateDate() {
        return this.memberResourcesCreateDate;
    }

    public void setmemberResourcesCreateDate(Date memberResourcesCreateDate) {
        this.memberResourcesCreateDate = memberResourcesCreateDate;
    }

}