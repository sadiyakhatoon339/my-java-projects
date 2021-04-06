/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

/**
 *
 * @author DELL
 */
import java.io.*;
class abc
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int A[]=new int[20];
     
     int B[]=new int[20];
     int C[]=new int[20];
     int D[]=new int[20];
     int E[]=new int[20];
      int F[]=new int[20];
       int G[]=new int[20];
    int a,b,c,d,e,f,g,h,i,j,k,l=0,m,n,o,p,q=0,r,s,t,i2=0,i3=0,x=0;
     a=Integer.parseInt(br.readLine());
    for(b=0;b<a;b++)
    {
    A[b]=Integer.parseInt(br.readLine());
    while(b<3)
    {
      b=0;
      
      d=A[b]%10;
      B[b]=d;
      b++;
      A[b]=A[b]/10;
    }
      int min=0;
      int max=0;
      
      for(e=0;e<b;e++)
      {
       min=B[0];
        if(min>B[e])
          min=B[e];
      }
         
      for(e=0;e<b;e++)
      {
       max=B[0];
        if(max<B[e])
          max=B[e];
      }  
      
      f=max*11+min*7;
      g=0;
      int rev=0;
      while(g<2)
      {
        h=f%10;
        rev=rev*10+h;
        g++;
        f=f/10;
        
      } int rev2=0;
      for(i=0;i<a;i++)
      {
      while(rev>0)
      {
        int h2=rev%10;
        rev2=rev2*10+h2;
      
        rev=rev/10;
      }
      
       
      C[i]=rev2;
    }
    
  
     for(j=0;j<a;j++)
     {
     if(j%2==0)
     {
    
     D[i2]=C[j];
     i2++;
     }
     else
     {
      
     E[i3]=C[j];
     i3++;
     }
       for(k=0;k<i2;k++)
       {
      
       F[l]=D[k]*0xFFFF0000;
       l++;
         
       }
       for(m=0;m<l;m++)
       {
         for(n=m;n<l-1;n++)
         {
           if(F[m]==F[n])
              x++;
         }
       
     }
    
    for(p=0;p<i3;p++)
    {
     
      G[q]=E[p]*0xFFFF0000;
      q++;
    }
       for(r=0;r<q;r++)
         
       {
        for(s=r;s<q-1;s++)
        {
       if(G[r]==G[s])
         x=x+1;
        }}
     }
       System.out.println(+x);
       
       
       
       
       
       
       
       
    
    
  
}
}}

    