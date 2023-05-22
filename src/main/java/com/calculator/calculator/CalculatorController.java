package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorServes calculatorServes;
    public CalculatorController(CalculatorServes calculatorServes) {
        this.calculatorServes = calculatorServes;
    }
    @GetMapping(path = "/calculator")
    public String hello() {
        return calculatorServes.hello();
    }
    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServes.plus(num1,num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServes.minus(num1,num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServes.multiply(num1,num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorServes.divide(num1,num2);
    }
}
