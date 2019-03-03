
public class foodStrategy <T> implements Strategy <T>{
		
	public String printRow(T obj) {
		String s = String.format("%7s%9s",getFirstCol(obj),getSecondCol(obj));
		return s;
	}
	
	public String getFirstCol(T obj) {
		Food food = (Food) obj;
		return food.getName();
	}
	
	public String getSecondCol(T obj) {
        Food food = (Food) obj;
        double calories = 4*food.getCarbs()+9*food.getFat()+4*food.getProteins();
        String value = String.format("%.0f", calories);
        return value + " cal";
	}
		
}
