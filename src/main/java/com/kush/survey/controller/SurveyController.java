package com.kush.survey.controller;

import com.kush.survey.entity.StudentSurvey;
import com.kush.survey.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/surveys")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @PostMapping
    public ResponseEntity<StudentSurvey> createSurvey(@RequestBody StudentSurvey survey) {
        return new ResponseEntity<>(surveyService.createSurvey(survey), HttpStatus.CREATED);
    }

    @GetMapping
    public List<StudentSurvey> getAllSurveys() {
        return surveyService.getAllSurveys();
    }

    @GetMapping("/{id}")
    public StudentSurvey getSurvey(@PathVariable Long id) {
        return surveyService.getSurveyById(id);
    }

    @PutMapping("/{id}")
    public StudentSurvey updateSurvey(@PathVariable Long id, @RequestBody StudentSurvey survey) {
        return surveyService.updateSurvey(id, survey);
    }

    @DeleteMapping("/{id}")
    public void deleteSurvey(@PathVariable Long id) {
        surveyService.deleteSurvey(id);
    }
}