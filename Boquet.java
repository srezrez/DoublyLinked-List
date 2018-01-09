
public class Boquet {
	private Flower flower;
	public void setFlower(Flower flower){
		this.flower = flower;
	}
	public Flower getFlower(){
		return this.flower;
	}	
		

	public void addFlower(String name){
		if (flower == null){
			flower = new Flower(name);
			flower.setNext(flower);
			flower.setPrev(flower);
			return;
		}
		Flower flower1 = new Flower(name);
		Flower tmp;
		tmp= flower;
		while(tmp.getNext()!= flower)
			tmp = tmp.getNext();
		tmp.setNext(flower1);
		tmp.getNext().setPrev(tmp);
		tmp.getNext().setNext(flower);
		tmp.setPrev(flower1);
	}
	public void output(){
		Flower tmp = flower;
		do{
			System.out.println(tmp.getName());
			tmp = tmp.getNext();
		}while(tmp!= flower);
	}
}
