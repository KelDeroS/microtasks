package org.example.decorator;

class FileDataSource implements DataSource {
    private String filename;
    public FileDataSource(String filename) {
        this.filename = filename;
    }
    public void writeData(String data) {
        // write data to file
    }
    public String readData() {
        // read data from file
        return "";
    }
}