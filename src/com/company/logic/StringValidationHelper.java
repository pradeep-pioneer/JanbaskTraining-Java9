package com.company.logic;

/**
 * Created by prade on 8/5/2017.
 */
public class StringValidationHelper {

    public  static boolean ValidateForEmptyOrNull(String input){
        if(input==""||input==null)
            return false;
        return true;
    }
}
