package part_05.ex1;

public class Heyyooo {

    public static void main(String[] args) {

        Beeeeba bbOne = new Beeeeba();
        bbOne.setYayObj();

        Yaaaaay yay = new Yaaaaay();

        String colonelYay = yay.getColonelYay();

        Heyyooo obj = new Heyyooo();

        bbOne.setBbString("This is the Beeeeba string.");
        bbOne.setBbDouble(72.27);
        bbOne.setBbInt(14);
        bbOne.setCorporalBeeba("Teeeein Hut!");

        System.out.println(bbOne.getBbString());
        System.out.println(bbOne.getYayObj().getColonelYay());
        System.out.println(bbOne.getCorporalBeeba());
        System.out.println(bbOne.getYayObj().getYeee());

        System.out.println(bbOne.getYayObj().getDribble());





    }


}
