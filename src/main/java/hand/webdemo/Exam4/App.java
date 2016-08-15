package hand.webdemo.Exam4;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class App {
	
	public static void main(String[] args) {
		int num = 50;
		int max = 100;
	
		List<Integer> list = new ArrayList<Integer>();
		Random random= new Random(System.currentTimeMillis());
		for(int i =0;i<num;i++){
			list.add(random.nextInt(max));
		}
		
		System.out.print("随机生成 "+num+"个小于 "+max+"的数,分别为:");
		for(int i =0;i<num;i++){
			if(i<num-1){
				System.out.print(list.get(i)+",");
			}else 
				System.out.print(list.get(i)+"\n");
		}
		
		
		Map<Integer,Integer []> map = new HashMap<Integer,Integer[]>();
		Integer[] cur = {1,2,3,4,5,6,7,8,9};
        
		for(int i =0;i<num;i++){
			for(int j=0;j<9;j++)
			 if(list.get(i)/10 == cur[j])
			    cur[j]= list.get(i);	
		}
		for(int j=0;j<9;j++)
		{
	        map.putIfAbsent(j, cur);
		}
		System.out.println("Map中的数据为：");
		System.out.println("排序后的Map为：");
	}
}
