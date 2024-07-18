package org.example.Lesson;

public class Test {
    public static void main(String[] args) {
        String s = "Java dasturlash tili";
        String[] words = s.split(" ");
        String lastWord = words[words.length - 1];
        System.out.println("Oxirgi so'zning uzunligi: " + lastWord.length());
    }
}

