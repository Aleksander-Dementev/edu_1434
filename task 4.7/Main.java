
/*
+Реализуй в классе Fox интерфейс Animal.
+Поменяй код так, чтобы в классе Fox был только один метод - getName.
+Учти, что создавать дополнительные классы и удалять методы нельзя!
Требования:
•+	Интерфейс Animal должен быть реализован в классе Fox.
•+	В классе Fox должен быть реализован только один метод (getName).
•+	В интерфейсе Animal нужно объявить метод getColor.
•+	Дополнительные классы или интерфейсы создавать нельзя.
*/

public class Task_4_7_ {
        public static void main(String[] args){
     Fox kFox = new Fox("bkdbjsj","Имяяя");
        }
}

interface Animal {
    public void Color();
}

class Fox implements Animal{
    String Color;
    String Name;
    public Fox(String color, String Name){
        this.Color = color;
        this.Name = Name;
    }
    public String getName() {
        return "Fox";

        }
    @Override
    public void Color() {
        
    }
}







