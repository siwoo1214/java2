package day5Prac.에너테이션실습;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MaxSuger {
	int value();
}
