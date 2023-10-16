
public class Main {
    public static void main(String[] args) {
        String[] commands = {"Летать", "Стрелять"};
        Shelter shelter = new Shelter("Собаки Х", "Планета 333");
        Dog1 dog1 = new Dog1("Rex", "Pitbul", commands, ColorEnum.BLACK, shelter);
        System.out.println(dog1.getInfo());
        dog1.makeVoice();
        dog1.makeVoice("Цель устранен");
        System.out.println("----------------");

        Shelter shelter1 = new Shelter("Собаки Х", "Планета 333");
        Dog1 dog11 = new Dog1("Alexa", "Shiba-Inu", ColorEnum.GRAY, shelter1);
        System.out.println(dog11.getInfo());
        dog11.makeVoice();
        dog11.makeVoice("Лечение прошла успешна");
    }
}
 /*   Shelter shelter1 = new Shelter("Собаки Х", "Планета 333");
    Dog1 dog11 = new Dog1("Alexa", "Shiba-Inu", ColorEnum.GRAY, shelter1);
        dog11.makeVoice();
                dog11.makeVoice("Лечение прошла успешна");

  */











































/*Dog dog = new Dog();
    dog.setAge(4);
        System.out.println("Воздраст собаки " + dog.getAge());
*/

