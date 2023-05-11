package org.example.Week4.Day17_230510;


import java.io.IOException;

public class HelloPrinter {
    Printer printer;

    public HelloPrinter(Printer printer) {
        this.printer = printer;
    }
    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n; i++) {
            printer.print(message);
        }
    }

    public static void main(String[] args) throws IOException {
//        HelloPrinter hp = new HelloPrinter(new ConsolePrinter());
        HelloPrinter hp = new HelloPrinter(new FilePrinter());
        hp.repeatMessage(3, "hello");
    }
}
