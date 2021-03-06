package com.qy.po;

/**
 * @author leepon1990
 */
public class TChinaCity {

	private Integer iautoid;

	// 城市名
	private String sname;

	// 上级城市id
	private Integer iparentid;

	private Integer isort;

	private Byte istatus;

	private Integer icreatetime;

	private Integer iupdatetime;

	// getter and setter
	public Integer getIautoid() {
		return iautoid;
	}

	public void setIautoid(Integer iautoid) {
		this.iautoid = iautoid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname == null ? null : sname.trim();
	}

	public Integer getIparentid() {
		return iparentid;
	}

	public void setIparentid(Integer iparentid) {
		this.iparentid = iparentid;
	}

	public Integer getIsort() {
		return isort;
	}

	public void setIsort(Integer isort) {
		this.isort = isort;
	}

	public Byte getIstatus() {
		return istatus;
	}

	public void setIstatus(Byte istatus) {
		this.istatus = istatus;
	}

	public Integer getIcreatetime() {
		return icreatetime;
	}

	public void setIcreatetime(Integer icreatetime) {
		this.icreatetime = icreatetime;
	}

	public Integer getIupdatetime() {
		return iupdatetime;
	}

	public void setIupdatetime(Integer iupdatetime) {
		this.iupdatetime = iupdatetime;
	}
}