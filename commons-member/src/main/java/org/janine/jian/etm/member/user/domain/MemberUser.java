package org.janine.jian.etm.member.user.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 描述：member_user模型
* @author tools
*/
@Entity
@Table(name="member_user")
public class MemberUser{
	
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
    @Column(name = "MEMBER_USER_CODE",columnDefinition = "varchar")
    private String memberUserCode;

    /**
    *
    */
    @Column(name = "MEMBER_USER_NAME",columnDefinition = "varchar")
    private String memberUserName;

    /**
    *
    */
    @Column(name = "MEMBER_USER_ACCOUNT",columnDefinition = "varchar")
    private String memberUserAccount;

    /**
    *
    */
    @Column(name = "MEMBER_USER_PHONE",columnDefinition = "varchar")
    private String memberUserPhone;

    /**
    *
    */
    @Column(name = "MEMBER_USER_EMAIL",columnDefinition = "varchar")
    private String memberUserEmail;

    /**
    *
    */
    @Column(name = "MEMBER_USER_PASSWORD",columnDefinition = "varchar")
    private String memberUserPassword;

    /**
    *
    */
    @Column(name = "MEMBER_USER_TOKENID",columnDefinition = "varchar")
    private String memberUserTokenid;

    /**
    *
    */
    @Column(name = "MEMBER_USER_LAST_DATE",columnDefinition = "datetime")
    private Date memberUserLastDate;

    /**
    *
    */
    @Column(name = "MEMBER_USER_ROLE_CODE",columnDefinition = "varchar")
    private String memberUserRoleCode;

    /**
    *
    */
    @Column(name = "MEMBER_USER_LIST_ORDER",columnDefinition = "varchar")
    private String memberUserListOrder;


    public Long getpkId() {
        return this.pkId;
    }

    public void setpkId(Long pkId) {
        this.pkId = pkId;
    }

    public String getmemberUserCode() {
        return this.memberUserCode;
    }

    public void setmemberUserCode(String memberUserCode) {
        this.memberUserCode = memberUserCode;
    }

    public String getmemberUserName() {
        return this.memberUserName;
    }

    public void setmemberUserName(String memberUserName) {
        this.memberUserName = memberUserName;
    }

    public String getmemberUserAccount() {
        return this.memberUserAccount;
    }

    public void setmemberUserAccount(String memberUserAccount) {
        this.memberUserAccount = memberUserAccount;
    }

    public String getmemberUserPhone() {
        return this.memberUserPhone;
    }

    public void setmemberUserPhone(String memberUserPhone) {
        this.memberUserPhone = memberUserPhone;
    }

    public String getmemberUserEmail() {
        return this.memberUserEmail;
    }

    public void setmemberUserEmail(String memberUserEmail) {
        this.memberUserEmail = memberUserEmail;
    }

    public String getmemberUserPassword() {
        return this.memberUserPassword;
    }

    public void setmemberUserPassword(String memberUserPassword) {
        this.memberUserPassword = memberUserPassword;
    }

    public String getmemberUserTokenid() {
        return this.memberUserTokenid;
    }

    public void setmemberUserTokenid(String memberUserTokenid) {
        this.memberUserTokenid = memberUserTokenid;
    }

    public Date getmemberUserLastDate() {
        return this.memberUserLastDate;
    }

    public void setmemberUserLastDate(Date memberUserLastDate) {
        this.memberUserLastDate = memberUserLastDate;
    }

    public String getmemberUserRoleCode() {
        return this.memberUserRoleCode;
    }

    public void setmemberUserRoleCode(String memberUserRoleCode) {
        this.memberUserRoleCode = memberUserRoleCode;
    }

    public String getmemberUserListOrder() {
        return this.memberUserListOrder;
    }

    public void setmemberUserListOrder(String memberUserListOrder) {
        this.memberUserListOrder = memberUserListOrder;
    }

}