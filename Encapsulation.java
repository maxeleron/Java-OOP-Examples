class People {
    // Створюємо змінну size, для запису росту людини.
    private int size;
    
    /*Створюємо метод getSize. Він буде повертати значення size, якщо потім 
    потрібен буде доступ до цієї змінної.
    */
    public int getSize() {
        return size;
    }
    //Метод для того щоб можна було встановити значення size.
    public void setSize(int s){
        size = s;
    }
    /*Як можна побачити з методами getSize і setSize ми маємо той самий функціонал,
    який ми мали не створючи цих методів і не пишучи модуль доступу private.
    Але обмеживши доступ до змінної size, ми змушуємо програміста знати що йому потрібно
    в той чи інший момент, а саме просто дізнатись значення змінної або оновити/встановити значення.
    */
    void height(){
        if (size > 185){
            System.out.println("Tall");
        }
        else if (size > 170){
            System.out.println("Middle");
        }
        else {
            System.out.println("Short");
        }
    }
}  
 
class Test {
    public static void main(String[] args) {
    
        People Mike = new People();
        Mike.setSize(191);
        
        People David = new People();
        David.setSize(171);
        
        Mike.height();
        David.height();
        
        double averageHeight = (Mike.getSize() + David.getSize())/2;
        System.out.println(averageHeight);
    }
}
