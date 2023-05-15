import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /**  Animal деген класс тузунуз жана бир метод кошунуз.
         Анын 3 наследнигин тузунуз.
         Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
         Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
         instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
         чыгарыныз.
         Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине салыныз.*/
        Animal akula = new Shark("Akula");
        Animal tashBaka = new Turtle("Tash baka");
        Animal byrkyt = new Eagle("Byrkyt");
        Animal[] animals = {akula, tashBaka, byrkyt};
        Shark[] sharks = new Shark[1];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];
        for (Animal animal:animals){
            if(animal instanceof Shark){
                sharks[0]=(Shark) animal;
            } else if (animal instanceof Eagle) {
                eagles[0]=(Eagle) animal;
            } else if (animal instanceof  Turtle) {
                turtles[0] = (Turtle) animal;
            }}
            System.out.println(Arrays.toString(sharks));
            System.out.println(Arrays.toString(turtles));
            System.out.println(Arrays.toString(eagles));

//        for(Animal a:animals){
//            if(a.getClass().equals(Shark.class)) {
//                ((Shark) a).attack();
//            } else if(a.getClass().equals(Turtle.class)){
//                ((Turtle) a).swim();
//            } else if(a.getClass().equals(Eagle.class)){
//                ((Eagle) a).fly();
//            }
//        }
        for (Animal a : animals) {
            if (a instanceof Shark) {
                ((Shark) a).attack();
            } else if (a instanceof Turtle) {
                ((Turtle) a).swim();
            } else if (a instanceof Eagle) {
                ((Eagle) a).fly();
            }
        }
    }}


