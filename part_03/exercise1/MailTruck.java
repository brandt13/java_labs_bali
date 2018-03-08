package part_03.exercise1;

public class MailTruck {

    private String driver;
    private String truckNumber;
    private int mailWeight;

    public MailTruck(String driver, String truckNumber, int mailWeight) {
        this.driver = driver;
        this.truckNumber = truckNumber;
        this.mailWeight = mailWeight;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber;
    }

    public int getMailWeight() {
        return mailWeight;
    }

    public void setMailWeight(int mailWeight) {
        this.mailWeight = mailWeight;
    }

    @Override
    public String toString() {
        return "MailTruck{" +
                "driver='" + driver + '\'' +
                ", truckNumber='" + truckNumber + '\'' +
                ", mailWeight=" + mailWeight +
                '}';
    }



}
