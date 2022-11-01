package com.main.third;

import java.io.Serializable;

public class DocumentWorker implements Serializable {

    public void openDocument() {
        System.out.println("Doc is opened");
    }

    public void editDocument() {
        System.out.println("Doc editing is only in PRO version");
    }

    public void saveDocument() {
        System.out.println("Save doc on;y in a PRO version");
    }

}
