package org.example.decorator;

interface DataSource {
    void writeData(String data);
    String readData();
}
