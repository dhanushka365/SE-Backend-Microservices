package com.service.student;

public record StudentUpdateRequest(
        String firstName,
        String lastName,
        String email
) {
}
