package com.shinhan.day12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})	//이 Annotation을 메서드에서 사용하겠다.
@Retention(RetentionPolicy.RUNTIME) //유지정책 : 실행 시 사용
public @interface PrintAnnotation {
   String value() default "-";
   int number() default  7;
   String myname() default "eun";
}
