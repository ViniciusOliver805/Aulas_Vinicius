package com.neogedom.tutorialget.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SumModel {
    

     private Double firstNumber;
     private Double secondNumber;


     public Double getSum(){
        return  firstNumber + secondNumber;
      
     }
}