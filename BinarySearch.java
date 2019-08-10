public class BinarySearch{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,7,9,10};
		int index=BinarySearch.binarySearchFun1(arr,4);
		System.out.println("index is : "+index);
	}
	/**
	二分查找法，while形式
	*/
	public static int binarySearch(int[] arr,int target){
		int l=0,r=arr.length-1;
		// int mid = (l+r)/2; 这样容易溢出
		while(l<=r){
			int mid = l+(r-l)/2;
			if(target==arr[mid])
				return mid;
			if(target<arr[mid])
				r=mid-1;
			if(target>arr[mid])
				l=mid+1;
		}
		return -1;
	}
	/**
	二分查找法，递归方式
	*/
	public static int binarySearchFun1(int[] arr,int target){
		return binarySearch_1(arr,0,arr.length-1,target);
	}
	public static int binarySearch_1(int[] arr,int l,int r,int target){
		if(l<=r){
		int mid = l+(r-l)/2;
		if(target==arr[mid])
			return mid;
		if(target>arr[mid])
			return binarySearch_1(arr,mid+1,r,target);
		if(target<arr[mid])
			return binarySearch_1(arr,l,mid-1,target);
		}
		return -1;
	}
}
