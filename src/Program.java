public class Program {
    public static void main(String[] args) {
        Person alex = new Person("Alexandru", 20, 175, 10);
        /* name,age,height - proprietati,
         */
        System.out.println(alex.getName() +" are " + alex.getAge() + " de ani");

        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.getName() + " are energia " + alex.getStamina());
        alex.sleep();
        System.out.println(alex.getName() + " are energia " + alex.getStamina());
        /*sleep,run - metode

         */
        if (alex.isMajor()) {
            System.out.println(alex.getName() + " drinks beer");
        }
    }
}

/*daca in Program setezi pe private ,
proprietatile nu m ai pot fi accesate din exterior, de aceea proprietatile se coloreaza cu rosu
 */