
import java.util.ArrayList;

public class TableTM <T> {
	ArrayList<T> list;
    Template<T> template;
    ArrayList <String> headers;
    
    // constructor
	public TableTM (ArrayList <String> h,ArrayList<T> objects, Template<T> t) {
		headers = h;
		list = objects;
        template = t;
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
			result += template.printRow(item)+"\n";  // template pattern
		}
        return result;
	}

	
}
