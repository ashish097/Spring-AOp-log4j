package com.aop.methods;

import org.springframework.aop.ThrowsAdvice;

public class ThrowException implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}
}