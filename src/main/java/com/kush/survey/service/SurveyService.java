package com.kush.survey.service;

import com.kush.survey.entity.StudentSurvey;
import java.util.List;

public interface SurveyService {
    StudentSurvey createSurvey(StudentSurvey survey);
    List<StudentSurvey> getAllSurveys();
    StudentSurvey getSurveyById(Long id);
    StudentSurvey updateSurvey(Long id, StudentSurvey survey);
    void deleteSurvey(Long id);
}