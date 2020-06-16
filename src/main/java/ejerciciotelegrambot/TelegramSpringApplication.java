package ejerciciotelegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;


@SpringBootApplication
public class TelegramSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelegramSpringApplication.class, args);

		ApiContextInitializer.init();
		/*
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
		try {
			telegramBotsApi.registerBot(new JavaWebBot());

		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
		*/

	}

}
