
class SY2022bit022{

    public int getValidRegistrationsCount(String[] registration) {

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

            if (checkRollNo.matches("\\d{3}")) {
                int RollNo = Integer.parseInt(checkRollNo);

                if (RollNo >= 0 && RollNo <= 999) {
                    k = k + 1;
                }
            }

            if (k == 3) {
                count++;
            }
        }

        return count;
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

        //System.out.println(sy.getValidRegistrationsCount(arr1));
        String arr1[]=new String[100];
        
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sy.GenerateRegistrationString();
        }
       for(int i=0;i<arr1.length;i++){
           System.out.print(arr1[i]+" ");
       }
       System.out.println("...................");
       System.out.println(sy.getValidRegistrationsCount(arr1));
       

       
       long startTIme = System.nanoTime();
       sy. Generate_string();
       sy.Generate_3digit_RandomNumber();
       sy.Generate_4digit_RandomNumber();
       long endTime = System.nanoTime();
       long duration = endTime - startTIme;
       System.out.println("Time taken to generate numbers using nanoTime() method : "+ duration);
        
        
       
    }
}
