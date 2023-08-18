package cn.tedu.egmaybatis1.pojo;

import java.util.Date;

public class Orders {
    private Integer id;
    private String state;
    private Double amount;
    private Date created;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", amount=" + amount +
                ", created=" + created +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
