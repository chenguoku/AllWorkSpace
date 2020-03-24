package com.hh.dome.test;

import java.util.*;

import org.junit.Test;

public class Main {

//	@Test
//	public void Test() {
//		int a = 8%3;
//		System.out.println(a);
//	}
	/**
	 * 
	 * @Title: main @Description: 快速幂取模算法 @param @param args @return void @throws
	 */
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
//		int res = 1;
//		a %= c;
//		for (; b != 0; b /= 2) {
//			if (b % 2 == 1) {
//				res = (res * a) % c;
//			}
//			a = (a * a) % c;
//		}
//		System.out.println(res);
//	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String str = changeNum(num, 15);
		System.out.println(str);
	}


	/**
	 * 
	 * @Title: changeNum  
	 * @Description: 十进制 转 各种进制
	 * @param num 需要转换的 十进制
	 * @param base 需要转换的 进制
	 * @return String 转后的字符串   
	 * @throws
	 */
	private static String changeNum(int num, int base) {
		String all = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String baseString = all.substring(0, base);

		ArrayList<Character> list = new ArrayList<>();

		while (num > 0) {
			list.add(baseString.charAt(num % base));
			num /= base;
		}
		StringBuffer sb = new StringBuffer();

		for (int i = list.size() - 1; i >= 0; i--) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}

//	public static void main(String[] args) {
//		String x = Integer.toBinaryString(5); //10进制转2进制

//		Integer y = Integer.valueOf("11", 8);
//		System.out.println(y);
//	}

//	public static void main(String[] args) {
//		int[] arr = {2,4,3,6,3,2,5,5};
//		FindNumsAppearOnce(arr);
//	}

//    public static void FindNumsAppearOnce(int [] array) {
//        ArrayList<String> list = new ArrayList<String>();
//        for(int i = 0;i<array.length;i++){
//            String temp = String.valueOf(array[i]);
//            if(list.contains(temp)){
//                list.remove(temp);
//            }else{
//                list.add(temp);
//            }
//        }
//        
//        System.out.println(1);
//    }
//	
//	public static void main(String[] args) {
//		int[] arr = {1,3,3,3,3,4,5};
//		System.out.println(GetNumberOfK(arr,2));
//	}
//	
//    public static int GetNumberOfK(int [] array , int k) {
//    	
//        HashMap<String,Integer> map = new HashMap<String,Integer>();
//        for(int i = 0;i<array.length;i++){
//            if(map.containsKey(String.valueOf(array[i]))){
//                int num = map.get(String.valueOf(array[i]));
//                map.put(String.valueOf(array[i]),++num);
//            }else{
//                map.put(String.valueOf(array[i]),1);
//            }
//        }
//        if (map.get(String.valueOf(k)) != null) {
//			return map.get(String.valueOf(k));
//		}
//        return 0;
//    }
//	public int FirstNotRepeatingChar(String str) {
//		
//		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
//		for (int i = 0; i < str.length(); i++) {
//			if (map.containsKey(str.charAt(i))) {
//				int num = map.get(str.charAt(i));
//				map.put(str.charAt(i), ++num);
//			}else {
//				map.put(str.charAt(i), 1);
//			}
//		}
//		for (int i = 0; i < str.length(); i++) {
//			char charAt = str.charAt(i);
//			if (map.get(charAt) == 1) {
//				return i;
//			}
//		}
//
//		return -1;
//	}

//	public static void main(String[] args) {
//////	3 3 6
//		Scanner in = new Scanner(System.in);
//		String[] split = in.nextLine().split(" ");
//		int m = Integer.parseInt(split[0]);
//		int n = Integer.parseInt(split[1]);
//		int k = Integer.parseInt(split[2]);
//		int[][] flag = new int[m][n];
//		int num = getNum(0,0,m,n,k,flag);
//		
//		System.out.println(num);
//	}
//
//
//	private static int getNum(int i, int j, int rows, int cols, int threshold, int[][] flag) {
//		if (i < 0 || i >= rows || j < 0 || j >= cols || getSum(i) + getSum(j) > threshold || flag[i][j] == 1) {
//			return 0;
//		}
//		flag[i][j] = 1;
//		return getNum(i - 1, j, rows, cols, threshold, flag) + 
//				getNum(i + 1, j, rows, cols, threshold, flag) + 
//				getNum(i, j - 1, rows, cols, threshold, flag) + 
//				getNum(i, j + 1, rows, cols, threshold, flag) + 1;
//
//	}
////	private static int numSum(int i) {
////		int sum = 0;
////		do {
////			sum += i%10;
////		} while ((i = i/10) > 0);
////		return sum;
////	}
//	private static int getSum(int i) {
//		int sum = 0;
//		do {
//			sum += i % 10;
//		} while ((i = i / 10) > 0);
//
//		return sum;
//	}

/////////////////////////////快手第一题 start/////////////////////////////////////////////	

//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String strLine = in.nextLine();
//		if (strLine.isEmpty() || " ".equals(strLine) || "".equals(strLine)) {
//			System.out.println("True");
//		}
//		Main a = new Main();
//		TreeNode createTree = a.createTree(strLine,0);
//		System.out.println(1);
//	}
//
//	public TreeNode createTree(String string,int count) {
//
//		if ("".equals(string) || " ".equals(string)) {
//			return null;
//		}
//		int a = count;
//		TreeNode root = new TreeNode(Integer.parseInt(String.valueOf(string.charAt(0))));
//		if (string.length() >= ((int)Math.pow(2, count))*1+1) {
//			root.left = createTree(string.substring(((int)Math.pow(2, count))*1, string.length() - 1),++a);
//		}
//		if (string.length() >= ((int)Math.pow(2, count))*2+1) {
//			root.right = createTree(string.substring(((int)Math.pow(2, count))*2, string.length() - 1),++a);
//		}
//
//		return root;
//	}
//
//	class TreeNode {
//		public final int value;
//		TreeNode left;
//		TreeNode right;
//
//		public TreeNode(int value) {
//			this.value = value;
//			this.left = null;
//			this.right = null;
//		}
//	}

/////////////////////////////快手第一题 end///////////////////////////////////////////////	

/////////////////////////////快手第二题 start/////////////////////////////////////////////	
//	public static void main(String[] args) {
////		3 3 6
//		Scanner in = new Scanner(System.in);
//		String[] split = in.nextLine().split(" ");
//		int m = Integer.parseInt(split[0]);
//		int n = Integer.parseInt(split[1]);
//		int k = Integer.parseInt(split[2]);
//		int flag[][] = new int[m][n];
//		int num = getNum(0,0,m,n,flag,k);
//		
//		System.out.println(num);
//	}
//	
//	private static int getNum(int i,int j,int m,int n,int[][] flag,int k) {
//		if (i<0 || i>= m || j<0 || j>= n || numSum(i)+numSum(j)>k || flag[i][j] == 1) {
//			return 0;
//		}
//		flag[i][j] = 1;
//		return getNum(i-1,j,m,n,flag,k)+
//			   getNum(i+1,j,m,n,flag,k)+
//			   getNum(i,j-1,m,n,flag,k)+
//			   getNum(i,j+1,m,n,flag,k)+1;
//	}
//	
//	private static int numSum(int i) {
//		int sum = 0;
//		do {
//			sum += i%10;
//		} while ((i = i/10) > 0);
//		return sum;
//	}
/////////////////////////////快手第二题 end/////////////////////////////////////////////	

/////////////////////////////快手第三题 start/////////////////////////////////////////////	
//	public static void main(String[] args) {
//		
//		Scanner in = new Scanner(System.in);
//		int num = in.nextInt();
//		String str = Integer.toBinaryString(num);
//		char[] charArray = str.toCharArray();
//		int count = 0;
//		for (int i = 0; i < charArray.length; i++) {
//			char c = charArray[i];
//			String value = String.valueOf(c);
//			if ("1".equals(value)) {
//				count++;
//			}
//		}
//		System.out.println(count);
//	
//	}
/////////////////////////////快手第三题 end/////////////////////////////////////////////	
//	public TreeNode createTree() {
//		
//		
//		
//		return null;
//	}
//	
//	class TreeNode{
//		public final int value;
//		TreeNode left;
//		TreeNode right;
//
//		public TreeNode(int value) {
//			this.value = value;
//			this.left = null;
//			this.right = null;
//		}
//	}

//		public int NumberOf1Between1AndN(int n){
//	   long count=0;
//	   long i=1;
//	   for(i=1;i<=n;i*=10){
//	     long a=n/i,b=n%i;
//	     count=count+(a+8)/10*i;
//	     if(a%10==1){
//	       count+=b+1;
//	     }
//	     
//	  }
//	  return (int)count;
//		}
//	@Test
//	public void testOne() {
//		int[] result = new int[5];

//		List<Integer> list = new ArrayList<>();
//		list.add(321);
//		list.add(3);
//		list.add(32);
//		Collections.sort(list, (x,y)->{
//			String string1 = x+""+y;
//			String string2 = y+""+x;
//			return string1.compareTo(string2);
//		});
//		System.out.println(list);

//		String string = "123";
//		String string2 = "121";
//		System.out.println(string.compareTo(string2));
//		
////		(1==1)*5;
////		int[] arr = {1,2,3,2,2,2,5,4,2};
////		int num = MoreThanHalfNum_Solution(arr);
////		System.out.println(num);
//		
//	}
//	
//	public static int MoreThanHalfNum_Solution(int [] array) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int p = array.length/2;
//        for(int i = 0 ;i<array.length;i++){
//            if(map.get(array[i]) == null){
//                map.put(array[i],1);
//            }else{
//                int num = map.get(array[i]);
//                num++;
//                if(num > p){
//                    return array[i];
//                }
//                map.put(array[i],num);
//            }
//        }
//        return 0;
//    }
//	
//	public boolean IsPopOrder(int [] pushA,int [] popA) {
//		
//		if (pushA == null || popA == null || pushA.length == 0 || popA.length == 0 || pushA.length != popA.length) {
//			return false;
//		}
//		Stack<Integer> stack = new Stack<>();
//		int popIndex = 0;
//		for (int i = 0; i < pushA.length; i++) {
//			stack.add(pushA[i]);
//			while ( !stack.isEmpty() && stack.peek() == popA[popIndex]){
//				stack.pop();
//				popIndex++;
//			}
//		}
//		
//		return stack.empty();
//    }
//	
//	@Test
//	public void Test() {
//		Queue<Integer> queue = new LinkedList<>();
//		queue.add(1);
//		queue.add(2);
//		queue.add(3);
//		queue.add(4);
//		queue.add(5);
//
//		System.out.println(queue.poll());
//		System.out.println(queue.peek());
////		int a = 1;
////		int[] arr = new int[10];
////		arr[0] = a++;
////		System.out.println(arr[0]);
////		System.out.println(a);
//		
////		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
////		System.out.println(Integer.MAX_VALUE);
////		System.out.println(Integer.MIN_VALUE);
//		
//		
////		Stack<Integer> stack = new Stack<>();
////		stack.push(1);
////		stack.push(2);
////		stack.push(3);
////		stack.push(4);
////		stack.push(5);
////		
////		System.out.println(stack.pop());
////		System.out.println(stack.peek());
////		System.out.println(stack.pop());
////		
////		System.out.println(arr.length);
////		System.out.println(arr[0].length);
//		
////		Scanner in = new Scanner(System.in);
////		String string = in.nextLine();
////		System.out.println(Integer.parseInt(string,8));
////		System.out.println(Integer.toBinaryString(Integer.parseInt(string)));
//		
//	}
//	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String n = in.nextLine();
//		String[] source = in.nextLine().split(" ");
//		int[] arr = new int[source.length];
//		for (int i = 0; i < source.length; i++) {
//			arr[i] = Integer.parseInt(source[i]);
//		}
//		System.out.println(findNum(arr));
//
//	}
//
//	private static int findNum(int[] arr) {
//		int[] arr1 = new int[arr.length + 1];
//		arr1[0] = 0;
//		//把每一项和之前的相加，并存到arr1中
//		for (int i = 0; i < arr.length; i++) {
//			arr1[i + 1] = arr[i] + arr1[i];
//		}
//		int[] arr2 = new int[arr.length];
//		for (int i = 0; i < arr.length; i++) {
//			arr2[i] = 0;
//			if (i != 0 && arr2[i - 1] > arr.length - 1) {
//				break;
//			}
//			for (int j = arr.length; j >= 0; j--) {
//				if (arr1[i] == arr1[j]) {
//					arr2[i] = j - i;
//					break;
//				}
//			}
//		}
//
//		int max = 0;
//		for (int i = 0; i < arr2.length; i++) {
//			if (arr2[i] > max) {
//				max = arr2[i];
//			}
//		}
//		return max;
//
//	}

}
