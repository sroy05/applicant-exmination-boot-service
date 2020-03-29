//
//package com.exam.repository;
//
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.exam.model.ApplicantVO;
//import com.exam.model.ExaminationVO;
//
//
//
//public interface ApplicantRepository
//extends JpaRepository<ApplicantVO, String> {
//
//	@Query("select applicantVO from ApplicantVO e where applicantVO.pan= :pan")
//	ApplicantVO  findBypan(@Param("pan")String pan);
//
//	
//
//	
//	
//}
