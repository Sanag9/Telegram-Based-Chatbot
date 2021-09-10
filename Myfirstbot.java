package uz.mobiler;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Location;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Myfirstbot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "Bupis_bot";
    }

    @Override
    public String getBotToken() {
        return "1808603849:AAHbc4pqpeLDuWAkIau5G5zco4uZACJLAAU";
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {
                String text = message.getText();

                if (text.equals("/start")) {
                    System.out.println("Got message!!");

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("welcome");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                    replyKeyboardMarkup.setResizeKeyboard(true);
                    replyKeyboardMarkup.setSelective(true);
                    List<KeyboardRow> KeyboardRowList = new ArrayList<>();
                    KeyboardRow keyboardRow1 = new KeyboardRow();
                    KeyboardButton keyboardButton1 = new KeyboardButton();
                    KeyboardButton keyboardButton2 = new KeyboardButton();
                    KeyboardButton keyboardButton3 = new KeyboardButton();
                    keyboardButton1.setText("hello");
                    keyboardButton2.setText("share contact");
                    keyboardButton2.setRequestContact(true);
                    keyboardButton3.setText("share location");
                    keyboardButton3.setRequestLocation(true);
                    keyboardRow1.add(keyboardButton1);
                    keyboardRow1.add(keyboardButton2);
                    keyboardRow1.add(keyboardButton3);
                    KeyboardRowList.add(keyboardRow1);
                    replyKeyboardMarkup.setKeyboard(KeyboardRowList);
                    sendMessage.setReplyMarkup(replyKeyboardMarkup);

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                } else if (text.equals("hello")) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("hello there");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                } else if(text.equals("How you doing") || text.equals("What's up")){
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("I'm fine ... how about you?");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                } else if(text.equals("What's your name?")){
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("I'm Bupis");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }else if(text.equals("Hey Bupis!..myself user")){
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("nice to meet you user");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                } else if(text.equals("you got any jokes Bupis?")){
                    SendMessage sendMessage = new SendMessage();
                    int rand = (int) (Math.random() * 3 +1);
                    if(rand == 1){
                        sendMessage.setText(" My old aunts would come and tease me at weddings, “Well Sarah? Do you think you’ll be next?”\n" +
                                "\n" +
                                "We settled this quickly once I started doing the same to them at funerals.");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                    }else if(rand == 2){
                        sendMessage.setText("How do you know the ocean greets you? -  It waves.\n");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                    }else if(rand == 1){
                        sendMessage.setText("I hate my mood swings. They're great!");
                        sendMessage.setParseMode(ParseMode.MARKDOWN);
                        sendMessage.setChatId(String.valueOf(message.getChatId()));
                    }
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));

                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }
                else if (text.equals("What is today's date?")) {
                   // String text = message.getText();
                    LocalDate date = LocalDate.now();
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("today's date is: " + date);
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                } else if(text.equals("can you play any songs Bupis?"))
                {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Ya sure...choose one:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList1 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList2 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList3 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList4 = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList5 = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton5 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("Stand up- From harriet" );
                    inlineKeyboardButton2.setText("Counting stars- OneRepublic");
                    inlineKeyboardButton3.setText("The call- Regina Spektor");
                    inlineKeyboardButton4.setText("Silhouette- Aquilo");
                    inlineKeyboardButton5.setText("You raise me up- Westlife");
                    inlineKeyboardButton1.setUrl("https://youtu.be/TNO40mDaOEY");
                    inlineKeyboardButton2.setUrl("https://youtu.be/hT_nvWreIhg");
                    inlineKeyboardButton3.setUrl("https://youtu.be/oNsQewlFtEs");
                    inlineKeyboardButton4.setUrl("https://youtu.be/tNl-uHEf5rY");
                    inlineKeyboardButton5.setUrl("https://youtu.be/wEpeTyazaKI");
                    inlineKeyboardButtonList1.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList2.add(inlineKeyboardButton2);
                    inlineKeyboardButtonList3.add(inlineKeyboardButton3);
                    inlineKeyboardButtonList4.add(inlineKeyboardButton4);
                    inlineKeyboardButtonList5.add(inlineKeyboardButton5);
                    inlineButtons.add(inlineKeyboardButtonList1);
                    inlineButtons.add(inlineKeyboardButtonList2);
                    inlineButtons.add(inlineKeyboardButtonList3);
                    inlineButtons.add(inlineKeyboardButtonList4);
                    inlineButtons.add(inlineKeyboardButtonList5);
                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if(text.equals("open browser")){

                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("here is the link!");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("google");
                    inlineKeyboardButton2.setText("brave");
                    inlineKeyboardButton1.setUrl("https://www.google.com/");
                    inlineKeyboardButton2.setUrl("https://brave.com/");
                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                } else if(text.equals("What is the weather like today?")) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Sure ... you can head to this website..");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("National Weather Service");
                    inlineKeyboardButton1.setUrl("https://www.weather.gov/");
                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }else if(text.equals("Great job Bupis...ttyl")) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Thanks.. see you later buddy :)");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }
                else if (text.equals("What time is it now?")) {
                    LocalTime time = LocalTime.now();
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("its: " + time);
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }

                }


                if (text.equals("hola")) {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setText("Select language:");
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    //InlineKeyboardButton
                    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
                    List<List<InlineKeyboardButton>> inlineButtons = new ArrayList<>();
                    List<InlineKeyboardButton> inlineKeyboardButtonList = new ArrayList<>();
                    InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
                    InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
                    inlineKeyboardButton1.setText("English");
                    inlineKeyboardButton2.setText("Spanish");
                    inlineKeyboardButton1.setCallbackData("inglés");
                    inlineKeyboardButton2.setCallbackData("español");
                    inlineKeyboardButtonList.add(inlineKeyboardButton1);
                    inlineKeyboardButtonList.add(inlineKeyboardButton2);
                    inlineButtons.add(inlineKeyboardButtonList);
                    inlineKeyboardMarkup.setKeyboard(inlineButtons);
                    sendMessage.setReplyMarkup(inlineKeyboardMarkup);
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                } } }else if (update.hasCallbackQuery()) {
                    Message message = update.getCallbackQuery().getMessage();
                    CallbackQuery callbackQuery = update.getCallbackQuery();
                    String data = callbackQuery.getData();
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setParseMode(ParseMode.MARKDOWN);
                    sendMessage.setChatId(String.valueOf(message.getChatId()));
                    {
                        if (data.equals("inglés")) {
                            sendMessage.setText("English language is selected!");
                        } else if (data.equals("française")) {
                            sendMessage.setText("Spanish language is selected!");
                        }
                    }
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
            }
        }




