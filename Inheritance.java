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

class Test {
    public static void main(String[] args) {
    
        Person A = new Person("Mike", "Potter");
        Programmer B = new Programmer("Max", "Ponomarenko", "Google", "JavaScript");
        
        A.displayInfo();
        B.displayInfo();
    }
}
