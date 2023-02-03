package programs;

public class MovieTickets {
	private int movieId;
	  private int noOfSeats;
	  private double costofTicket;
	  public MovieTickets (int movieId, int noOfSeats, double costofTicket)
	  {
	    this.movieId = movieId;
	    this.noOfSeats = noOfSeats;
	    this.costofTicket = costofTicket;
	    
	  }
	  
	  public int getmovieId()
	  
	  {
	  return movieId;
	  
	  }

	 public void setmovieId(int movieId)
	 {

	
	    this.movieId = movieId;
	  }

	  public int getnoOfSeats() {
	    return noOfSeats;
	  }

	  public void setNoOfSeats(int noOfSeats) {
	    this.noOfSeats = noOfSeats;
	  }

	  public double getCostPerTickets(int movieId, int noOfSeats) {
	    if(movieId==111) {
	    	costofTicket = 7*noOfSeats;
	    	
	  }
	    else if (movieId==112) {
	    	costofTicket = 8*noOfSeats;
	    }
	    else if (movieId==113) {
	    	costofTicket = 8.5*noOfSeats;
	    } else {
	    	System.out.println("Enter a valid movie Id!!!");
	    	
	    }
	  return costofTicket;
	  
	  }

	  public static void main (String[] args)
	  {
		  {
			  MovieTickets e1 =new MovieTickets(0, 0, 0);
			  System.out.println(e1.getCostPerTickets(112,3));
		  }
	}
}
