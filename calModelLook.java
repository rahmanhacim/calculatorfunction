/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCalculator;

/**
 *
 * @author Rahman Hakim
 */
public class calModelLook {
    public long calculate(long number1, long number2, String operator) {
            switch (operator) {
                case "+":
                    return number1 + number2;
                case "-":
                    return number1 - number2;
                case "*":
                    return number1 * number2;
                case "/":
                    if (number1 == 0)
                        return 0;
                    else if
                         (number2 == 0)
                        return 0;
                    return number1 / number2;

        }

        System.out.println("Unknown operator On calculator- " + operator);
        System.out.println("Please try again");
        

        return 0;

    }
    
}
