package com.main.third;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String key = scanner.nextLine();

        if (key.equalsIgnoreCase("key")) {
            var pro = new ProDocumentWorker();
            saveToFile(pro);
        } else if (key.equalsIgnoreCase("exp")) {
            var exp = new ExpertDocumentWorker();
            saveToFile(exp);
        } else {
            var docWorker = new DocumentWorker();
            docWorker.openDocument();
        }
    }

    private static void saveToFile(Object target) {
        Path path = Paths.get("collected-data");
        try {
            Files.createDirectories(path);
            Path pathOfTheFile = Files.createFile(Path.of(path + "/newFile" + ".txt"));
            try (ObjectOutputStream stream = new ObjectOutputStream(Files.newOutputStream(pathOfTheFile))) {
                if (target != null) {
                    stream.writeObject(target);
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}

