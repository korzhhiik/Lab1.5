package com.main.third;

import java.io.Serializable;

public class ProDocumentWorker extends DocumentWorker implements Serializable {

    @Override
    public void openDocument() {
        System.out.println("Doc was opened in EXPERT version");
    }

    @Override
    public void editDocument() {
        System.out.println("Doc was edited");
    }

    @Override
    public void saveDocument() {
        System.out.println("Doc was saved on old format");
    }
}
