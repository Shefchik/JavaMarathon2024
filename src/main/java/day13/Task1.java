package day13;

public class Task1 {
    public static void main(String[] args){
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");
        user1.sendMessage(user2, "Hi!");

        user1.sendMessage(user2, "How are you?");
        user2.sendMessage(user1, "Hi!");
        user2.sendMessage(user1, "Me good, I hope you too");
        user2.sendMessage(user1, "Let me know when you have time, wanna talk to ya");
        user3.sendMessage(user1, "Hi!");
        user3.sendMessage(user1, "Do you know where the user2 is?");
        user3.sendMessage(user1, "I need him, cannot get him either on the phone or by texting though");
        user1.sendMessage(user3, "I have just got a message from him");
        user1.sendMessage(user3, "He is fine, wee need to meet all together");
        user1.sendMessage(user3, "This Friday?");
        user3.sendMessage(user1, "yep, works for me, ask user2 if he joins us");

        MessageDatabase.showDialog(user1, user2);
    }
}

/*
*
В методе main() этого класса необходимо создать трех пользователей.
Затем необходимо:
Отправить 2 сообщения от пользователя 1 пользователю 2
Отправить 3 сообщения от пользователя 2 пользователю 1
Отправить 3 сообщения от пользователя 3 пользователю 1
Отправить 3 сообщения от пользователя 1 пользователю 3
Отправить 1 сообщение от пользователя 3 пользователю 1

* */
