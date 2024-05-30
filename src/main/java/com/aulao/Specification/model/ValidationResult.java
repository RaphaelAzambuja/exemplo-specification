package com.aulao.Specification.model;

public class ValidationResult {
    private boolean isValid;
    private String message;

    public ValidationResult(boolean isValid, String message) {
        this.isValid = isValid;
        this.message = message;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static ValidationResult valid() {
        return new ValidationResult(true, "");
    }

    public static ValidationResult invalid(String message) {
        return new ValidationResult(false, message);
    }
}
