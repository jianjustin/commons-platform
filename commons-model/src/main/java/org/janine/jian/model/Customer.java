package org.janine.jian.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户实体
 * @author chenjianrui
 *
 */
@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
    @Column(name = "customer_id",columnDefinition = "int")
	private int customerId;
	
	@Column(name = "login_name",columnDefinition = "varchar")
	private String loginName;
	
	@Column(name = "password",columnDefinition = "varchar")
	private String password;
	
	@Column(name = "user_status",columnDefinition = "int")
	private int userStatus;
	
	@Column(name = "modified_time",columnDefinition = "datetime")
	private Date modifiedTime;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
