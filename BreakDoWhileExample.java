class BreakDoWhileExample 
{  
public static void main(String[] args) 
{  
    	int i=1;  
    	do{  
        if(i==5)
	{  
           i++;  
           break;//it will break the loop  
        }  
        System.out.println(i);  
        i++;  
        }while(i<=10);  
}  
}  