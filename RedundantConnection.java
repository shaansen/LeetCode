import java.util.*;

public class RedundantConnection {
	
	public static HashSet<Integer> visited;	
	
	public static Map<Integer, LinkedList<Integer>> getMap(int[][] edges) {
		Map<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		for (int i = 0; i < edges.length; i++) {
			int x = edges[i][0];
			int y = edges[i][1];
			LinkedList<Integer> temp1 = map.getOrDefault(x,new LinkedList<Integer>());
			LinkedList<Integer> temp2 = map.getOrDefault(y,new LinkedList<Integer>());
			temp1.add(y);
			map.put(x,temp1);
			map.put(y,temp2);
		}
		return map;
	}
	
	public static int cycleExists(Map<Integer, LinkedList<Integer>> map, int vertex) {
		if(visited.contains(vertex)) {
			return vertex;
		} else {
			visited.add(vertex);
			ListIterator<Integer> li = map.get(vertex).listIterator();
			while(li.hasNext()) {
				int x = li.next();
				if(cycleExists(map,x) != -1) {
					return vertex;
				}
			}
		}
		return -1;
	}
	
	public static int[] findRedundantConnection(int[][] edges) {
		Map<Integer, LinkedList<Integer>> map = getMap(edges);
		int[] result = new int[2];
		visited = new HashSet<Integer>();
		for (Map.Entry<Integer, LinkedList<Integer>> entry: map.entrySet()) {
			visited.clear();
			if(map.get(entry.getKey()).size()!=0 && !visited.contains(entry.getKey()) && cycleExists(map,entry.getKey())!=-1) {
				System.out.println(visited);
				break;
			}
		}
		
		return null;
    }

	public static void main(String[] args) {
//		int[][] edges = {{1,2}, {2,3}, {3,4}, {1,4}, {1,5}};
//		int[][] edges = {{1,2}, {1,3}, {2,3}};
		int[][] edges = {{1,4},{3,4},{1,3},{1,2},{4,5}};
		System.out.println(Arrays.toString(findRedundantConnection(edges)));
	}

}
 