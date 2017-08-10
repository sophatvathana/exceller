package com.github.sophatvathana.exceller;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface MapObject {
	
	Type type();

	int start();
	
	int end() default 0;
	
	boolean zeroIfNull() default false;
	
	boolean ignoreAllZerosOrNullRows() default false;
}