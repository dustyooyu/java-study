package org.example.Week4.Day18_230511;

import org.example.Week4.Day18_230511.Adress;

public class Hospital {

    private String name;
    private String webSiteAddr;
    private Adress adress;

    public String getName() {
        return name;
    }

    public String getWebsitAddr() {
        return webSiteAddr;
    }

    public Adress getAdress() {
        return adress;
    }


    public Hospital(String name, String webSiteAddr, Adress adress) {
        this.name = name;
        this.webSiteAddr = webSiteAddr;
        this.adress = adress;
    }
}
