package com.yfax.webapi.vo;

import java.io.Serializable;

/**
 * 收益记录
 * @author Minbo
 */
public class IncomeHisVo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String phoneId;
	private String taskId;
	private String logoUrl;
	private String taskName;
	private String incomeTime;
	private String income;
	private String createDate;
	private String updateDate;
	private int flag;	//1=加钱；2=扣钱
	private int channel;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getIncomeTime() {
		return incomeTime;
	}
	public void setIncomeTime(String incomeTime) {
		this.incomeTime = incomeTime;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
}