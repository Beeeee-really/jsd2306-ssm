package cn.tedu.egmvc2.pojo.vo;

public class ThingVO {
    private String title;
    private String price;
    private String num;

    @Override
    public String toString() {
        return "ThingVO{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", num='" + num + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
