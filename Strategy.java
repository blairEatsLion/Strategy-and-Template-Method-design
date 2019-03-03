
public interface Strategy<T> {
	
	public String printRow(T obj);
	public String getFirstCol(T obj);	
	public String getSecondCol(T obj);	

}
