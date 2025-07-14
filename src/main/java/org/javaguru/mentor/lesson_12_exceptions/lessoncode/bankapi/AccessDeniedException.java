package org.javaguru.mentor.lesson_12_exceptions.lessoncode.bankapi;

// Throwable - main exception class

// Exception - checked exception (need try {} catch {})

// RuntimeException - unchecked exception (not need try {} catch{})

class AccessDeniedException extends Throwable {

    private String notValidSecurityKey;
    private String errorMessage;

    public AccessDeniedException(String notValidSecurityKey,
                                 String errorMessage) {
        this.notValidSecurityKey = notValidSecurityKey;
        this.errorMessage = errorMessage;
    }

    public String getNotValidSecurityKey() {
        return notValidSecurityKey;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
