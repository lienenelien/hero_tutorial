public class HeroApplication {

    public static void main(String[] args) {


//  Variable initializaion

        String heroName;
        String realName;
        String heroCity;
        String universe;

        String heroPower1, heroPower2, heroPower3;

        boolean isEvil;
        double heroSalary;

//  Variable assignment
        heroName = "AlieExpressMan";
        realName = "Phong Chu";
        heroCity = "Beijing";
        universe = "Earth Comics";

        heroPower1 = ">>> Fast delivery >>>";
        heroPower2 = "%%% Super discounts %%%";
        heroPower3 = "!!! Excellent English skills !!!";
        isEvil = false;
        heroSalary = 666.666;

//        Print out Hero information card
        System.out.println("**************************");
        System.out.println("HERO INFORMATION");
        System.out.println("**************************");

        System.out.println("Hero name:");
        System.out.println(heroName);
        System.out.println("Heroes real name -"+ realName );
        System.out.println("This Hero lives in -" + heroCity);
        System.out.println("Universe Hero resides -" +universe);

        System.out.println("_______________________________");
        System.out.println("Hero Superpowers");
        System.out.println("---" + heroPower1);
        System.out.println("---" + heroPower2);
        System.out.println("---" + heroPower3);
        System.out.println("_______________________________");
        System.out.println("Is this Hero evil? -" + isEvil);
        System.out.println("_______________________________");
        System.out.println("Hero wage" + heroSalary + "USD");
        System.out.println("_______________________________");


