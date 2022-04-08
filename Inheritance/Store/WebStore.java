package com.java.inheritance.Store;

public class WebStore extends  Store{
    private String IPAddress;
    private String programmingLanguage;

    public WebStore(String name, String IPAddress, String programmingLanguage) {
        super(name);
        this.IPAddress = IPAddress;
        this.programmingLanguage = programmingLanguage;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "WebStore{Name = " + getName() +
                ", IPAddress='" + IPAddress + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                "} " ;
    }
}
