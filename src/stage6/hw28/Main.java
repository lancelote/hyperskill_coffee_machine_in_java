package stage6.hw28;

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

public class Main {
}

class Robot {

    private int x;
    private int y;
    private Direction direction = Direction.UP;

    public Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        Direction directionX;
        Direction directionY;

        if (robot.getX() > toX) {
            directionX = Direction.LEFT;
        } else {
            directionX = Direction.RIGHT;
        }

        if (robot.getY() > toY) {
            directionY = Direction.DOWN;
        } else {
            directionY = Direction.UP;
        }

        while (robot.getDirection() != directionX) {
            robot.turnRight();
        }

        while (robot.getX() != toX) {
            robot.stepForward();
        }

        while (robot.getDirection() != directionY) {
            robot.turnRight();
        }

        while (robot.getY() != toY) {
            robot.stepForward();
        }
    }

    public Direction getDirection() {
        return this.direction;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void turnLeft() {
        // rotate the robot 90 degrees counterclockwise
    }

    public void turnRight() {
        // rotate the robot 90 degrees clockwise
    }

    public void stepForward() {
        // take one step in the current direction
        // x or y coordinate will be changed on 1
    }
}