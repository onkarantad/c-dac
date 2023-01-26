package data_structure.ds4_queueApp;

public interface QueueIntf {
	public void add(int n); 
	public int delete();
	public boolean isEmpty();
	public boolean isFull();
	public void display();
	public int getRear();
	public int getFront();
}
