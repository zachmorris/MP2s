package bibliothek210;

/*
 * 
 * @author: Zachary Morris
 * 
 */
public class DVD extends LibraryHolding {

	private String title;
	private String director;
	private static final int checkoutDuration = 7;
	
	/**
	 * Constructor for the DVD class
	 * Sets the title and director
	 * 
	 * @param title: the film title
	 * @param director: the film's director
	 */
	public DVD( String title, String director ) {
		super( );
		this.title = title;
		this.director = director;
	}
	
	/**
	 * @return the checkout duration in number of days
	 */
	@Override
	public int getCheckoutDuration( ) {
		return checkoutDuration;
	}
	
	@Override
	public String getStringRepresentation( ) {
		return "<DVD>\n<DVD>"+title+"</title>\n<director>"+director+"</director>\n</book>";
	}
	
	@Override
	public String holdingType( ) {
		return "DVD";
	}
	

}
