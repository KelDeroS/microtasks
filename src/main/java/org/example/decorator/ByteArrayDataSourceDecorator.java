package org.example.decorator;

class ByteArrayDataSourceDecorator implements DataSource {
    private DataSource dataSource;
    private byte[] byteArray;
    public ByteArrayDataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public void writeData(String data) {
        dataSource.writeData(data);
        byteArray = data.getBytes();
    }
    public String readData() {
        return new String(byteArray);
    }
}