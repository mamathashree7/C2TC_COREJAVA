package com.cg.Interface;

public interface Sayable {
	default void say() {
		System.out.println("hello ,this is default method");
	}
	void sayMore(String msg);

}
