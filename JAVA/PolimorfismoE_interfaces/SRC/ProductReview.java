public class ProductReview extends Post implements Evaluable{

	private String brand;
	private int stars;
	int value;
	public ProductReview(){

	}
	//+++++++++++++++++++++++++++++setter e getter for brand
	public void setBrand(String brand){
		
		this.brand = brand;
	}
	public String getBrand(){
		return this.brand;
	}

	//+++++++++++++++++++++++++++++setter e getter for date
	public void setStars(int stars){
		this.stars = stars;
	}
	public int getStars(){
		return this.stars;
	
	}
	
	//+++++++++++++++++++++++++++++++ interface method
	@Override
	public void evaluate(int value){
		this.value = value;

	}

	//+++++++++++++++++++++++++++++++ show method
	@Override
	public void show(){
		super.show();
		System.out.println("Brand: "+this.brand);
		System.out.println("stars: "+this.stars);
		System.out.println("Value: "+this.value);
		
	}

}