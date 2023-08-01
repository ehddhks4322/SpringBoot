package com.example.first.dependency;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

//@Component
@Getter
//@NoArgsConstructor 기본생성자.
@RequiredArgsConstructor //final이 붙어있거나, @NonNull어노테이션이 붙어있는 필드나 객체만 생성자에 파라미터로 넣는다.
//@AllArgsConstructor 전체 필드를 요소로 갖는 생성자 생성
public class Coding {
	
	
	
	  //@Autowired 
	  //private Computer computer;//필드 주입 
	  //Computer computer = new  Computer();
	
	  //필드 주입시 편하게 주입할 수 있으나 순환참조(무한루프)시 오류가 발생하지 않기 때문에 StactOverflow가 발생한다.
	  //※ 순환참조 : A클래스가 B클래스의 Bean을 주입받고, B클래스가 A클래스의 Bean 주입받는 상황
	  //생성자 주입은 순환참조시 컴파일러가 인지 가능, 오류가 발생
	  //초기화 생성자를 사용하면 해당 객체에 final키워드를 붙힐 수 있다.
	  //생성자 주입시 의존성 주입이 되지 않으면 객체가 생성되지 않으므로  NullPointException을 사전에 방어
	  //부트는 생성자 주입을 기본적으로 권장한다.
	
	  private final Computer computer;
	  
//		@Autowired
//		public Coding(Computer computer) {
//			this.computer = computer;
//		}
	
	 
}
