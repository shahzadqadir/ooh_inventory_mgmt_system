package com.shahzadqadir.store;

public class Main {
    public static void main(String[] args) {
        ClassicalCD classicalCD = new ClassicalCD("Blood Brothers", 5.1, 5);
        classicalCD.addPerformer("Strings");
        classicalCD.addPerformer("Vital Signs");
        classicalCD.addPerformer("Rahim Shah");
        classicalCD.addPerformer("Katy Perry");
        System.out.println("Total number of performers added: " + classicalCD.getPerformerCount());
        classicalCD.showPerformers();
    }
}
