/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.*;
/**
 *
 * @author Deepanshu
 */
public class ConseSeq 
{  
    
     
    public static void main(String[] args) 
    {   
        int i,n,y=0,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(i=0;i<n-1;i++)
        {
            if((a[i]+1)==a[i+1])
                c++;
            else
                c=1;
            
            if(y<c)
            y=c;
        }
        System.out.println(y+1);
        
    }
    
}
