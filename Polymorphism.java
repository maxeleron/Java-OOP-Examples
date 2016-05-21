
class Animal {
    String about = "Animal is multicellular, eukaryotic organism. Animal is motile, at some point in their lives. \n\n";
    void printAboutInfo() {
        System.out.print(about);
    }
}
 
class Mammal extends Animal  {
    String about = "Mammal has hair, three middle ear bones, and mammary glands. The mammalian brain regulates body temperature and the circulatory system, including the four-chambered heart.\n\n";
    void printAboutInfo() {
        System.out.print(about);
    }
}
 
class Human extends Mammal  {
    String about = "Human characterized by erect posture and bipedal locomotion; manual dexterity and increased tool use, compared to other animals; and a general trend toward larger, more complex brains and societies.\n\n";
    void printAboutInfo() {
        System.out.print(about);
    }
}
 
class Test {
    public static void main(String[] args) {
        Animal example1 = new Human ();
        Mammal example2 = new Human ();
        
        example1.printAboutInfo();
        example2.printAboutInfo();
        
    }
}
