class Person {
    // Створюємо змінну height, для запису росту людини.
    private int height;
    
    /*Створюємо метод getHeight. Він буде повертати значення height, якщо потім 
    потрібен буде доступ до цієї змінної.
    */
    public int getHeight() {
        return height;
    }
    //Метод для того щоб можна було встановити значення height.
    public void setHeight(int s){
        height = s;
    }
    
    String size(){
        if (height > 185){
            return "Tall";
        }
        else if (height > 170){
            return "Middle";
        }
        else {
            return "Short";
        }
    }
}  
 
class Test {
    public static void main(String[] args) {
    
        Person mike = new Person();
        mike.setHeight(191);
        
        Person david = new Person();
        david.setHeight(171);
        
        String mikeInfo = mike.size();
        String davidInfo = david.size();
        
        double averageHeight = (mike.getHeight() + david.getHeight())/2;
        System.out.println(averageHeight);
    }
}
