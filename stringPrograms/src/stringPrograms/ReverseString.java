package stringPrograms;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1="sonali";
		char[] s={'s','o','n','a','l'};//new char[5];
		char t;
		//System.out.println(s1);
		int l=s.length-1;
		for(int i=0;i<(s.length/2)-1;i++){
			t = s[i];
			s[i]=s[l];
			s[l--]=t;
			
		}
		StringBuffer sb=new StringBuffer();
		for(int j=s1.length()-1;j>=0;j--)
		{
			sb.append(s1.charAt(j));
			
		}
		
			//System.out.println(sb);
		//System.out.println(Arrays.toString(s));

			
			//reverse word in string
			String s2="sonali hushar ahe";
			int st=0;
			StringBuffer sc = new StringBuffer();
			StringBuffer sd = new StringBuffer();
			String temp=new String();
			for(int k=0;k<=s2.length()-1;k++)
			{
				int m=0;
				//System.out.println(k +""+ s2.charAt(k));
				if(k<=s2.length()-2)
				{
					m = s2.charAt(k+1);
				}
				if(m==32|| k==(s2.length()-1))
				{		
					temp = s2.substring(st, k+1);
					//System.out.println("  :"+temp);
					for(int j=temp.length()-1;j>=0;j--)
					{
						sd.append(temp.charAt(j));
						
					}
					sc.append(sd);
					//System.out.println(sd);
					sd.delete(0, sd.length());
					st=k+2;
				}
				else if(s2.charAt(k)==32)
				{
					sc.append(s2.charAt(k));
				}
			}
			System.out.println(sc);
			
			String aa = new String("hi hello hey");
			String ab[]=aa.split(" ");

			//System.out.println(Arrays.toString(ab));
			for(int z=0;z<ab.length;z++)
			{
				System.out.println(z +" "+ab[z]+" "+ab[z].length());
				//System.out.print(new StringBuffer(ab[z]).reverse()+" ");
			}
			
	}

}
