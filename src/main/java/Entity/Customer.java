/**
 * Ismail Watara
 * 219018790
 * Customer.java
 *
 */
package Entity;

public class Customer {

    private int custId;
    private String custFirstName;
    private String custLastName;
    private  int custNum;
    private String custEmail;

    private Customer(Builder builder){
        this.custId = builder.custId;
        this.custFirstName = builder.custFirstName;
        this.custLastName = builder.custLastName;
        this.custNum = builder.custNum;
        this.custEmail = builder.custEmail;


    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public int getCustNum() {
        return custNum;
    }

    public void setCustNum(int custNum) {
        this.custNum = custNum;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custFirstName='" + custFirstName + '\'' +
                ", custLastName='" + custLastName + '\'' +
                ", custNum=" + custNum +
                ", custEmail='" + custEmail + '\'' +
                '}';
    }

    public static class Builder{

        private int custId;
        private String custFirstName;
        private String custLastName;
        private  int custNum;
        private String custEmail;

        public Builder setCustId(int custId){
            this.custId = custId;
            return this;
        }
        public Builder setCustFirstName(String custFirstName) {
            this.custFirstName = custFirstName;
            return this;
        }

        public Builder setCustLastName(String custLastName) {
            this.custLastName = custLastName;
            return this;
        }

        public Builder setcustNum(int custNum){
            this.custNum = custNum;
            return this;
        }

        public Builder setcustEmail(String custEmail){
            this.custEmail = custEmail;
            return this;
        }

        public Builder copy(Customer customer){
            this.custId =custId;
            this.custFirstName = custFirstName;
            this.custLastName = custLastName;
            this.custNum = custNum;
            this.custEmail = custEmail;
            return this;
        }
        public Customer Build(){
            return new Customer(this);


        }
    }
}
