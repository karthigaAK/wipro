public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int[] a={83,125,100,2,67};
       
       int sum=0,count=0;
       for(int i=0;i<a.length;i++){
           int c=0;
           for(int j=2;j<a[i];j++){
               if(a[i]%j==0){
                   c = c+1;
               }
           }
           if(c==0){
               
             System.out.println(a[i]);
             sum=sum+i;
             
             
           }
           
               
       }
       
     
    System.out.print(sum);
         
         
    
    
                

    }
    
}
