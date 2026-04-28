package com.todo.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.todo.backend.**.mapper") // 모든 모듈의 매퍼 패키지 자동 스캔
@EnableAsync // @Async 사용 (알림 비동기)
@EnableScheduling //마감일 임박 알림 스케줄러
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
