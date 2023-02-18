package tasks.hero;

public class Hero {

    private int point;

    MovementType movementType;

    public Hero() {
        this.point = 0;
    }

    public void move() {
        movementType.printMovementType();
        point += movementType.makeAMove();
    }

    public void setMovementType(MovementType movementType) {
        if (movementType == null) {
            System.out.println("Not existing movement type! Try again!");
            return;
        }
        this.movementType = movementType;
    }
    public int getCurrentPoint() {
        return point;
    }


}
