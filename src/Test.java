public class Test {
    public static void main(String[] args){
        christmas c1= new christmas(1020);//24
        christmas c2= new christmas(15000);//24

        c1.ChangeDate();

        System.out.println(c2.date);
        System.out.println(c1.date);

        //c1.changeyear(2020);
        //c2.changeyear(2021);

        System.out.println(c2.year);
        System.out.println(c1.year);

        c1.getpresent(true);
        c2.getpresent(false);
    }
}
