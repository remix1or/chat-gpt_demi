package com.salimov.demo;

import com.lilittlecat.chatgpt.offical.ChatGPT;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
        ChatGPT chatGPT = new ChatGPT("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");
        String hello = chatGPT.ask("");
        System.out.println(hello);
	}

}
