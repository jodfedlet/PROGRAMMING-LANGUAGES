
public class News extends Post{

	private String source;

	public News(){

	}

	//+++++++++++++++++++++++++++++setter e getter for title
	public void setSource(String source){
		this.source = source;
	}
	public String getSource(){
		return this.source;
	}

	//********************************Show method
	@Override
	public void show(){

		super.show();
		System.out.println("Source: "+this.source);

	}
}