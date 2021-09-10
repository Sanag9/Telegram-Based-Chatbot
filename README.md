# Telegram-Based-Chatbot
Implemented a Telegram-based chatbot using java language and Telegram API.

A chatbot, as any other AI model, needs a lot of data for training and has the capability of learning by its past data available, for instance, a chatbot can learn from the dialogue history and give responses to the user considering the previous chat. Through this project the aim is to develop a Telegram-based chatbot using java. Telegram being one of the most useful instant messaging applications, also offers certain free API services like Telegram bot API, which we have utilized in this project. 

# ->Telegram bot API:
The bot API service allows developers to connect the bots to their respective systems. This would not require another phone number for the bot to work. The bot created is nothing but just an interface for the program/code that runs on your computer.

# ->Creating a bot account:
This can be achieved very easily by using the @botfather account which will allow us to create a bot, set a name to it and provide us with an authorization token which will be further used to gain access to Telegram API.

# ->Running a Telegram Chatbot:
  There are two methods to run a telegram chatbot:
  
  •	Long-polling:
    Under this method the chatbot can run directly on a computer, there is no need for an https server or a web hosting platform. With the long-polling method, the server has to       keep a check on the application every now and then. As soon as the messages start coming from the user’s side, the server will process those messages.
    
  •	Webhook:
    In order to run your chatbot through the aforementioned method, there is a requirement of an active https server or a web platform for hosting the bot. Unlike the long-polling     method, there is no need for the server to do a periodic check on the application. As soon as the messages start coming in from the user’s terminal, the Telegram API will keep     forwarding it to the server.

# In this project I have adapted Long-polling Method

# ->Functions of 'Bupis' bot:
Bupis have the capability of doing Following:

•	Bupis can initiate a basic meet and greet with the user.

•	It can offer the user with the options of selecting any other language to chat in.

•	Bupis offers Inlinekeyboard buttons.

•	Bupis consists of simple keyboard buttons.

•	Bupis can play songs on user’s demand.

•	It can entertain the user by cracking jokes.

•	It can lead the user to ‘National Weather service’ Web page for knowing the details about the weather.

•	It is capable of letting the user know about the current time.

•	It can let the user know about the current date.

•	It allows the user to share contact.

•	It allows the user to share the location.

# Designing of Bupis
•	Procedure of authorizing token

![image](https://user-images.githubusercontent.com/84476709/132821986-e3fc90d0-04d0-40e6-85c8-cfbec8b7c3a4.png)

# Creating buttons:
![image](https://user-images.githubusercontent.com/84476709/132822037-c85fbff1-403c-4b97-a871-bf2abeaed23f.png)

# Flow diagram of interacting with Bupis
![image](https://user-images.githubusercontent.com/84476709/132822624-f120c145-31bb-4473-b189-77b5acd1821f.png)



