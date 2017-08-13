public class ReverseList{
   static int[] reverse(int[] list){
      int[] rev = new int[list.length]; 
      int j = array.length-1;
      for(int i=0;i<array.length;i++) {                
               rev[i] = array[j];
               j--;
            
      }
      return rev;
      }
      public static void main(String args[])
      {
         int[] s = {11,12,13,411,15};
         System.out.println(reverse(s));
         int[] t = reverse(s);
         for(int n=0;n<t.length;n++)
         {
            System.out.println(t[n]);
         }
      }

}