/**
 *
 * Ismail Watara
 * 219018790
 * Order.java
 */
package Entity;

public class Order {


    private int orderId;
    private String orderItem;


    private Order(Builder builder){
        this.orderId = builder.orderId;
        this.orderItem = builder.orderItem;


    }
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderItem='" + orderItem + '\'' +
                '}';

    }

    public static class Builder {
        private int orderId;
        private String orderItem;

        public Builder setorderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setorderItem(String orderItem) {
            this.orderItem = orderItem;
            return this;
        }

        public Builder copy(Order order){
            this.orderId = orderId;
            this.orderItem = orderItem;
            return this;
        }
        public Order Build(){
            return new Order(this);
        }
    }
}

