package com.patterns.observer;

import java.util.Observable;
import java.util.Observer;

class ObserverApplication {

    public static void main(String[] args) {
        customExample();
        System.out.println();
        javaExample();
    }

    static void customExample() {
        final var subject = new MessageStream();

        final var phoneClient = new PhoneClient(subject);
        final var tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a new message!");
        tabletClient.addMessage("Another new message!");
    }

    static void javaExample() {
        final var messageStream = new TwitterStream();
        final var client1 = new Client("Bryan");
        final var client2 = new Client("Mark");

        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someoneTweeted();
    }
}

// concrete subject
class TwitterStream extends Observable {
    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}

//concrete observer
class Client implements Observer {
    private String name;

    Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream, someone tweeted something.");
    }
}
