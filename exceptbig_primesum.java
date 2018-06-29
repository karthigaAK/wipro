 public static void main(String[] args) {
        int a[]={45,78,7,5,73};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
       int sum=0;
       int sum1=0;
        int i=a[0];
        System.out.println(i);
        int p=a.length;
      System.out.println(p);
        //int o;
        int j=a[p-1];
        System.out.println(j);
        for(int n=i;n<=j;n++){
            int count=0;
            for(int l=2;l<=n/2;l++ ){
                if(n%l==0){
                    count=1;
                }
            }
            if(count==0){
                //sum=sum+n;
                System.out.println(n);
                sum=sum+n;
                sum1=sum-a[4];
                }
                
            }
             System.out.println(sum);
              System.out.println(sum1);
               //System.out.println(a[p]);
        
       
         //System.out.println(sum);
