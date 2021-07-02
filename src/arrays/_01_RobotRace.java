package arrays;
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
	
	public static void main(String[] args) {
		
		Robot[] robots = new Robot[1];
		for(int i=0;i<robots.length; i++) {
			robots[i] = new Robot();
		}
		
		
		int startingX = 450;
		int startingY = 450;
		double originX = 450;
		double originY = 300;
		double x = 0;
		double y = 0;
		int angle = 0;
		y = startingY + Math.sin(angle)*150;
		robots[0].setAngle(270);
		robots[0].penDown();
		robots[0].setRandomPenColor();
		
		robots[0].moveTo(startingX, startingY);
		robots[0].setSpeed(1000);
		int move = 1;
		
		while(robots[0].getY()>300) {
			robots[0].move(move);
			robots[0].turn(90);
			robots[0].move(move);
			robots[0].turn(-90);
			move+=2;
		}
		robots[0].turn(90);
		while(robots[0].getY()>150) {
			robots[0].move(move);
			robots[0].turn(90);
			robots[0].move(move);
			robots[0].turn(-90);
			move-=2;
		}
		System.out.println(robots[0].getY());
		robots[0].turn(90);
		while(robots[0].getY()<300) {
			robots[0].move(move);
			robots[0].turn(90);
			robots[0].move(move);
			robots[0].turn(-90);
			move+=2;
		}
		robots[0].turn(90);
		while(robots[0].getY()<450) {
			robots[0].move(move);
			robots[0].turn(90);
			robots[0].move(move);
			robots[0].turn(-90);
			move-=2;
		}
		robots[0].turn(90);
		//robots[0].moveTo(startingX-200, startingY+200);
		
		
	
		
		
		
		//robots[1].moveTo(300, 550);
			
		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
			/*
			int rob = 0;
		while(robots[0].getY()>0 && robots[1].getY()>0 && robots[2].getY()>0 && robots[3].getY()>0 && robots[4].getY()>0) {
			
			for(int i=0; i<robots.length; i++) {				
				Random random = new Random();
				int randNum = random.nextInt(50);
				robots[i].move(randNum);
			    rob = i;
			}
		}
		*/
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		//x = startingX + Math.cos(angle)*150;
		//y = startingY + Math.sin(angle)*150;
		
		//int xint = (int)x;
		//int yint = (int)y;
		
		//robots[0].moveTo(xint, yint);
		//angle++;
			
	//7. declare that robot the winner and throw it a party!
			/*
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
			*/
	//8. try different races with different amounts of robots.
			
	//9. make the robots race around a circular track.
			
	}
}

