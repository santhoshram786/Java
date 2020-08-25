package com.java.newqa;

public class HexToDecimalExample3{    
public static int getDecimal(String hex){  
    String digits = "0123456789ABCDEF";  
             hex = hex.toUpperCase();  
             int val = 0;  
             for (int i = 0; i < hex.length(); i++)  
             {  
                 char c = hex.charAt(i);  
                 int d = digits.indexOf(c);  
                 val = 16*val + d;  
             }  
             return val;  
}  
public static int getOctatoDecimal(int octal){    
    //Declaring variable to store decimal number  
    int decimal = 0;    
    //Declaring variable to use in power  
    int n = 0;    
    //writing logic   
    while(true){    
      if(octal == 0){    
        break;    
      } else {    
          int temp = octal%10;    
          decimal += temp*Math.pow(8, n);    
          octal = octal/10;    
          n++;    
       }    
    }    
    return decimal;    
}   

public static int getBintoDecimal(int bin){    
    //Declaring variable to store decimal number  
    int decimal = 0;    
    //Declaring variable to use in power  
    int n = 0;    
    //writing logic   
    while(true){    
      if(bin == 0){    
        break;    
      } else {    
          int temp = bin%10;    
          decimal += temp*Math.pow(2, n);    
          bin = bin/10;    
          n++;    
       }    
    }    
    return decimal;    
}   
public static void main(String args[]){    
System.out.println("Decimal of a is: "+getDecimal("a"));  
System.out.println("Decimal of f is: "+getDecimal("f"));  
System.out.println("Decimal of 121 is: "+getDecimal("121"));  

System.out.println(getBintoDecimal(100));

System.out.println(getOctatoDecimal(9));
}}    