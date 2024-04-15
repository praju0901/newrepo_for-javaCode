package com.newpack1;

 interface MyFactory {
	 NewClass createInstance();
}

public class MyClassFactory implements MyFactory{
	   @Override
	    public NewClass createInstance() {
	        return new NewClass();// used to create Object Factories or Design Patterns:
	    }
	
}
