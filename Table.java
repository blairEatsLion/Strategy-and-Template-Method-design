
import java.util.ArrayList;

public class Table<T> {
	ArrayList<T> list;
    Strategy<T> strategy;
    ArrayList <String> headers;
    
    // constructor
	public Table (ArrayList <String> h,ArrayList<T> objects, Strategy<T> s) {
		headers = h;
        strategy = s; 
        list = objects;  
    }
	
	public void add(T item) {
		list.add(item);
	}
	public void remove(T item) {
        list.remove(item);
    }
	
	// print header row, horizontal line, and item rows
	public String print() {	
        
        String result = "";
		for(String head : headers) {
			result += " "+head+"  ";
		}
		
		int lengthLine = result.length()-1;
		result += "\n";
			
		for(int i=0;i<lengthLine;i++) {
			result += "-";
		}
		result += "\n";
		
		for(T item : list) {
			result += strategy.printRow(item)+"\n";  // strategy pattern
		}
        return result;
	}

	
}
