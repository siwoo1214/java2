package day5Prac.에너테이션실습;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//애너테이션의 유지범위 : 실행
//기본은  => class
@Retention(RetentionPolicy.RUNTIME)
public @interface MAXLen {
	int length();    // @MAXLen(length=13)
}
