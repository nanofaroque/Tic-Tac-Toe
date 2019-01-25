package com.nanofaroque.tictactoe.exceptions;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class ApiValidationError extends ApiSubError {
    @Getter
    @Setter
    private String object;
    @Getter
    @Setter
    private String field;
    @Getter
    @Setter
    private Object rejectedValue;
    @Getter
    @Setter
    private String message;

    ApiValidationError(String object, String message) {
        this.object = object;
        this.message = message;
    }
}
