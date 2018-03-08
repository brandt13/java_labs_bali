package part_03.exercise1;

public class MailPerson {

    private String employeeID;
    private String name;
    private String mailRoute;
    private int piecesOfMail;

    public MailPerson(String employeeID, String name, String mailRoute, int piecesOfMail) {
        this.employeeID = employeeID;
        this.name = name;
        this.mailRoute = mailRoute;
        this.piecesOfMail = piecesOfMail;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMailRoute() {
        return mailRoute;
    }

    public void setMailRoute(String mailRoute) {
        this.mailRoute = mailRoute;
    }

    public int getPiecesOfMail() {
        return piecesOfMail;
    }

    public void setPiecesOfMail(int piecesOfMail) {
        this.piecesOfMail = piecesOfMail;
    }


    @Override
    public String toString() {
        return "MailPerson{" +
                "employeeID='" + employeeID + '\'' +
                ", name='" + name + '\'' +
                ", mailRoute='" + mailRoute + '\'' +
                ", piecesOfMail=" + piecesOfMail +
                '}';
    }


}
