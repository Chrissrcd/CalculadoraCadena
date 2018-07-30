/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraCadena;

/**
 *
 * @author chris
 */
public class CalculadoraC {

    public static Integer add(String numbers) {
        Integer result = 0;
        numbers+=",";
        if (numbers.length() > 0) {
            String n = "";
            for (int i = 0; i < numbers.length(); i++) {
                if (numbers.charAt(i) == ',') {
                    result += Integer.parseInt(n);
                    n = "";
                } else {
                    n += numbers.charAt(i);
                }
            }
        }
        return result;
    }
}
