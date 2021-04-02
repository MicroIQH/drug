package com.manage.drug;
/**
 * @author 杉子
 * @date 2021/4/2 19:43
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication

public class DrugApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrugApplication.class, args);
	}

}
