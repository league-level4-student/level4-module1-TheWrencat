package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		// 1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE));
	}

	public Location getHeadLocation() {
		// 2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		// 1. use a switch statement to check on the currentDirection
		// of the snake and calculate its next x and y position.
		int nextXpos;
		int nextYpos;
		int cX = head.getLocation().x;
		int cY = head.getLocation().y;
		switch (currentDirection) {
		case UP:
			nextYpos = cY - 1;
			nextXpos = cX;
			break;
		case DOWN:
			nextYpos = cY + 1;
			nextXpos = cX;
			break;
		case LEFT:
			nextXpos = cX - 1;
			nextYpos = cY;
			break;
		case RIGHT:
			nextXpos = cX + 1;
			nextYpos = cY;
			break;
		default:
			nextYpos = cY - 1;
			nextXpos = cX;
			break;
		}
		Location nextPos = new Location(nextXpos, nextYpos);

		// 2. Iterate through the SnakeSegments in reverse order
		// 2a. Update each snake segment to the location of the segment
		// in front of it.
		for (int i = 1; i < snake.size(); i++) {
			snake.get(i).setLocation(snake.get(i - 1).getLocation());
		}

		// 3. set the location of the head to the new location calculated in step 1

		head.setLocation(nextPos);

		// 4. set canMove to true
		canMove = true;
	}

	public void setDirection(Direction d) {
		// 1. set the current direction equal to the passed in Direction only if canMove
		// is true.
		// set canMove equal to false.
		// make sure the snake cannot completely reverse directions.

		if (currentDirection == Direction.DOWN && d == Direction.UP) {
			canMove = false;
		}
		if (currentDirection == Direction.UP && d == Direction.DOWN) {
			canMove = false;
		}
		if (currentDirection == Direction.LEFT && d == Direction.RIGHT) {
			canMove = false;
		}
		if (currentDirection == Direction.RIGHT && d == Direction.LEFT) {
			canMove = false;
		}
		if (canMove == true) {
			currentDirection = d;
		}
		canMove = false;

	}

	public void reset(Location loc) {
		// 1. clear the snake
		snake.clear();
		// 2. set the location of the head
		Location rst = new Location(10, 10);
		head.setLocation(rst);
		// 3. add the head to the snake
		snake.add(head);
	}

	public boolean isOutOfBounds() {
		// 1. complete the method so it returns true if the head of the snake is outsize
		// of the window
		// and false otherwise
		if (0 > head.getLocation().x || head.getLocation().x > _00_SnakeGame.WINDOW_WIDTH) {
			return true;
		} else if (0 > head.getLocation().y || head.getLocation().y > _00_SnakeGame.WINDOW_HEIGHT) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isHeadCollidingWithBody() {
		// 1. complete the method so it returns true if the head is located
		// in the same location as any other body segment
		for (int i = 0; i < snake.size(); i++) {
			Location bloc = snake.get(i).getLocation();
			if (head.getLocation() == bloc) {
				return true;
			}
		}
		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		// 1. complete the method so it returns true if the passed in
		// location is located on the snake
		for (int i = 0; i < snake.size(); i++) {
			Location bloc = snake.get(i).getLocation();
			if (loc == bloc) {
				return true;
			}
		}
		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
