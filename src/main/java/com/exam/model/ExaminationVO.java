package com.exam.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="examinationA")
public class ExaminationVO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="exam_id")
	private int examID;
	@Column(name="exam_name")
	private String examName;
	@Column(name="exam_url")
	private String examUrl;
	@Column(name="exam_score")
	private int examScore;
	@Column(name="max_score")
	private int maxScore;
	private String examDetails;

	@OneToMany(mappedBy="examVO" ,cascade = CascadeType.ALL,orphanRemoval = true)
	private List<ApplicantVO> applicantVO;
	public List<ApplicantVO> getApplicantVO() {
		return applicantVO;
	}
	public void setApplicantVO(List<ApplicantVO> applicantVO) {
		this.applicantVO = applicantVO;
	}
	public int getExamID() {
		return examID;
	}
	public void setExamID(int examID) {
		this.examID = examID;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getExamUrl() {
		return examUrl;
	}
	public void setExamUrl(String examUrl) {
		this.examUrl = examUrl;
	}
	public int getExamScore() {
		return examScore;
	}
	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}
	public int getMaxScore() {
		return maxScore;
	}
	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
	}
	public String getExamDetails() {
		return examDetails;
	}
	public void setExamDetails(String examDetails) {
		this.examDetails = examDetails;
	}
	
	
	
}
