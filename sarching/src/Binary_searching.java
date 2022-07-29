public class Binary_searching {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,13,15,16,18,20};   //array sorted form
        int serch=13;
        int low=0;
        int hig= arr.length;
        int mid=(low+hig)/2;

        while(low<=hig){

            if (arr[mid]==serch){
                System.out.println("item is at\n "+mid+" index");
                break;
            } else if (arr[mid]<serch) {
                low=mid+1;
            }
            else{
                hig=mid-1;
            }
            mid=(low+hig)/2;
        }
        if (low>hig){
            System.out.println("element not found");
        }
    }
}
