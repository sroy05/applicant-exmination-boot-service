package com.exam.service;

import java.util.List;
import java.util.function.Predicate;

import com.exam.model.ApplicantVO;
import com.exam.model.ExaminationVO;



public interface ExamService {
	
   List<ExaminationVO> getExamDetailsById(int id);
   //ApplicantVO getApplicantDetails(String pan);
   List<ExaminationVO> getAllQualifiedApplicants(Predicate<ExaminationVO> examinationvo);
   List<ExaminationVO> getAllQualifiedApplicantsWithID(int id,Predicate<ExaminationVO> examinationvo);
   ExaminationVO saveExamDetails(ExaminationVO examinationVO);
}
