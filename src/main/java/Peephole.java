public class Peephole extends Item implements CanBeReplaced, BlinkAble{
    public Peephole(String name){
        super(name);
    }

    public void blink(Colors color){
        System.out.println(color.getName() + " " + this.getName() + " замигал");
    }
}