package arrays;
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
		for(int i=0;i<robots.length; i++) {
			robots[i] = new Robot();
		}
	//4. make each robot start at the bottom of the screen, side by side, facing up
			robots[0].moveTo(150, 550);
			robots[1].moveTo(300, 550);
			robots[2].moveTo(450, 550);
			robots[3].moveTo(600, 550);
			robots[4].moveTo(750, 550);
		
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
			int rob = 0;
		while(robots[0].getY()>0 && robots[1].getY()>0 && robots[2].getY()>0 && robots[3].getY()>0 && robots[4].getY()>0) {
			
			for(int i=0; i<robots.length; i++) {				
				Random random = new Random();
				int randNum = random.nextInt(50);
				robots[i].move(randNum);
			    rob = i;
			}
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
			
			
	//7. declare that robot the winner and throw it a party!
			if(rob==0) {
				System.out.println("winner is 0");
			}else if(rob==1) {
				System.out.println("winner is 1");
			}else if(rob==2) {
				System.out.println("winner is 3");
			}else if(rob==3) {
				System.out.println("winner is 3");
			}else {
				System.out.println("winner is 4");
			}
	//8. try different races with different amounts of robots.
			
	//9. make the robots race around a circular track.
			
	}
}
