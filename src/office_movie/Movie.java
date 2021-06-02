package office_movie;
//1. Create a class: Movie
//create variables and methods and create getters&setters for private variables:
//private String name;
//int duration;
//boolean isGood;
//public void shortOrLong() {
//    //Print: name+" was short!" if duration is less than 90 minutes
//    //Print: name+" was long!" otherwise
//}
//
//public void movieInfo() {
//    print the movie name, duration and isGood
//}
//2. Create another class: Runner and do the followings
//Create main method
//Create 3 Movie objects and assign values of your choice.
//Example:
//Movie name=starWars
//duration=120
//isGood=true
//And print the movie info

public class Movie {
	
	private String name;

	private int duration;
	
	private boolean isGood;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public boolean isGood() {
		return isGood;
	}
	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
	public void movieInfo() {
		System.out.println("name: "+getName());
		System.out.println("duration: "+getDuration());
		System.out.println("Comment: "+isGood());
	}
	public void shortOrLong() {
		if(this.duration<90) {
			System.out.println(this.name+" was short!");
		}else {
			System.out.println(this.name+" was long!");
		}
	}

}
