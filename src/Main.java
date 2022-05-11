import Exo1.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle blue = new Rectangle(23,28);
        Rectangle red = new Rectangle(82,12);
        Rectangle green = new Rectangle(41,40);

        System.out.println("absicce : "+blue.getAbsicce()+ "---- ordonne : "+blue.getOrdonne());
        blue.surface();
        System.out.println("absicce : "+red.getAbsicce()+ "---- ordonne : "+red.getOrdonne());
        red.surface();
        System.out.println("absicce : "+green.getAbsicce()+ "---- ordonne : "+green.getOrdonne());
        green.surface();


    }
}
