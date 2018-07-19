package com.hand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int i,j,n,m,x;
        n=0;m=0;x=0;
        for(i=101;i<=200;i++){
            for(j=1;j<=i;j++){
                n=i%j;
                if(n==0)  { m=m+1; }
            }
            if(m==2){System.out.print(i+" "); x=x+1;}
            m=0;
        }
        System.out.println();
        System.out.println("101~200之間总共有"+x+"個素数");
    }
}

