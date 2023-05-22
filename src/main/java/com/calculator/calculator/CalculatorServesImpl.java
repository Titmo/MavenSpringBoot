package com.calculator.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServesImpl implements CalculatorServes{
   @Override
    public String hello () {
        return "Добро пожаловать в калькулятор";
    }


    @Override
    public String plus(int num1, int num2) {
        return num1+"+"+num2+"="+(num1+num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return num1+"-"+num2+"="+(num1-num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return num1+"*"+num2+"="+(num1*num2);
    }

    @Override
    public String divide(int num1, int num2) {
        return num1+"/"+num2+"="+(num1/num2);
    }

}
