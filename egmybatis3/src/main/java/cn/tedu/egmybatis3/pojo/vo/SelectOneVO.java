package cn.tedu.egmybatis3.pojo.vo;

public class SelectOneVO {
    //订单状态 金额
    private String state;
    private Double amount;

    @Override
    public String toString() {
        return "selectOneVO{" +
                "state='" + state + '\'' +
                ", amount=" + amount +
                '}';
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
}
