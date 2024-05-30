package com.aulao.Specification.model;

public class EmailEspecification implements Specification<User> {
    @Override
    public ValidationResult isSatisfiedBy(User user) {
        if (user.getEmail() != null && user.getEmail().contains("@")) {
            return ValidationResult.valid();
        } else {
            return ValidationResult.invalid("Email is not valid.");
        }
    }
}
