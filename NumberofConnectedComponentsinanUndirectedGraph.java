import java.util.*;

public class NumberofConnectedComponentsinanUndirectedGraph {
	
	public static HashMap<Integer,ArrayList<Integer>> createMap(int[][] edges) {
	
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		
		for (int i = 0; i < edges.length; i++) {
			if(map.containsKey(edges[i][0])) {
				ArrayList<Integer> temp = map.get(edges[i][0]);
				temp.add(edges[i][1]);
				map.put(edges[i][0],temp);
			} else {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(edges[i][1]);
				map.put(edges[i][0],temp);
				
			}
			
			if(map.containsKey(edges[i][1])) {
				ArrayList<Integer> temp = map.get(edges[i][1]);
				temp.add(edges[i][0]);
				map.put(edges[i][1],temp);
			} else {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(edges[i][0]);
				map.put(edges[i][1],temp);
			}
		}
		return map;
	}
	
	public static void DFS(HashMap<Integer,ArrayList<Integer>> map, int idx, boolean[] visited) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(idx);
		while(!q.isEmpty()) {
			int x = q.poll();
//			System.out.println("Taking out from Q : "+x);
			if(!visited[x] && map.get(x)!=null) {
				visited[x] = true;
				q.addAll(map.get(x));
//				System.out.println("Adding all elements from Q for ");
//				System.out.println(q);
			} else {
//				System.out.println("Since all elements of "+x+" has been removed we are not touching this");
			}
//			System.out.println("---------------------------------------");
		}
		
		return;
	}
	
	public static int countComponents(int n, int[][] edges) {
        
		HashMap<Integer,ArrayList<Integer>> map = createMap(edges);
		boolean[] visited = new boolean[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			if(!visited[i]) {
				DFS(map,i,visited);
				count++;	
			}
			//System.out.println(Arrays.toString(visited));
		}
        
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
//		int edges[][] = {{0, 1}, {1, 2}, {2, 3}, {3, 4}};
		int edges[][] = {{2, 3}, {1, 2}, {1, 3}};
		System.out.println("Answer: "+countComponents(n, edges));
	}

}
