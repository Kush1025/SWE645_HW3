package com.kush.survey.service;

import com.kush.survey.entity.StudentSurvey;
import com.kush.survey.repository.StudentSurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyServiceImpl implements SurveyService {

    @Autowired
    private StudentSurveyRepository repository;

    @Override
    public StudentSurvey createSurvey(StudentSurvey survey) {
        return repository.save(survey);
    }

    @Override
    public List<StudentSurvey> getAllSurveys() {
        return repository.findAll();
    }

    @Override
    public StudentSurvey getSurveyById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public StudentSurvey updateSurvey(Long id, StudentSurvey survey) {
        //survey.setId(id);
        return repository.save(survey);
    }

    @Override
    public void deleteSurvey(Long id) {
        repository.deleteById(id);
    }
}