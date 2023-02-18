package tasks.hero;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, MovementType> movementTypes = new HashMap<>() {{
            put("walking", new Walking());
            put("horse", new RidingAHorse());
            put("plane", new TravellingByPlane());
        }};
        Hero hero = new Hero();
        hero.setMovementType(movementTypes.get("walking"));
        String command = "";
        while (!command.equals("exit")) {
            command = in.next();
            switch (command) {
                case "move":
                    hero.move();
                    break;
                case "point":
                    System.out.println("The hero is at the point: " + hero.getCurrentPoint());
                    break;
                case "change":
                    String type = in.next();
                    hero.setMovementType(movementTypes.get(type));
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Incorrect command! Try again!");
                    break;
            }
        }
    }
}
