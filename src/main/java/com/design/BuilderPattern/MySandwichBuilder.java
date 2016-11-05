package BuilderPattern;

/**
 * Created by sahilk on 04/11/16.
 */
public class MySandwichBuilder extends SandwichBuilder {


    public MySandwichBuilder(){
    }

    public void applyBread() {
        sandwich.setBreadType(BreadType.HONEYOAT);
    }

    public void applyVegetables() {
        sandwich.setHasVegetables(true);
    }

    public void addMeatAndCheese() {
        sandwich.setHasMayo(true);
        sandwich.setMeatType(MeatType.CHICKENBREST);
    }
}
