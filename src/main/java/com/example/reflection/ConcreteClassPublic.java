package com.example.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.HashMap;

import com.example.aop.business.Business;
import com.example.reflection.ConcreteClass.PublicInnerClass;

public class ConcreteClassPublic {
	
	Business bus=new Business();
	
	static{
	   Business	checkiFworking=new Business();
	   System.out.println(checkiFworking);
		
	}

	public static void main(String[] args) {
		Class<?> concreteClass = ConcreteClass.class;
		System.out.println(concreteClass);
		Class<?> concreteClass2 = new ConcreteClass(5).getClass();
		System.out.println(concreteClass2);

		Class<?> concreteClass3 = null;
		
		Class<?> innerClass=PublicInnerClass.class;

		try {
			concreteClass3 = Class.forName("com.example.reflection.ConcreteClass");
			System.out.println(concreteClass3);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Inside Concrete Class Public");
		
		System.out.println(concreteClass3.getCanonicalName());
		
		Class<?> booleanClass=boolean.class;
		
		System.out.println(booleanClass);
		System.out.println(booleanClass.getCanonicalName());
		
		Class doubleT=Double.TYPE;
		
		Class<?> cDoubleArray = null;
		
		try {
			cDoubleArray = Class.forName("[D");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*****************************************
		************
		Reflections on a Class
		***********
		*****************************************/
		System.out.println(" cDoubleArray :::"+cDoubleArray.getCanonicalName());
		
		System.out.println(" doubleT :::"+doubleT);
		
		Class<?> toString=String[][].class;

		System.out.println(" toString :::"+toString.getSuperclass());
		
		System.out.println(" concreteClass.getClasses() :::"+concreteClass.getClasses());
		
		System.out.println(" Arrays to string concreteClass.getClasses() :::"+ Arrays.toString(concreteClass.getClasses()));
		
		System.out.println(" Declared classes of a class :::"+ concreteClass.getDeclaredClasses());
		
		System.out.println(" Array to string Declared classes of a class :::"+ Arrays.toString(concreteClass.getDeclaredClasses()));
		
		System.out.println("inner class declaring classes "+ innerClass.getDeclaringClass());
		
		System.out.println("inner class enclosing classes "+ innerClass.getEnclosingClass().getName());
		
		System.out.println("inner class package name "+ innerClass.getPackage());
		
		System.out.println("inner class modifier "+ innerClass.getModifiers());
		
		TypeVariable<?>[] typeParams = HashMap.class.getTypeParameters();
		
		System.out.println("Hashmap type params"+Arrays.toString(typeParams));
		
		System.out.println("Interfaces of map class"+Arrays.toString(HashMap.class.getInterfaces()));
		
		System.out.println("Generic Interfaces of map class"+Arrays.toString(HashMap.class.getGenericInterfaces()));

		System.out.println("Public methods of a class"+ Arrays.toString(concreteClass.getMethods()));
		
		System.out.println("Public constructors of a class"+ Arrays.toString(concreteClass.getConstructors()));
		
		System.out.println("Public members of a class"+ Arrays.toString(concreteClass.getFields()));
		
		System.out.println("Get Annotations of a class"+ Arrays.toString(concreteClass.getAnnotations()));
		
		
		/*****************************************
		************
		Reflections on a Method
		***********
		*****************************************/
		
		
		// Reflections for a Public member variables
		
		Field field1=null;
		Field field2=null;
		Class fieldDefiningClass=null;
		try {
			field1 = concreteClass.getField("publicInt");
			
			field2=concreteClass.getField("defaultObject2");
			fieldDefiningClass=field1.getDeclaringClass();
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Field 1 in the class "+field1+"* in the class**"+fieldDefiningClass);
		
		System.out.println("field type is "+field1.getType());
		
		System.out.println("Canonical name of the field type is "+field2.getType().getCanonicalName());
		
		
		
		// Reflections for a private member variables
		
		
	}

}
