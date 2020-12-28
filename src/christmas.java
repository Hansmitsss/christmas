public class christmas {
public static int date;
public int year;
public boolean geschenke;

    christmas(int jahr){
        date=24;
        geschenke =true;
        year=jahr;
    };

    public void ChangeDate(){
        date=25;

    }
    public void changeyear(int jahr){
        year=jahr;
    }
    public void getpresent(boolean nice){

        if(nice==true && year<=1600) {
            System.out.println("Geschenke!!!");
        }else{
            System.out.println("Keine Geschenke");
        }
    }

}
