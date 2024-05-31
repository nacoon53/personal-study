import java.util.LinkedList;
import java.util.Queue;

public class Truck {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int sec=0, i=0;
        int on_bridge_weight = 0; //다리 위에 있는 트럭의 무게
        
        Queue<Integer> queue = new LinkedList<Integer>(); //다리라고 생각
        for(int n=0;n<bridge_length; n++) {
        	queue.add(0);
        }
        
        while(true){
        	if(queue.isEmpty()) {
        		break;
        	}
        	
        	sec++;
        	
        	if(i >= truck_weights.length || (!queue.isEmpty() && queue.peek() == 0) ) {
        		queue.poll();
        	}
        	
        	if(queue.size() >= bridge_length) {
            	on_bridge_weight -= queue.poll();
            }
        	
            if(i < truck_weights.length && on_bridge_weight + truck_weights[i] <= weight && queue.size() < bridge_length){ //트럭 개수와 무게 체크
                on_bridge_weight += truck_weights[i];
                queue.add(truck_weights[i]);
                i++;
            }else if(i < truck_weights.length){
            	queue.add(0);
            }
            
        }
        
        return sec;
    }
}
