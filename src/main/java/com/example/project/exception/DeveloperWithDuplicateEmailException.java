package com.example.project.exception;

public class DeveloperWithDuplicateEmailException extends RuntimeException {

    public DeveloperWithDuplicateEmailException(String message) {
        super(message);
    }
}
