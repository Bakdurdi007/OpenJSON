package org.example;

public class Money {

    private String title;
    private String code;
    private String cb_price;
    private String nbu_buy_price;
    private String nbu_cell_price;
    private String date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCb_price() {
        return cb_price;
    }

    public void setCb_price(String cb_price) {
        this.cb_price = cb_price;
    }

    public String getNbu_buy_price() {
        return nbu_buy_price;
    }

    public void setNbu_buy_price(String nbu_buy_price) {
        this.nbu_buy_price = nbu_buy_price;
    }

    public String getNbu_cell_price() {
        return nbu_cell_price;
    }

    public void setNbu_cell_price(String nbu_cell_price) {
        this.nbu_cell_price = nbu_cell_price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Money{" +
                "title='" + title + '\'' +
                ", code='" + code + '\'' +
                ", cb_price='" + cb_price + '\'' +
                ", nbu_buy_price='" + nbu_buy_price + '\'' +
                ", nbu_cell_price='" + nbu_cell_price + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
