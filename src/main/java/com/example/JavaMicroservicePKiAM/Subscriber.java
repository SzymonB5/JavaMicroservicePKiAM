package com.example.JavaMicroservicePKiAM;

public record Subscriber(
        String firstName,
        String lastName,
        String pesel,
        int[] services
) {
}
