package demo;

import editor.Editor;
import listeners.EmailNotificationListener;
import listeners.LogOpenListener;
import listeners.PhoneNotificationListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        editor.events.subscribe("save", new PhoneNotificationListener("0982000883"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}