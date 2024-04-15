package com.newpack1;

public class class1 {

	public static void main(String[] args) {
		//take this As input Email
		String email = "onkar.123.hulwan@gmail.in"; //o****.***.*****@****.com
		//
		String reverse = "";
		String EncreptedEmail = "";
		for (int i = email.length() - 1; i >= 0; i--) {
			reverse = reverse + email.charAt(i);
		}
		System.out.println(reverse);
		reverse = reverse.substring(reverse.indexOf(reverse.charAt(0)), reverse.indexOf('.') + 1);
		String SecondReverseToOriginal = "";
		for (int i = reverse.length() - 1; i >= 0; i--) {
			SecondReverseToOriginal = SecondReverseToOriginal + reverse.charAt(i);
		}
		EncreptedEmail = EncreptedEmail + email.charAt(0);
		int indexOf = email.indexOf('.');
		if (email.contains("@")) {
			for (int i = 1; i < email.length() - SecondReverseToOriginal.length(); i++) {
				if (Character.isDigit(email.charAt(i)) || email.charAt(i) == '@')
					EncreptedEmail = EncreptedEmail + email.charAt(i);
				else
					EncreptedEmail = EncreptedEmail + "*";
			}
			System.out.println(EncreptedEmail = EncreptedEmail + SecondReverseToOriginal);
		} else
			System.out.println("not valid");
	}
}
