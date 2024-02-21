
class SY2022bit022{

    public int getValidRegistrationsCount1(String[] registration) {

        if (registration == null || registration.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < registration.length; i++) {

            if (registration[i] == null || registration[i].length() == 0 || registration[i].length() != 10) {
                // Skip invalid registration and continue with the next one
                continue;
            }

            String registrationNumber = registration[i];

            int k = 0;

            // Check year
            String checkYear = registrationNumber.substring(0, 4);

            if (checkYear.matches("\\d{4}")) {
                int yy = Integer.parseInt(checkYear);

                if (yy >= 2000 && yy <= 2024) {
                    k = k + 1;
                }
            }

            // Check branch
            String checkBranch = registrationNumber.substring(4, 7);

            if (checkBranch.equals("BIT") || checkBranch.equals("BME") || checkBranch.equals("BCS") || checkBranch.equals("BCH")) {
                k = k + 1;
            }

            // Check roll number
            String checkRollNo = registrationNumber.substring(7, 10);

            if (checkvalid_lastThreenumber(checkRollNo)) {
            
                    k = k + 1;
            
            }

            if (k == 3) {
                count++;
            }
        }

        return count;
    }

    public int getValidRegistrationsCount2(String[] registration) {

        if (registration == null || registration.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < registration.length; i++) {

            if (registration[i] == null || registration[i].length() == 0 || registration[i].length() != 10) {
                // Skip invalid registration and continue with the next one
                continue;
            }

            String registrationNumber = registration[i];

            int k = 0;

            // Check year
            String checkYear = registrationNumber.substring(0, 4);

            if (checkYear.matches("\\d{4}")) {
                int yy = Integer.parseInt(checkYear);

                if (yy >= 2000 && yy <= 2024) {
                    k = k + 1;
                }
            }

            // Check branch
            String checkBranch = registrationNumber.substring(4, 7);

            if (checkBranch.equals("BIT") || checkBranch.equals("BME") || checkBranch.equals("BCS") || checkBranch.equals("BCH")) {
                k = k + 1;
            }

            // Check roll number
            String checkRollNo = registrationNumber.substring(7, 10);

            if (checkvalid_lastThreenumber2(checkRollNo)) {
            
                    k = k + 1;
            
            }

            if (k == 3) {
                count++;
            }
        }

        return count;
    }
    public int getValidRegistrationsCount3(String[] registration) {

        if (registration == null || registration.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < registration.length; i++) {

            if (registration[i] == null || registration[i].length() == 0 || registration[i].length() != 10) {
                // Skip invalid registration and continue with the next one
                continue;
            }

            String registrationNumber = registration[i];

            int k = 0;

            // Check year
            String checkYear = registrationNumber.substring(0, 4);

            if (checkYear.matches("\\d{4}")) {
                int yy = Integer.parseInt(checkYear);

                if (yy >= 2000 && yy <= 2024) {
                    k = k + 1;
                }
            }

            // Check branch
            String checkBranch = registrationNumber.substring(4, 7);

            if (checkBranch.equals("BIT") || checkBranch.equals("BME") || checkBranch.equals("BCS") || checkBranch.equals("BCH")) {
                k = k + 1;
            }

            // Check roll number
            String checkRollNo = registrationNumber.substring(7, 10);

            if (checkvalid_lastThreenumber3(checkRollNo)) {
            
                    k = k + 1;
            
            }

            if (k == 3) {
                count++;
            }
        }

        return count;
    }

    public boolean checkvalid_lastThreenumber(String roll ){
        
        if (roll.matches("\\d{3}")) {
            int RollNo = Integer.parseInt(roll);

            if (RollNo >= 0 && RollNo <= 999) {
                return true;
            }
        }

        return false;
    }
    
    
  
    
    public boolean checkvalid_lastThreenumber2(String roll ){
         if (roll.matches("\\d{3}")) {
            int lastThree = Integer.parseInt(roll);
            if (lastThree <= 50) 
            {
                return true;
            }
         }
         
         
         return false;
      
    }
    
    public boolean checkvalid_lastThreenumber3(String roll ){
           String regNumber = roll;
            int sequenceNumber = 0;
            for (int j = regNumber.length() - 3; j < regNumber.length(); j++) 
            {
                char c = regNumber.charAt(j);
                if (Character.isDigit(c)) 
                {
                    sequenceNumber = sequenceNumber * 10 + Character.getNumericValue(c); 
                }
                
            }
            if (sequenceNumber <= 50) 
            {
                return true;
            }
            
            return false;

        }
        
      
    
    


    public long Generate_4digit_RandomNumber(){

		
        long currentTimeMillis = System.nanoTime();
           long fourDigitNumber = (currentTimeMillis % 9000)+1000;
           
           return fourDigitNumber;
       
    }
    public long Generate_3digit_RandomNumber(){
    
            
        long currentTimeMillis = System.nanoTime();
        
        long threeDigitNumber = currentTimeMillis % 1000;
           
           return threeDigitNumber;
       
    }
    
    public String Generate_string() {
        char arr[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    
        
    
        StringBuilder pass = new StringBuilder();
    
        for (int i = 0; i < 3; i++) {
            long currentTimeMillis = System.nanoTime();
    
           int charIndex = (int) (currentTimeMillis % 26);
            pass.append(arr[charIndex]);
        }
        return pass.toString();
    }
    
    
    public String GenerateRegistrationString() {
          
        long fourDigitNumber = Generate_4digit_RandomNumber();
    
        long threeDigitNumber = Generate_3digit_RandomNumber();
        
        String randomString = Generate_string();
    
        String registrationString = fourDigitNumber + randomString + threeDigitNumber;
        
        return registrationString;
    }
    

    public static void main(String[] args) {

        String arr[] = {"2022BIT022", "2144biy032","0908BIT02","2021BCH354", "2021BIT410", "1215244154", "", "dfsjfhjfhdjfh",null, "2023BCH352", "2008BCS564"};

        SY2022bit022 sy = new SY2022bit022();

        System.out.println(sy.getValidRegistrationsCount1(arr));
        String arr1[]=new String[10000];
        
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sy.GenerateRegistrationString();
        }
       for(int i=0;i<arr1.length;i++){
           System.out.print(arr1[i]+" ");
       }
       System.out.println("...................");
       System.out.println(sy.getValidRegistrationsCount1(arr1));
       

       /*Using System.nanoTime() method */
       long startTIme = System.nanoTime();
       sy. Generate_string();
       sy.Generate_3digit_RandomNumber();
       sy.Generate_4digit_RandomNumber();
       long endTime = System.nanoTime();
       long duration = endTime - startTIme;
       System.out.println("Time taken to generate numbers using nanoTime() method : "+ duration);
        
        
       //Calculating time for first approach.
        long startTIme1 = System.nanoTime();
        int isValid = sy.getValidRegistrationsCount1(arr1);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTIme1;
        System.out.println("Time taken to run first approach : "+ duration1);
        System.out.println("Last three digits are valid : "+ isValid);
        System.out.println("-------------------------------------------------------------------------------------");
        
        
        //Calculating time for second approach.
        long startTIme2 = System.nanoTime();
        int isValid1 = sy.getValidRegistrationsCount2(arr1);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTIme2;
        System.out.println("Time taken to run second approach : "+ duration2);
        System.out.println("Valid last three digits : "+ isValid1);

        System.out.println("-------------------------------------------------------------------------------------");
        //Calculating time for third approach.
        long startTIme3 = System.nanoTime();
        int isValid2 = sy.getValidRegistrationsCount3(arr1);
        long endTime3 = System.nanoTime();
        long duration3 = endTime3 - startTIme3;
        System.out.println("Time taken to run third approach : "+ duration3);
        System.out.println("Valid last three digits are : "+isValid2);
        

        
        
       
    }
}
