package com.kush.survey.repository;

import com.kush.survey.entity.StudentSurvey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentSurveyRepository extends JpaRepository<StudentSurvey, Long> {
}