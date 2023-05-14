package org.example.Week4.Day18_230511;

public class Adress {

    private String fullAddress;
    private String sido;
    private String sigungu;

    public Adress(String fullAddress, String sido, String sigungu) {
        this.fullAddress = fullAddress;
        this.sido = sido;
        this.sigungu = sigungu;
    }
    public String getFullAddress() {
        return fullAddress;
    }

    public String getSido() {
        return sido;
    }

    public String getSigungu() {
        return sigungu;
    }
}

