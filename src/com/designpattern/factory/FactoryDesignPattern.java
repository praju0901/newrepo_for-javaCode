package com.designpattern.factory;
@FunctionalInterface
interface Product{
	void operation();
}
class ProA implements Product{

	@Override
	public void operation() {
		System.out.println("product A");
	}
	
}
class ProB implements Product{

	@Override
	public void operation() {
		System.out.println("product B");
	}
	
}
class Factory{
	public static Product craateProduct(String type) {
		if("A".equals(type)) {
			return new ProA();
		}
		else if("B".equals(type)) {
			return new ProB();
		}
//		throw new IllegalArgumentException("Invalid type");
		return new Product() {
			
			@Override
			public void operation() {
				System.out.println("Invalid Type");
				
			}
		};
	}
}
public class FactoryDesignPattern {
	public static void main(String[] args) {
		Product craateProduct = Factory.craateProduct("Bc");
		craateProduct.operation();
	}
		
}
