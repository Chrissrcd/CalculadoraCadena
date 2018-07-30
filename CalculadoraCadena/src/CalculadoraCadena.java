/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class CalculadoraCadena {
    
    public static void main(String[] args) {
        
        System.out.println(add("1,40,25,60"));
        
    }

    public static int add(String numbers) {
        int result = 0;
        numbers+=',';
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
