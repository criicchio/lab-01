package pcd.lab01.ex01;

import org.fusesource.jansi.Ansi;

import static pcd.lab01.ex01.AuxLib.getWordsPos;

public class TestAsyncScreen {

    public static void main(String[] args) {
        var sentence = "This is a simple sentence with words ready to fall";

        Screen screen = Screen.getInstance();
        screen.clear();

        screen.writeStringAt(0, 10, Ansi.Color.RED, sentence);
        //TODO
//        var wordList = getWordsPos(sentence);

//        for (var wp: wordList) {
//            System.out.println("Word: " + wp.word() + " -- Pos: " + wp.pos());
//        }

//        Screen screen = Screen.getInstance();
//        screen.clear();
//
//        var x0 = 1;
//        var y0 = 10;
//
//        for (int i = 1; i < 80; i++) {
//            screen.writeStringAt(y0, x0 + i, Ansi.Color.RED, "Hello");
//            try {
//                Thread.sleep(100);
//            } catch (Exception ex) {
//            }
//            screen.writeStringAt(y0, x0 + i, Ansi.Color.BLACK, "Hello");
//        }
    }
}
