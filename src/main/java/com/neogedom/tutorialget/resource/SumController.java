package com.neogedom.tutorialget.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neogedom.tutorialget.model.SumModel;



@RestController
@RequestMapping(value = "/sum")

public class SumController {
    
    @GetMapping("/{n1}/{n2}")
    public ResponseEntity<Double> add(@PathVariable("n1") Double n1, @PathVariable("n2") Double n2) {
        SumModel new_sum = new SumModel(n1, n2);
        return ResponseEntity.ok(new_sum.getSum());
    }
}



    


