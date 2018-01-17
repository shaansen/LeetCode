import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RoadsandLibraries {
	
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
	
	public static int DFS(HashMap<Integer,ArrayList<Integer>> map, int idx, boolean[] visited,long road) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(idx);
		long result = 0;
		
		while(!q.isEmpty()) {
			int x = q.poll();
			if(!visited[x-1] && map.get(x)!=null) {
				visited[x-1] = true;
				q.addAll(map.get(x));
				result += road;
			} 			
		}
//		System.out.println("IDX:"+idx+"\t-> "+result);
		return (int)result;
	}
	
	public static int countComponents(int n, int[][] edges,int c_lib,int c_road) {
		
		if(n==1) {
			return c_lib;
		}
		
        HashMap<Integer,ArrayList<Integer>> map = createMap(edges);
		long buildRoad = c_lib < c_road ? c_lib : c_road;
		boolean[] visited = new boolean[n];
		long count = 0;
		for (int i = 1; i <= n; i++) {
			if(!visited[i-1]) {
				int road = DFS(map,i,visited,buildRoad);
				count += road==0 ? c_lib : (c_lib+road-buildRoad) ;	
			}
		}
        return (int)count;
    }

    static int roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
    	return countComponents(n, cities, c_lib, c_road);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int c_lib = in.nextInt();
            int c_road = in.nextInt();
            int[][] cities = new int[m][2];
            for(int cities_i = 0; cities_i < m; cities_i++){
                for(int cities_j = 0; cities_j < 2; cities_j++){
                    cities[cities_i][cities_j] = in.nextInt();
                }
            }
            int result = roadsAndLibraries(n, c_lib, c_road, cities);
            System.out.println(result);
        }
        in.close();
    }
}
