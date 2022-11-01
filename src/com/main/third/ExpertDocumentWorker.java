package com.main.third;

import java.io.Serializable;

public class ExpertDocumentWorker extends ProDocumentWorker implements Serializable {
    @Override
    public void saveDocument() {
        System.out.println("Doc was saved in a new format");
    }
}
