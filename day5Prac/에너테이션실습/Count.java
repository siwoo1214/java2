package day5Prac.에너테이션실습;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 사용자 정의 annotation
// @Target 
// 유지범위 @Retention (RetentionPolicy.RUNTIME)
// 기본 => RetentionPolicy.Class

@Retention(RetentionPolicy.RUNTIME)
public @interface Count {
	int value();  //value() => 에너테이션의 설정된 값 가져오기, 이름은 임의로 작성가능, value라는 이름을 사용하면 생략가능함
}
