package com.ewflorencio.quizapp.controler;


import com.ewflorencio.quizapp.model.Question;
import com.ewflorencio.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionControler {

    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestion")
    public ResponseEntity<List<Question>> getAllQuestion(){
      return questionService.getAllQuestion();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getCategory(@PathVariable String category){
        return questionService.getCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

}
