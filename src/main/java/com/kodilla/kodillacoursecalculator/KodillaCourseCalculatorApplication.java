package com.kodilla.kodillacoursecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseCalculatorApplication {

    public static class Calculator{
        private int number=0;
        private int number2=0;
        public Calculator( ){

        }
    public void setNumber(int number){
            this.number=number;
    }
    public void setNumber2(int number2){
        this.number2=number2;
    }

    }

    public static void main(String[] args) {
//        SpringApplication.run(KodillaCourseCalculatorApplication.class, args);

        Calculator theCalculator = new Calculator();
        theCalculator.setNumber(10);
        theCalculator.setNumber2(15);

    }

}
