package behavioral.mediator;


public class TextChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new SimpleUser(chat, "Admin");
        User user1 = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat, "User2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello I'm User1");
        admin.sendMessage("Hello User1, I'm Admin of this chat room");
    }
}
