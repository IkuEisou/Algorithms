/**
 * 
 */
package main;

/**
 * @author clever
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//到達不了的距離
		final int M = Integer.MAX_VALUE;
		//帶權重的圖
		int route[][] = {{M,1,4,5,M,M,M,M},{1,M,M,3,6,M,M,M},{4,M,M,2,M,M,M,M},{5,3,2,M,2,M,5,M},
				{M,6,M,2,M,2,1,3},{M,M,M,M,2,M,M,4},{M,M,M,5,1,M,M,6},{M,M,M,M,3,4,6,M}};
		
		Dijkstra.shortest_path(3, route[0].length, route);
	}

}
