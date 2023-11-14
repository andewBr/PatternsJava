package net.patterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ConcreteChatMediator chatMediator = new ConcreteChatMediator();

        ConcreteColleague colleague1 = new ConcreteColleague(chatMediator, "Colleague1");
        ConcreteColleague colleague2 = new ConcreteColleague(chatMediator, "Colleague2");

        chatMediator.setColleague1(colleague1);
        chatMediator.setColleague2(colleague2);

        colleague1.sendMessage("Hello, how are you?");
        colleague2.sendMessage("Hi! I'm good, thank you.");
    }
}
