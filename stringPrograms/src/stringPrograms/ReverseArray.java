package stringPrograms;

public class ReverseArray {

	public static void main(String[] args) {
		//reverse character array
		char[]c={'s','o','n','a','l','i'};
		char ch;
		int l=c.length-1;
		for(int i=0;i<=(c.length/2)-1;i++){
			ch=c[i];
			c[i]=c[l];
			c[l--]=ch;
			
			
		}
		System.out.println(c);
		
		//Reverse string using function
		String s="sumit";
		StringBuffer sb=new StringBuffer();
		sb.append(s);
		System.out.println(sb.reverse());
		
		//reverse string without using function
		
		String ss="bokya";
		StringBuffer sbb=new StringBuffer();
		String d;
		for(int j=ss.length()-1;j>=0;j--){
			
			sbb.append(ss.charAt(j));
			
		}
		System.out.println(sbb);
	}

}
