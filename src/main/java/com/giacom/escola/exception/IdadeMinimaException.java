package com.giacom.escola.exception;

public class IdadeMinimaException extends RuntimeException {
    public IdadeMinimaException() {
        super("You must be the minimum age specified in the course to be able to enroll.");
    }
}
