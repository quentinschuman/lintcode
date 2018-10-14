/**
* @project_name coding
* @author quent
* @date 2018年9月30日
* @time 上午9:43:41
*/
package pat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] grades=new int[n];
//        StringBuffer sb=new StringBuffer();
//        for(int i=0;i<n;i++) {
//        	grades[i]=sc.nextInt();
//        }
//        int k=sc.nextInt();
//        int[] target_grades=new int[k];
//        int[] target_count=new int[k];
//        //为target_count赋初始化值0
//        for(int i=0;i<k;i++) {
//        	target_count[i]=0;
//        }
//        for(int i=0;i<k;i++) {
//        	target_grades[i]=sc.nextInt();
//        }
//        for(int i=0;i<k;i++) {
//        	for(int j=0;j<n;j++) {
//        		if (grades[j]==target_grades[i]) {
//					target_count[i]++;
//				}
//        	}
//        }
//        for(int i=0;i<k;i++) {
//        	sb.append(target_count[i]);
//        	if (i<k-1) {
//        		sb.append(" ");
//			}
//        }
//        System.out.println(sb);
//		sc.close();
		
		//1galleon=17Sickle   1sickle=29Knut;
//        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
//        String [] s1=bf.readLine().split(" ");
//        String [] p=s1[0].split("\\.");//应付
//        String [] a=s1[1].split("\\.");//实付
//        boolean flag=false;//是不是正数
//        int P []=new int[3];
//        int A []=new int[3];
//        for(int i=0;i<3;i++) {
//            P[i]=Integer.parseInt(p[i]);
//            A[i]=Integer.parseInt(a[i]);
//        }
//        if(A[0]>P[0]||(A[0]==P[0]&&A[1]>P[1])||(A[0]==P[0]&&A[1]==P[1]&&A[2]>P[2])||(A[0]==P[0]&&A[1]==P[1]&&A[2]==P[2])) {
//            flag=true;
//        }
//        if(!flag) {
//            for(int i=0;i<3;i++) {
//                int min=A[i];
//                A[i]=P[i];
//                P[i]=min;
//            }
//        }
//             
//        int knut=A[2]-P[2];
//        if(knut<0) {
//            A[1]-=1;
//            knut+=29;
//        }
//         
//        int sickle=A[1]-P[1];
//        if(sickle<0) {
//            A[0]-=1;
//            sickle+=17;
//        }
//         
//        int gallen=A[0]-P[0];
//        if(flag)
//            System.out.println(gallen+"."+sickle+"."+knut);
//        else
//            System.out.println("-"+gallen+"."+sickle+"."+knut);
		
		Scanner sc=new Scanner(System.in);
		String headAddr=sc.next();
		int nodeNo=sc.nextInt();
		int reverseNum=sc.nextInt();
		HashMap<String, Node> nodes=new HashMap<String, Node>();
		List<Node> list=new ArrayList<Node>();
		for(int i=0;i<nodeNo;i++) {
			String addr=sc.next();
			nodes.put(addr, new Node(addr, sc.nextInt(), sc.next()));
		}
		sc.close();
		while(!headAddr.equals("-1")) {
			Node node=nodes.get(headAddr);
			list.add(node);
			headAddr=node.nextAddr;
		}
		for(int i=0;i<list.size()-reverseNum;i+=reverseNum) {
			int l=i;
			int r=i+reverseNum-1;
			while(l<r) {
				Node t=list.get(l);
				list.set(l, list.get(r));
				list.set(r, t);
				l++;
				r--;
			}
		}
		int i;
		for(i=0;i<list.size()-1;i++) {
			Node node=list.get(i);
			System.out.println(node.addr+" "+node.data+" "+list.get(i+1).addr);
		}
		Node node=list.get(i);
		System.out.println(node.addr+" "+node.data+" -1");
	}
	static class Node{
		String addr;
		int data;
		String nextAddr;
		/**
		 * @param addr
		 * @param data
		 * @param nextAddr
		 */
		public Node(String addr, int data, String nextAddr) {
			super();
			this.addr = addr;
			this.data = data;
			this.nextAddr = nextAddr;
		}
		
	}
}
