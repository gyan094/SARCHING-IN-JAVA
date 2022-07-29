package Liniar;

public class string_search {
    public static void main(String[] args) {
        String arr[] = {"gyan", "prakash", "golu", "abhay"};
       String item = "golu";
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
               if (arr[i].equals(item))                       // or   if (arr[i] == item)
            {
                System.out.println("element is prsent\n " + i + " index number");
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("index not found");
        }
    }
}

