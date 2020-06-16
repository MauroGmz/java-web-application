package ejerciciotelegrambot.config;


import ejerciciotelegrambot.JavaWebBot;
import ejerciciotelegrambot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

@Configuration
public class BotConfig {

    @Autowired
    UserService service;

    private JavaWebBot bot;

    private boolean contextStarted = false;

    @Bean
    public JavaWebBot bot() throws TelegramApiRequestException {
        onContextInitialized();
        return bot;
    }

    @Bean
    public JavaWebBot telegramBot() throws TelegramApiRequestException {
        onContextInitialized();
        return bot;
    }

    private void onContextInitialized() throws TelegramApiRequestException {
        if (!contextStarted) {
            ApiContextInitializer.init();
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
            try {
                bot = new JavaWebBot();
                telegramBotsApi.registerBot(bot);
                bot.setService(service);
            }
            catch (TelegramApiException e) {
                e.printStackTrace();
            }
            contextStarted = true;
        }
    }

}
