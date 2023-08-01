package com.example.first.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("desktop") @Primary//내가 주입을 요청했을 때 qualifier를 적지 않는다면 default값으로 이 객체를 요청하겠다.
public class DeskTop implements Computer{

	@Override
	public String getScreenWidth() {
		
		return "1920";
	}
	
}
