public class MyWater {

    private static int LARGE_BOTTLE = 2;
    private static int MEDIUM_BOTTLE = 1;
    private static float SMALL_BOTTLE = 0.5F;

    private int countLarge;
    private int countMedium;
    private int countSmall;

    public void addLarge(int howMany){
        countLarge += howMany;
    }

    public void addMedium(int howMany){
        countMedium += howMany;
    }

    public void addSmall(int howMany){
        countSmall += howMany;
    }

    private float countWater(){
        return countLarge * LARGE_BOTTLE +
                countMedium * MEDIUM_BOTTLE +
                countSmall * SMALL_BOTTLE;
    }

    public void printStatus(){
        System.out.println("Dużych butelek: " + countLarge);
        System.out.println("Srednich butelek: " + countMedium);
        System.out.println("Malych butelek: " + countSmall);

        System.out.println("Ilosc wody: " + countWater());
    }

}
