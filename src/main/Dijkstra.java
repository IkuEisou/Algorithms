/**
 * 
 */
package main;

/**
 * @author clever
 *
 */
public class Dijkstra {

	public static void shortest_path(int start, int n, int[][] route) {
		int min, v = 0, x = 0, size = 0;
		int[] distance = new int[n];
		boolean[] visit = new boolean[n];
		int[] path = new int[n];
		final int M = Integer.MAX_VALUE;

		// 初期处理
		for (int i = 0; i < distance.length; i++) {
			//从开始点到各节点距离的初始化
			distance[i] = route[start][i];
			//设置各节点没访问过
			visit[i] = false;
			//设置各节点直达开始点
			path[i] = start;
		}
		//开始点设为已访问
		visit[start] = true;
		//已访问节点数为1；
		size += 1;
		//起始点距离不用计算
		distance[start] = 0;
		//起始点路径不考虑
		path[start] = -1;
		
		// 扩大访问节点，直到全部访问过
		while (size < n) {
			//默认无穷大
			min = M;
			//设置各节点距离
			for (int i = 0; i < distance.length; i++) {
				//在没访问过的节点中寻找最短距离的节点下标
				if (!visit[i] && distance[i] < min) {
					min = distance[i];
					v = i;
				}
			}
			//最小路径节点加入已访问过的数组
			visit[v] = true;
			size += 1;

			//v节点到各节点距离更新
			for (x = 0; x < n; x++) {
				//只更新M以外并且没有访问过的节点
				if (route[v][x] != M && !visit[x]) {
					int dist = distance[v] + route[v][x];
					//新距离小于原距离时更新距离和路径数组
					if (distance[x] > dist) {
						distance[x] = dist;
						path[x] = v;
					}//end if
				}//end if
			}//end for
		}//end while

		// 打印路径
		System.out.println("Shortest path is:");
		for (int i = 0; i < path.length; i++) {
			System.out.print(path[i] + " ");
		}
	}
}
