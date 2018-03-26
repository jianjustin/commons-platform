package org.janine.jian.etm.member.menucontrol.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 描述：member_menucontrol模型
* @author tools
*/
@Entity
@Table(name="member_menucontrol")
public class MemberMenucontrol{
	
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
    @Column(name = "MENUCONTROL_CODE",columnDefinition = "varchar")
    private String menucontrolCode;

    /**
    *
    */
    @Column(name = "MEMBER_MENUCONTROL_CODE",columnDefinition = "varchar")
    private String memberMenucontrolCode;

    /**
    *
    */
    @Column(name = "MEMBER_MENUCONTROL_RESOURCES_CODE",columnDefinition = "varchar")
    private String memberMenucontrolResourcesCode;

    /**
    *
    */
    @Column(name = "MEMBER_MENUCONTROL_ROLE_CODE",columnDefinition = "varchar")
    private String memberMenucontrolRoleCode;

    /**
    *
    */
    @Column(name = "MEMBER_MENUCONTROL_CREATE_DATE",columnDefinition = "datetime")
    private Date memberMenucontrolCreateDate;


    public Long getpkId() {
        return this.pkId;
    }

    public void setpkId(Long pkId) {
        this.pkId = pkId;
    }

    public String getmenucontrolCode() {
        return this.menucontrolCode;
    }

    public void setmenucontrolCode(String menucontrolCode) {
        this.menucontrolCode = menucontrolCode;
    }

    public String getmemberMenucontrolCode() {
        return this.memberMenucontrolCode;
    }

    public void setmemberMenucontrolCode(String memberMenucontrolCode) {
        this.memberMenucontrolCode = memberMenucontrolCode;
    }

    public String getmemberMenucontrolResourcesCode() {
        return this.memberMenucontrolResourcesCode;
    }

    public void setmemberMenucontrolResourcesCode(String memberMenucontrolResourcesCode) {
        this.memberMenucontrolResourcesCode = memberMenucontrolResourcesCode;
    }

    public String getmemberMenucontrolRoleCode() {
        return this.memberMenucontrolRoleCode;
    }

    public void setmemberMenucontrolRoleCode(String memberMenucontrolRoleCode) {
        this.memberMenucontrolRoleCode = memberMenucontrolRoleCode;
    }

    public Date getmemberMenucontrolCreateDate() {
        return this.memberMenucontrolCreateDate;
    }

    public void setmemberMenucontrolCreateDate(Date memberMenucontrolCreateDate) {
        this.memberMenucontrolCreateDate = memberMenucontrolCreateDate;
    }

}