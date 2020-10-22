package com.patterns.command;

// Invoker
class Switch {
    void storeAndExecute(Command command) {
        command.execute();
    }
}
