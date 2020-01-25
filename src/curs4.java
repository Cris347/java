public class curs4 {
    public static void main(String[] args) {
        int dayofWeek= 4;
        switch (dayofWeek) {
            case 1 :
                System.out.println("luni");
                break;
            case 2 :
                System.out.println("marti");
               break;
            case 3 :
                System.out.println("miercuri");
                break;
            case 4:
            case 5:
                System.out.println("joi/vineri");
                break;
            default:
                System.out.println("nu stiu");

        }
    }

}
