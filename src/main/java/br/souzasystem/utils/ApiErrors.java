package br.souzasystem.utils;

import lombok.Data;
import lombok.Getter;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

public class ApiErrors {

    @Getter
    private List<String> errors;
    @Getter
    private String message;
    @Getter
    private HttpStatusCode status;

    public ApiErrors(HttpStatusCode status, String message, String error) {
        super();
        this.status = status;
        this.message = message;
        this.errors = Arrays.asList(error);
    }

    public ApiErrors(HttpStatusCode status, String message, List<String> errors) {
        super();
        this.status = status;
        this.message = message;
        this.errors = errors;
    }
}
