package com.exam.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.exceptions.CustomException;
import com.exam.model.ApplicantVO;
import com.exam.model.ExaminationVO;
//import com.exam.repository.ApplicantRepository;
import com.exam.repository.ExamRepository;


@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamRepository examRepo;
	
	@Override
	public List<ExaminationVO> getExamDetailsById(int examID) {
		// TODO Auto-generated method stub
		Optional<ExaminationVO> examdetails=examRepo.findAllByExamID(examID);

		examdetails.orElseThrow(()->  new CustomException("No record found with this id"));
		List<ExaminationVO> examVO=new ArrayList<ExaminationVO>();
		examdetails.ifPresent(examVO::add);
		return examVO;
	}

	
	public static Predicate<ExaminationVO> isPassedExam() 
	{
	    return p ->Math.abs(( p.getExamScore()/p.getExamScore())*100)> 70;
	}
//	@Override
//	public ApplicantVO getApplicantDetails(String pan) {
//		// TODO Auto-generated method stub
//		
//		ApplicantVO applicantDetails=applicantRepo.findBypan(pan);
//		
//		return applicantDetails;
//	}
	
	public List<ExaminationVO> getAllQualifiedApplicantsWithID(int examID,
			Predicate<ExaminationVO> passed){
		
		List<ExaminationVO> examDetails=getExamDetailsById(examID);
		Stream<ExaminationVO> examStream=examDetails.stream();
		List<ExaminationVO> qualifiedApplicants=examStream.filter(passed).collect(Collectors.toList());
		
		
		return qualifiedApplicants;	
	}
	
	public List<ExaminationVO> getAllQualifiedApplicants(
			Predicate<ExaminationVO> passed){
		
		List<ExaminationVO> examDetails=examRepo.findAll();
		Stream<ExaminationVO> examStream=examDetails.stream();
		List<ExaminationVO> qualifiedApplicants=examStream.filter(passed).collect(Collectors.toList());
		
		
		return qualifiedApplicants;	
	}



	@Override
	public ExaminationVO saveExamDetails(ExaminationVO examinationVO) {
		// TODO Auto-generated method stub
		return examRepo.saveAndFlush(examinationVO);
	}

	
}
