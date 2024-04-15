package com.immutable_mutable.objects;

public class ImmutableMutableTest {
	public static void main(String[] args) {
		ImmutablePerson imp=new ImmutablePerson("aaaa", 10);
		imp.getAge();
		
		MutablePerson mp=new MutablePerson("ffff", 90);
		mp.setAge(77);
		int age = mp.getAge();
		System.out.println(age);
	}

}
