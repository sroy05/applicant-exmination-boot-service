package com.exam.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.exam.model.ApplicantVO;
import com.exam.model.ExaminationVO;



public interface ExamRepository
extends JpaRepository<ExaminationVO, Integer> {

//	@Query("select e.applicantVO from ExaminationVO e where e.applicantVO.pan= :pan")
//	ApplicantVO  findBypan(@Param("pan")String pan);

	Optional<ExaminationVO> findAllByExamID(int examID);

	
	
}
