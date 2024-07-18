package org.example.TelegramBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "";
    }

    @Override
    public String getBotToken() {
        return "";
    }

    @Override
    public void onUpdateReceived(Update update) {
        String chatId = update.getMessage().getChatId().toString();
        String text = update.getMessage().getText();

        if (text.equals("/coin")){
            System.out.println(" Rasm jo'natildi. ");
            SendPhoto sendPhoto = new SendPhoto();

            sendPhoto.setChatId(chatId);
            sendPhoto.setCaption("Start farming SMPL coins today! \uD83E\uDD11Simple App makes it easy for you to dip your toes into the world of cryptocurrencies. \uD83C\uDF1F");
            sendPhoto.setPhoto(new InputFile("https://en.wikipedia.org/wiki/File:George_Washington_bicentennial_quarter,_reverse.jpg"));
            sendPhoto.setParseMode("HTML");

            try {
                execute(sendPhoto);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
