package office_movie;

public class Runner {

	public static void main(String[] args) {
		
		Movie mv = new Movie();
		mv.setName("Star Wars");
		mv.setDuration(120);
		mv.setGood(false);
		
		mv.movieInfo();
		mv.shortOrLong();
		System.out.println();
		Movie mv1 = new Movie();
		mv1.setName("Batman");
		mv1.setDuration(103);
		mv1.setGood(false);
		
		mv1.movieInfo();
		mv1.shortOrLong();
		System.out.println();
		Movie mv2 = new Movie();
		mv2.setName("Wonder");
		mv2.setDuration(80);
		mv2.setGood(true);
		
		mv2.movieInfo();
		mv2.shortOrLong();
		
		

	}

}
