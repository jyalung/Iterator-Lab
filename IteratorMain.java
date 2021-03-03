import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class IteratorMain {
	public static void main(String[] args) {
		ArrayList<Integer> theList = new ArrayList<Integer>();
		Random r = new Random();
		int num;
		
		for(int i = 0; i < 20; i++) {
			num = 10 + r.nextInt(100 - 10);
			theList.add(num);
		}
		
		System.out.println(theList);
		ListIterator<Integer> li = theList.listIterator();
		
		
		while(li.hasNext())
		{
			int i = li.nextIndex();
			Integer current = li.next();
			for(int j = 0; j < i; j++) {
				Integer cNum =(int)(theList.get(j) % 10);
				if(cNum.equals((theList.get(j + 1))%10)) {
						li.remove();
						li.previous();
						li.remove();
					break;
					
				}
				
				Integer c = (int) Math.floor(theList.get(j)/10);
				if(c.equals((theList.get(j + 1)) / 10)) {
						li.remove();
						li.previous();
						li.remove();
					break;
				}
			}
		}
		System.out.println("\n"+theList);
		
	}
	
}
