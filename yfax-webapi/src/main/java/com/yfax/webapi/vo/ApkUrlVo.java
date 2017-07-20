package com.yfax.webapi.vo;

import java.io.Serializable;

/**
 * 分享APK下载链接配置
 * @author Minbo
 */
public class ApkUrlVo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String appName;
	private String apkUrl;
	private String createDate;
	private String updateDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getApkUrl() {
		return apkUrl;
	}
	public void setApkUrl(String apkUrl) {
		this.apkUrl = apkUrl;
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
}
