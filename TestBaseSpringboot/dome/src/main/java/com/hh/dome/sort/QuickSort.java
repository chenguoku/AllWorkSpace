package com.hh.dome.sort;

import java.util.Arrays;

/**
 * 快速排序
 *
 * @author chenguoku
 */
public class QuickSort {

//	public static void quickSort(int[] arr){
//	    qsort(arr, 0, arr.length-1);
//	}
//	private static void qsort(int[] arr, int low, int high){
//	    if (low < high){
//	        int pivot=partition(arr, low, high);        //将数组分为两部分
//	        qsort(arr, low, pivot-1);                   //递归排序左子数组
//	        qsort(arr, pivot+1, high);                  //递归排序右子数组
//	    }
//	}
//	private static int partition(int[] arr, int low, int high){
//	    int pivot = arr[low];     //枢轴记录
//	    while (low<high){
//	        while (low<high && arr[high]>=pivot) --high;
//	        arr[low]=arr[high];             //交换比枢轴小的记录到左端
//	        while (low<high && arr[low]<=pivot) ++low;
//	        arr[high] = arr[low];           //交换比枢轴大的记录到右端
//	    }
//	    //扫描完成，枢轴到位
//	    arr[low] = pivot;
//	    //返回的是枢轴的位置
//	    return low;
//	}
//
//	public static void main(String[] args) {
//		int[] arr = {3,8,2,5,7};
//		quickSort(arr);
//		IntStream stream = Arrays.stream(arr);
//		stream.forEach(System.out::print);
//	}

///////////////////////////两边交替遍历//////////////////////////////////////////////////////////////////
//    public static void main(String[] args) {
//        int[] arr = new int[]{4, 4, 6, 5, 3, 2, 8, 1};
//        quickSort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void quickSort(int[] arr, int startIndex, int endIndex) {
//        // 递归结束条件：startIndex大于或等于endIndex时
//        if (startIndex >= endIndex) {
//            return;
//        }
//
//        // 得到基准元素位置
//        int pivotIndex = partition(arr, startIndex, endIndex);
//        // 根据基准元素，分成两部分进行递归排序
//        quickSort(arr, startIndex, pivotIndex - 1);
//        quickSort(arr, pivotIndex + 1, endIndex);
//
//    }
//
//    /**
//     * @Description 分治（双边循环发）
//     * @Param
//     * @Return
//     * @Date 2019/12/27
//     * @Author chenguoku
//     * @Exception
//     */
//    public static int partition(int[] arr, int startIndex, int endIndex) {
//        //取第1个位置（也可以选择随机位置）的元素作为基准元素
//        int pivot = arr[startIndex];
//        int left = startIndex;
//        int right = endIndex;
//
//        while (left != right) {
//            //控制right 指针比较并左移
//            while (left < right && arr[right] >= pivot) {
//                right--;
//            }
//
//            //控制left指针比较并右移
//            while (left < right && arr[left] <= pivot) {
//                left++;
//            }
//
//            //交换left和right 指针所指向的元素
//            if (left < right) {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//            }
//
//        }
//
//        //pivot 和指针重合点交换
//        arr[startIndex] = arr[left];
//        arr[left] = pivot;
//
//        return left;
//    }

//////////////////////////////////////单边循环法//////////////////////////////////////////////////////////

    public static void main(String[] args) {
        int[] arr = new int[]{4, 4, 6, 5, 3, 2, 8, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int startIndex, int endIndex) {
        //递归结束条件：startIndex大于或等于endIndex时
        if (startIndex >= endIndex) {
            return;
        }

        //得到基准元素位置
        int piovtIndex = partition(arr, startIndex, endIndex);

        //根据基准元素，分成两部分进行递归排序
        quickSort(arr, startIndex, piovtIndex - 1);
        quickSort(arr, piovtIndex + 1, endIndex);

    }

    /**
     * @Description 分治（单边循环法）
     * @Param
     * @Return
     * @Date 2019/12/27
     * @Author chenguoku
     * @Exception
     */
    private static int partition(int[] arr, int startIndex, int endIndex) {
        //取第1个位置（也可以选择随机位置）的元素作为基准元素
        int pivot = arr[startIndex];
        int mark = startIndex;

        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (arr[i] < pivot) {
                mark++;
                int temp = arr[mark];
                arr[mark] = arr[i];
                arr[i] = temp;
            }
        }

        arr[startIndex] = arr[mark];
        arr[mark] = pivot;
        return mark;

    }


}
