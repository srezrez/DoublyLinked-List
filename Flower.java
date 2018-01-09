
public class Flower {
	private String name;
	private Flower next;
	private Flower prev;
	public Flower(String name){
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setNext(Flower flower){
		this.next = flower;
	}
	public void setPrev(Flower flower){
		this.prev = flower;
	}
	public String getName(){
		return this.name;
	}
	public Flower getNext(){
		return this.next;
	}
	public Flower getPrev(){
		return this.prev;
	}
}
