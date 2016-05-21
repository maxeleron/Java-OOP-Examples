//Створюємо клас Person.
class Person {
     
    private String name;
    private String surname;
    
    public String getName() { return name; }
    public String getSurname() { return surname; }
     
    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
  
    public void displayInfo(){
        System.out.println("Ім'я: " + name + " Прізвище: " + surname);
    }
}

//Створюємо клас Programmer, який унаслідує поля з класу Person.
class Programmer extends Person{
 
    private String company;//Компанія в якій працює програміст
    private String progLang;//Мова програмування програміста
    
    public Programmer(String name, String surname, String company, String progLang) {
       /*Оператор super потрібен для того щоб унаслідувати поля з 
       допусковим модулем private.
       */
        super(name, surname);
        this.company = company;
        this.progLang = progLang;
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Компанія: " + company +" Мова програмування: " + progLang );
    }
}

//Створюємо клас Student
class Student extends Person{
 
    private String university;//Компанія в якій працює програміст
    private int course;//Мова програмування програміста
    
    public Student(String name, String surname, String  university, int course) {
       /*Оператор super потрібен для того щоб унаслідувати поля з 
       допусковим модулем private.
       */
        super(name, surname);
        this. university =  university;
        this.course = course;
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Університет: " + university +" Курс: " + course );
    }
}

class ProgrammerExtended extends Programmer{
 
    private int expirience; //Досвід роботи
    
    public ProgrammerExtended(String name, String surname, String company, String progLang, int expirience) {
             
        super(name, surname, company, progLang);
        this.expirience = expirience;
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println(" Досвід роботи: " + expirience );
    }
}

class Test {
    public static void main(String[] args) {
    
        Person a = new Person("Mike", "Potter");
        Programmer b = new Programmer("Max", "Ponomarenko", "Google", "JavaScript");
        Student c = new Student("John", "Smit", "MIT", 2);
        ProgrammerExtended d = new ProgrammerExtended("Mark", "Cooper", "Oracle", "Java", 6);
        
        a.displayInfo();
        b.displayInfo();
        c.displayInfo();
        d.displayInfo();
    }
}
