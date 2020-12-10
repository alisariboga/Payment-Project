package com.payroll.LittleProject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/student")
    public void addName (@RequestBody StudentDTO studentDTO) {
        System.out.println(studentDTO);

    }

}

/*Obje yolla student
sout ile yazdiran bir endpoint
Sadece JSON objesi kabul etsin.



*/
