package org.example.multithreading;

class MyThread6 extends Thread {
    MessagePrinter printer;
    String message;

    MyThread6(MessagePrinter printer, String message) {
        this.printer = printer;
        this.message = message;
    }

    public void run() {
        printer.printMessage(message);
    }
}
