package com.chinaway.tms.admin.model;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 部门bean
 * @author zhang
 *
 */
public class SysDept implements Serializable {
	
	private static final long serialVersionUID = -6994920823395414976L;
	
	private Integer id;//   主键	private String deptid;//   部门id	private String name;//   部门名称	private Integer pid;//   父id	private String levels;//   层级
	@JSONField(format="yyyy-MM-dd HH:mm:ss")	private java.util.Date createtime;//   创建时间	private String description;//   描述	private Integer sotid;//   排序号	private String state;//   节点状态，'open' 或 'closed'	private String isenable;//   是否可用状态
	private String customerid;//   自定义机构编号
	private String contact;//   联系人 
	private String address;//   地址
	private String tel;//    电话
	private String remark;//    备注
		public Integer getId() {	    return this.id;	}	public void setId(Integer id) {	    this.id=id;	}	public String getDeptid() {	    return this.deptid;	}	public void setDeptid(String deptid) {	    this.deptid=deptid;	}	public String getName() {	    return this.name;	}	public void setName(String name) {	    this.name=name;	}	public Integer getPid() {	    return this.pid;	}	public void setPid(Integer pid) {	    this.pid=pid;	}	public String getLevels() {	    return this.levels;	}	public void setLevels(String levels) {	    this.levels=levels;	}	public java.util.Date getCreatetime() {	    return this.createtime;	}	public void setCreatetime(java.util.Date createtime) {	    this.createtime=createtime;	}	public String getDescription() {	    return this.description;	}	public void setDescription(String description) {	    this.description=description;	}	public Integer getSotid() {	    return this.sotid;	}	public void setSotid(Integer sotid) {	    this.sotid=sotid;	}	public String getState() {	    return this.state;	}	public void setState(String state) {	    this.state=state;	}	public String getIsenable() {	    return this.isenable;	}	public void setIsenable(String isenable) {	    this.isenable=isenable;	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}