package com.newpack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.regex.Pattern;

public class NewClass implements Cloneable{

	public void kk()
	{
		System.out.println("ok");
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		//object cloaning
//		NewClass obj1 = new NewClass();
//		NewClass obj2 = (NewClass) obj1.clone();
//		obj2.kk();//need to implenents clonable interface
//		it is used in prototype design Pattern.where object serve as prototypes for creating new instance.
//		this pattern is useful when the cost of creating a new object is high or when objects need tobe created dynamically at runtime
		
///////////////////////////////////////////////////////////////////		
		//2 deserialization-Assuming the object is serialized in a file named "object.ser"
//		FileInputStream fileIn = new FileInputStream("object.ser");
//		ObjectInputStream in = new ObjectInputStream(fileIn);
//		NewClass obj = (NewClass) in.readObject();
//		in.close();
		
		//3 using reflection
//		try {
//		    Class<?> clazz = Class.forName("NewClass");
//		    NewClass obj = (NewClass) clazz.newInstance();
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//		    e.printStackTrace();
//		}
		
		
//		4- Using Object Factories or Design Patterns:
//			public interface MyFactory {
//			    MyClass createInstance();
//			}
		
//
//			public class MyClassFactory implements MyFactory {
//			    @Override
//			    public MyClass createInstance() {
//			        return new MyClass();
//			    }
//			}
//			// Usage:
//			MyFactory factory = new MyClassFactory();
//			NewClass obj = factory.createInstance();
//		obj.kk();///working fine
		
//		5 Using Inner Classes or Anonymous Classes:
// Inner class example
//public class OuterClass {
//    class InnerClass {
//        // Class definition
//    }
//}
//
//// Usage:
//OuterClass outerObj = new OuterClass();
//OuterClass.InnerClass innerObj = outerObj.new InnerClass();
//
//// Anonymous class example
//Runnable runnable = new Runnable() {
//    @Override
//    public void run() {
//        // Runnable implementation
//    }
//};
//
//// Usage:
//Thread thread = new Thread(runnable);
//thread.start();
		
	}

}
