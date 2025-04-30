package day5Prac.에너테이션실습;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)   //메소드 전용
@Retention(RetentionPolicy.RUNTIME)
public @interface Before {
	String before() default "==========";
}
