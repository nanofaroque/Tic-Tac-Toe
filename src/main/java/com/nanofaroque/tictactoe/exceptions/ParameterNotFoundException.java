package com.nanofaroque.tictactoe.exceptions;

import org.springframework.util.StringUtils;

import java.util.Map;

public class ParameterNotFoundException extends Exception {
    public ParameterNotFoundException(Class clazz, String param) {
        super(ParameterNotFoundException.generateMessage(clazz.getSimpleName(),param));
    }

    private static String generateMessage(String entity,String searchParams) {
        return StringUtils.capitalize(entity) +
                " was not found for parameters " +
                searchParams;
    }

}
