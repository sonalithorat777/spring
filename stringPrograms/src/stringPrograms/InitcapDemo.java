package stringPrograms;

public class InitcapDemo {

	public static void main(String[] args) {
	
		String s1= "sonali thorat karad";
		StringBuffer sb=new StringBuffer();
		Character c=null;
		for(int i=0;i<s1.length();i++){
		 c=s1.charAt(i);
			if(i==0){
				if(s1.charAt(i)>90){
					c=(char) (s1.charAt(i)-32);
				}
			}
			else if(s1.charAt(i)>90 && s1.charAt(i-1)==32)
			{
				c=(char) (s1.charAt(i)-32);
			
			
			}
			/*else if(s1.charAt(i)<90 && s1.charAt(i)!=32){
				c=(char)(s1.charAt(i)+32);
			
			}*/
			sb.append(c);
		}
		
		System.out.println(sb);
		

	}

	}
