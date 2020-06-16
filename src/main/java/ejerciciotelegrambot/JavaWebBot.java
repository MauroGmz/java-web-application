package ejerciciotelegrambot;


import ejerciciotelegrambot.model.User;
import ejerciciotelegrambot.service.UserService;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.util.*;

public class JavaWebBot extends TelegramLongPollingBot {

    private UserService service;

    public JavaWebBot() {
    }

    @Override
    public void onUpdateReceived(Update update) {

        String myName = update.getMessage().getFrom().getFirstName();
        String myLastName = update.getMessage().getFrom().getLastName();
        String commands= update.getMessage().getText();

        if (commands.equals("/myname")) {
            setMessageForSend(update,"First name:\n" , myName);
        }

        if (commands.equals("/mylastname")) {
            setMessageForSend(update,"Last name:\n" , myLastName);
        }

        if (commands.equals("/myfullname")) {
            setMessageForSend(update,"User name:\n" , myName + " " + myLastName);
        }

        if(commands.equals("/saveuser")) {
            // The user is entered through the bot
            /*
            setMessageForSend(update,"Escriba el nombre del usuario:", "");
            String firstName= update.getMessage().getText();
            System.out.println(firstName);
            setMessageForSend(update,"Escriba el apellido del usuario:", "");
            String lastName= update.getMessage().getText();
            System.out.println(lastName);
            */
            System.out.println("Enter the user's first name: ");
            Scanner reader = new Scanner(System.in);
            String firstName = reader.next();
            setMessageForSend(update,"First name: ", firstName);
            System.out.println("Enter the user's last name: ");
            String lastName = reader.next();
            setMessageForSend(update,"Last name: ", lastName);
            User user = new User(firstName, lastName);
            service.saveUser(user);
            setMessageForSend(update,"User saved in the database! Name: ", firstName + " " + lastName);
        }

        if(commands.equals("/userslist")) {
            /*
            for (User user : service.findAllUsers()) {
                System.out.println(user.toString());
            }
             */
            String userslist = "User list: \n";
            for (User user : service.findAllUsers()) {
                System.out.println(user.toString());
                userslist += user.toString() + "\n";
            }
            setMessageForSend(update, userslist, "");
        }

        if(commands.equals("/findbyid")) {
            User user = service.findUserById(1);
            System.out.println(user.toString());
        }

        if(commands.equals("/findlastname")) {
            String testData = "Gómez";
            String userslist = "User list: \n";
            for (User user : service.findUserByLastName(testData)) {
                System.out.println(user.toString());
                userslist += user.toString() + "\n";
            }
            setMessageForSend(update, userslist, "");
        }
    }

    @Override
    public String getBotUsername() {
        return "javawebbot";
    }

    @Override
    public String getBotToken() {
        return "1220139443:AAF4zTvm8Onl7Vo5wjnTtaoscp6Vr9bNeGg";
    }

    public void setService(UserService service) {
        this.service = service;
    }

    public void setMessageForSend(Update update, String message, String data) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(message + data);
        sendMessage.setChatId(update.getMessage().getChatId());

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}
