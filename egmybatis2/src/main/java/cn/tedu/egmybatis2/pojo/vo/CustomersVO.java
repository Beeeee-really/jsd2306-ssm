package cn.tedu.egmybatis2.pojo.vo;

public class CustomersVO {
    //姓名和城市
    private String custName;
    private String address;

    @Override
    public String toString() {
        return "CustomersVO{" +
                "custName='" + custName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
