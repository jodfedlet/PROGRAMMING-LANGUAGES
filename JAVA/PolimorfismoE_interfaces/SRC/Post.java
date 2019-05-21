import java.util.*;
public class Post{

	private String title;
	private Date date;
	private String content;
	private int likes;
	private int dislikes;

	//criacao de contrutor da classe
	public Post(){

	}
	
	//+++++++++++++++++++++++++++++setter e getter for title
	public void setTitle( String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}

	//+++++++++++++++++++++++++++++setter e getter for date
	public void setDate(Date date){
		this.date = date;
	}
	public Date getDate(){
		return this.date;
	
	}
	//+++++++++++++++++++++++++++++setter e getter for content
	public void setContent( String content){
		this.content = content;
	}
	public String getContent(){
		return this.content;
	}

	//+++++++++++++++++++++++++++++setter e getter for likes
	public void setLikes(int likes){
		this.likes = likes;
	}
	public int getLikes(){
		return this.likes;
	}
	//++++++++++++++++++++++++++++setter e getter for dislikes
	public void setDislikes(int dislikes){
		this.dislikes = dislikes;
	}
	public int getDislikes(){
		return this.likes;
	}

	
	//++++++++++++++++++++++++++++ Show method
	public void like(){
		this.likes += 1;
	}
	//++++++++++++++++++++++++++++ Show method
	public void dislike(){
		if(this.dislikes >= 0)
			this.dislikes+=1;
			
		//this.dislikes -=1;
	
	}
	//++++++++++++++++++++++++++++ Show method
	public void show(){
		System.out.println("Title: "+this.title);
		System.out.println("Date: "+this.date);
		System.out.println("Content: "+this.content);
		System.out.println("Likes: "+this.likes);
		System.out.println("Dislikes: "+this.dislikes);
	}
}