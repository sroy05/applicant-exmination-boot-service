package com.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="applicant")
public class ApplicantVO {
	@Id
	private  String pan;
	@Column
	private String name;
	@Column
	private String email;
	@Column(name="phone_no")
	private String phoneNo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="exam_id")
	private ExaminationVO examVO;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public   void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public final void setPan(String pan) {
		this.pan = pan;
	}
	public String getPan() {
		return pan;
	}
	public ExaminationVO getExamVO() {
		return examVO;
	}
	public void setExamVO(ExaminationVO examVO) {
		this.examVO = examVO;
	}
	
	

}
