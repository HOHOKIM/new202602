package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class BeanTest {

@Autowired
        @Qualifier("pizza")
Food food;



    @Test
    @DisplayName("Primary 와 Qualifier 우선 순위 확인")
    void test1(){
    food.eat();

    }
    //빈이 두가지 이상일때 빈의 이름이 아닌 받는 클래스의 이름을 호출
    // Primary 를 하면 찾을수있음
    //Qualifier 를 하면 찾을수있음 (우선순위 높음) 근데 주입받는곳에
    // 범용적 primary 지역적으로는 Qualifier

}
