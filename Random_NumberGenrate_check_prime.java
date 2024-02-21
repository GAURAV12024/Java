class SY2022BIT022{

        //function to count non prime number in the array of random number
        public  long Count_Non_PrimeNumber(long[] arr ){
            int count=0;
            for(int i=0;i<arr.length;i++){
            
                if(isPrimeNumber(arr[i])==false){
                    count++;
                }
            }	
            return count;
        }       


        //function to count prime number in the array of random number
        public  long Count_PrimeNumber(long[] arr ){
              int count=0;
              for(int i=0;i<arr.length;i++){
           
                    if(isPrimeNumber(arr[i])==true){
                        count++;
                    }
              }	
            return count;
        }
        

        //function to generate random number 
        public long Generate_RandomNumber(){
            long currentTime=System.nanoTime();
            long sevenDigit_Number=currentTime%1000000;
    
            return sevenDigit_Number;
        }

        //function to check numbere is prime or not 
        public  boolean isPrimeNumber(long num){
            if(num<2 ){
                return false;
            }
            for(int i=2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;

        }


    public static void main(String[] args) {

        SY2022BIT022 sy =new SY2022BIT022();
        
        
        long RandomNumber[]=new long[1000000];
        for(int i=0;i<RandomNumber.length;i++){
            RandomNumber[i]=sy.Generate_RandomNumber();
        }
        // for(int i=0;i<RandomNumber.length;i++){
        //     System.out.print(RandomNumber[i]+" ");
        // }

        // System.out.println(Count_Non_PrimeNumber(RandomNumber));
        // System.out.println(Count_PrimeNumber(RandomNumber));
        
        int timer = 1;
        while(timer<=5){
            
                long startTime = System.currentTimeMillis();
                long NonprimeCount = sy.Count_Non_PrimeNumber(RandomNumber);
                System.out.println("The total number of non-Prime numbers by approach1 are:" + NonprimeCount);
                System.out.println("The total number of Prime numbers by approach1 are:" +(1000000 - NonprimeCount));
                long elapsedTime = System.currentTimeMillis() - startTime;
                System.out.println("time taken by approach 1 is :"+elapsedTime);
                
                long startTime1 = System.currentTimeMillis();
                long primeCount = sy.Count_PrimeNumber(RandomNumber);
                System.out.println("The total number of Prime numbers by approach 2 are:" + primeCount);
                System.out.println("The total number of non-Prime numbers by approach 2 are:" + (1000000 - primeCount));
                long elapsedTime1 = System.currentTimeMillis() - startTime1;
                System.out.println("time taken by approach 2 is :"+elapsedTime1);
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            timer++;
         
         }


        

    }

}
