public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static String capVowelsLowRest (String string) {
        String newStr="";
        for (int i=0; i<string.length(); i++){
            if (string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u'){
                    newStr=newStr+(char)(string.charAt(i)-32);
            }else{
                if ((string.charAt(i)>=65 && string.charAt(i)<=90) && (string.charAt(i)!='A'&& string.charAt(i)!='E'&& string.charAt(i)!='I'&& string.charAt(i)!='O'&& string.charAt(i)!='U') ){
                    newStr=newStr+(char)(string.charAt(i)+32);
                }else{
                    newStr=newStr+string.charAt(i);
                }
            } 
        }
        return newStr;
    }

   public static String camelCase (String string) {
        String newStr="";
        String str="";
        String finalStr= "";
        int i=0;
        int start = 0;
        while (string.charAt(start) == ' ' && start < string.length()) {
            start++;
        }

        int end = string.length() - 1;
        while (end >= 0 && string.charAt(end) == ' ') {
            end--;
        }
       
         str += string.substring(start, end + 1);
         

        while ( i<str.length() && str.charAt(i)!=' '){ 
            if (str.charAt(i)<=90 && str.charAt(i)>=65){
                newStr=newStr+(char)(str.charAt(i)+32);
            }else { 
                newStr=newStr+str.charAt(i);
            }
            i++;
        }
        while (i<str.length()){ 
            if (str.charAt(i-1)==' '){ 
                if (str.charAt(i)<=122 && str.charAt(i)>=97){
                    newStr=newStr+(char)(str.charAt(i)-32);
                }else { 
                    newStr=newStr+str.charAt(i);
                }
            }else{ 
                if (str.charAt(i)<=90 && str.charAt(i)>=65){
                    newStr=newStr+ (char)(str.charAt(i)+32);
                }else { 
                    newStr=newStr+str.charAt(i);
                }
            }
            i++;
        }
        for (int j=0; j<newStr.length(); j++ ){ 
            if (newStr.charAt(j)!=' '){ 
                finalStr=finalStr+newStr.charAt(j);
            }
        }
        return finalStr;
    }

     
    public static int[] allIndexOf (String string, char chr) {
        int count=0;
        for (int i=0; i<string.length();i++){ 
            if (string.charAt(i)==chr){ 
                count++;
            }
        }
        int [] array= new int[count];
        count=0;

        for (int j=0; j<string.length();j++){ 
            if (string.charAt(j)==chr){
                array[count]=j;
                count++;
            }
        }

        
        return array;
    }
}
