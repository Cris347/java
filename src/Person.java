public class Person {
   public String name;
    private int age;
    private int height;
    private int stamina;

   public Person(String name, int age, int height, int stamina) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {stamina--; }

    public void sleep () {stamina +=12; }

    public boolean isMajor () {return age >= 18; }

    public int getAge() {return age; }

    }


/*constructorul are numele clasei si se genereaza automat,
se poate parametriza, si nu returneaza nimic
this - rep obiectul curent ; this.age = age
 */