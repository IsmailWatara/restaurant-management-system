/**
 * Payment.java
 * Payment entity for Restaurant Management System
 * Author: Uwais Ali Rawoot - 216217296
 * Date: 31 March 2022
 */

package Entity;

public class Payment {

    private int paymentId;
    private String payCash;
    private String payCard;
    private String payEft;

    //private constructor
    private Payment(Builder builder){
        this.paymentId = builder.paymentId;
        this.payCash = builder.payCash;
        this.payCard = builder.payCard;
        this.payEft = builder.payEft;
    }

    //Getters

    public int getPaymentId() {
        return paymentId;
    }public String getPayCash() {
        return payCash;
    }
    public String getPayCard() {
        return payCard;
    }
    public String getPayEft() {
        return payEft;
    }

    //Setters
    public void setPaymentId(int paymentId){
        this.paymentId = paymentId;
    }
    public void setPayCash(String payCash){
        this.payCash = payCash;
    }public void setPayCard(String payCard){
        this.payCard = payCard;
    }
    public void setPayEft(String payEft){
        this.payEft = payEft;
    }

    //toString
    @Override
    public String toString(){
        return  "Payment{" +
                ", paymentId" + paymentId + '\'' +
                ", payCash=" + payCash + '\'' +
                ", payCard=" + payCard + '\'' +
                ", payEft=" + payEft + '\'' +
                '}';
    }

    //Builder Pattern Class

    public static class Builder {
        private int paymentId;
        private String payCash;
        private String payCard;
        private String payEft;

        public Builder setPaymentId(int paymentId){
            this.paymentId = paymentId;
            return this;
        }

        public Builder setPayCash(String payCash){
            this.payCash = payCash;
            return this;
        }
        public Builder setPayCard(String payCard){
            this.payCard = payCard;
            return this;
        }
        public Builder setPayEft(String payEft){
            this.payEft = payEft;
            return this;
        }

        public Builder copy(Payment payment){
            this.paymentId = payment.paymentId;
            this.payCash = payment.payCash;
            this.payCard = payment.payCard;
            this.payEft = payment.payEft;
            return this;
        }
        public Payment build(){
            return new Payment(this);
        }
    }
}
