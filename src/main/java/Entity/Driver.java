/**
 *
 * Builder pattern for the driver entity
 * @author Zubair Esau - 217100554
 *
 */

package Entity;

public class Driver {

    private int driverId ;
    private int deliveryId ;
    private int orderId ;
    private String DriverName;

   //private constructor
    private Driver(Builder builder){
        this.driverId = builder.driverId;
        this.deliveryId = builder.deliveryId;
        this.orderId = builder.orderId;
        this.DriverName = builder.DriverName;
    }

    // Getters and setters

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    //toString
    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", deliveryId=" + deliveryId +
                ", orderId=" + orderId +
                ", DriverName='" + DriverName + '\'' +
                '}';
    }

       //Builder pattern class
    public static class Builder {
        private int driverId ;
        private int deliveryId ;
        private int orderId ;
        private String DriverName;

        public Builder setDriverId(int driverId) {
            this.driverId = driverId;
            return this;
        }

        public Builder setDeliveryId(int deliveryId) {
            this.deliveryId = deliveryId;
            return this;
        }

        public Builder setOrderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setDriverName(String driverName) {
            DriverName = driverName;
            return this;
        }


       public Builder copy( Driver driver){
            this.driverId = driverId;
            this.deliveryId = deliveryId;
            this.orderId = orderId;
            this.DriverName = DriverName;
            return this;
        }


        public Driver build(){
          return new Driver(this);
        }



    }


}
