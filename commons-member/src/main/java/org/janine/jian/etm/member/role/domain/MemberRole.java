package org.janine.jian.etm.member.role.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 描述：member_role模型
* @author tools
*/
@Entity
@Table(name="member_role")
public class MemberRole{
	
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
    @Column(name = "ROLE_CODE",columnDefinition = "varchar")
    private String roleCode;

    /**
    *
    */
    @Column(name = "MEMBER_ROLE_CODE",columnDefinition = "varchar")
    private String memberRoleCode;

    /**
    *
    */
    @Column(name = "MEMBER_ROLE_NAME",columnDefinition = "varchar")
    private String memberRoleName;

    /**
    *
    */
    @Column(name = "MEMBER_ROLE_TYPE",columnDefinition = "varchar")
    private String memberRoleType;

    /**
    *
    */
    @Column(name = "MEMBER_ROLE_LIST_ORDERBY",columnDefinition = "varchar")
    private String memberRoleListOrderby;

    /**
    *
    */
    @Column(name = "MEMBER_ROLE_PARENT_CODE",columnDefinition = "varchar")
    private String memberRoleParentCode;

    /**
    *
    */
    @Column(name = "MEMBER_ROLE_CREATE_DATE",columnDefinition = "datetime")
    private Date memberRoleCreateDate;


    public Long getpkId() {
        return this.pkId;
    }

    public void setpkId(Long pkId) {
        this.pkId = pkId;
    }

    public String getroleCode() {
        return this.roleCode;
    }

    public void setroleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getmemberRoleCode() {
        return this.memberRoleCode;
    }

    public void setmemberRoleCode(String memberRoleCode) {
        this.memberRoleCode = memberRoleCode;
    }

    public String getmemberRoleName() {
        return this.memberRoleName;
    }

    public void setmemberRoleName(String memberRoleName) {
        this.memberRoleName = memberRoleName;
    }

    public String getmemberRoleType() {
        return this.memberRoleType;
    }

    public void setmemberRoleType(String memberRoleType) {
        this.memberRoleType = memberRoleType;
    }

    public String getmemberRoleListOrderby() {
        return this.memberRoleListOrderby;
    }

    public void setmemberRoleListOrderby(String memberRoleListOrderby) {
        this.memberRoleListOrderby = memberRoleListOrderby;
    }

    public String getmemberRoleParentCode() {
        return this.memberRoleParentCode;
    }

    public void setmemberRoleParentCode(String memberRoleParentCode) {
        this.memberRoleParentCode = memberRoleParentCode;
    }

    public Date getmemberRoleCreateDate() {
        return this.memberRoleCreateDate;
    }

    public void setmemberRoleCreateDate(Date memberRoleCreateDate) {
        this.memberRoleCreateDate = memberRoleCreateDate;
    }

}