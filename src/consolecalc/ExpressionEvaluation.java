/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolecalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author rui
 */
public class ExpressionEvaluation {

    public static void main(String[] args) throws IOException
    {
        String expression;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your expression: ");
        expression = br.readLine();
        Converter postfix = new Converter(expression); 
        Calculator calc = new Calculator(postfix.getPostfixAsList());
        BigDecimal result = calc.result();
        NumberFormat nf = new DecimalFormat("##.#####");
        System.out.println("Result: " +nf.format(result));
    }
    
}
