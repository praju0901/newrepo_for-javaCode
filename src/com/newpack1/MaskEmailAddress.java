package com.newpack1;


public class MaskEmailAddress {

    public static String maskEmail(String email) {
        int indexOfAt = email.indexOf('@');
        if (indexOfAt == -1) {
            return "not valid"; // Invalid email format
        }

        int nameLength = email.substring(0, indexOfAt).length();
        int maskLength = 3; // You can adjust this to mask more or fewer characters

        StringBuilder maskedEmail = new StringBuilder();
        maskedEmail.append(email.charAt(0)); // First character remains unmasked

        for (int i = 1; i < maskLength; i++) {
            maskedEmail.append('*');
        }

        maskedEmail.append(email.substring(maskLength, indexOfAt));
        maskedEmail.append('@');

        // Mask the domain name (excluding TLD)
        int domainStart = indexOfAt + 1;
        int domainEnd = email.lastIndexOf('.');
        for (int i = domainStart; i < domainEnd; i++) {
            maskedEmail.append('*');
        }

        maskedEmail.append(email.substring(domainEnd));

        return maskedEmail.toString();
    }

    public static void main(String[] args) {
        String email = "onkar.123.hulwan@gmail.in";
        String maskedEmail = maskEmail(email);
        System.out.println(maskedEmail);
    }
}
