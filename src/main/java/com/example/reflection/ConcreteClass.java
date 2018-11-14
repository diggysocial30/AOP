package com.example.reflection;


@Deprecated
public class ConcreteClass extends BaseClass implements BaseInterface {
	
	
	public int publicInt;
	
	private String privateString="private String";
	
	protected boolean protectedBoolean;
	
	Object defaultObject;

	public Object defaultObject2;

	
	

	public ConcreteClass(int publicInt) {
		super();
		this.publicInt = publicInt;
	}

	@Override
	public void function1(int a) {
		System.out.println("******Inside com.example.reflection.ConcreteClass.function1(int)");

	}

	@Override
	public void function1(int a, int b) {
		System.out.println("******Inside com.example.reflection.ConcreteClass.function1(int, int)");

	}

	@Override
	public String function2(int a, int b) {
		// TODO Auto-generated method stub
		return null;
	}

	public class PublicInnerClass{}
	private class PrivateInnerClass{}
	protected class ProtectedInnerClass{}
	
	class DefaultInnerClass{}
	
	enum ConcreteClassDefaultEnum{}
	public enum ConcreteClassPublicEnum{}
	
	public interface ConcreteClassPublicInterface{}
}
