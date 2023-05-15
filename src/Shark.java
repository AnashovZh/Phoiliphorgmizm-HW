public class Shark extends Animal{
    public Shark(String name) {
        super(name);
    }

    public  void attack(){
        System.out.println("Shark attacking");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
