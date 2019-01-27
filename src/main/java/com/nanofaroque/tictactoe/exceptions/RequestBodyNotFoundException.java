package com.nanofaroque.tictactoe.exceptions;

import org.springframework.util.StringUtils;

public class RequestBodyNotFoundException extends Exception {
    public RequestBodyNotFoundException(Class clazz, String param) {
        super(RequestBodyNotFoundException.generateMessage(clazz.getSimpleName(), param));
    }

    private static String generateMessage(String entity, String searchParams) {
        return StringUtils.capitalize(entity) +
                " was not found for parameters " +
                searchParams;
    }
}
