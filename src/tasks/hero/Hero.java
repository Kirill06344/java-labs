package tasks.hero;

public class Hero {

    private int point;

    MovementType movementType;

    public Hero() {
        this.point = 0;
        movementType = new Walking();
    }

    public void move() {
        movementType.printMovementType();
        point += movementType.makeAMove();
        System.out.println("Now you are at the point: " + point);
    }

    void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }


}
