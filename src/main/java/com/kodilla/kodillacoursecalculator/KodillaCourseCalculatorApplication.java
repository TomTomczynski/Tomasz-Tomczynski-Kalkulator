package com.kodilla.kodillacoursecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseCalculatorApplication {

    public static class MyCalculator<overight> {
        private int number1=0;
        private int number2=0;
        public MyCalculator(){
        }

    public void setNumber1(int number){
            this.number1=number;
    }
    public void setNumber2(int number2){
        this.number2=number2;
    }
    @Override
    public String toString(){
            return "Number 1: "+ number1 + ", Number 2: " + number2;
    }
    }

    public static void main(String[] args) {
//        SpringApplication.run(KodillaCourseCalculatorApplication.class, args);

        MyCalculator theCalculator = new MyCalculator();
        theCalculator.setNumber1(10);
        theCalculator.setNumber2(15);

        System.out.println(theCalculator.toString());

    }

}
