package net.patterns.behavioral.mediator;

class ConcreteChatMediator implements ChatMediator {
    private Colleague colleague1;
    private Colleague colleague2;

    public void setColleague1(Colleague colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague colleague2) {
        this.colleague2 = colleague2;
    }

    public void sendMessage(String message, Colleague originator) {
        if (originator == colleague1) {
            colleague2.receiveMessage(message);
        } else {
            colleague1.receiveMessage(message);
        }
    }
}
