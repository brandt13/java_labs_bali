package part_05.ex1;

public class Beeeeba {

    private String bbString;
    private int bbInt;
    private double bbDouble;
    private String corporalBeeba;
    private Yaaaaay yayObj = new Yaaaaay();


    public Yaaaaay getYayObj() {
        return yayObj;
    }

    public void setYayObj() {
        this.yayObj = yayObj;
        this.yayObj.setYeee("Yee.");
        this.yayObj.setColonelYay("LEMME SEE YOUR WAR FACE!");
        this.yayObj.setDribble(47.333);
        this.yayObj.setWoop(8);
    }

    public String getBbString() {
        return bbString;
    }

    public void setBbString(String bbString) {
        this.bbString = bbString;
    }

    public int getBbInt() {
        return bbInt;
    }

    public void setBbInt(int bbInt) {
        this.bbInt = bbInt;
    }

    public double getBbDouble() {
        return bbDouble;
    }

    public void setBbDouble(double bbDouble) {
        this.bbDouble = bbDouble;
    }

    public String getCorporalBeeba() {
        return corporalBeeba;
    }

    public void setCorporalBeeba(String corporalBeeba) {
        this.corporalBeeba = corporalBeeba;
    }


}
