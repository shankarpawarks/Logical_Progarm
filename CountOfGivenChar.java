/* 
	LOGICAL PROGRAM ON STRING FOR TO COUNT GIVEN CHARACTER IN THE STRING 
*/

class CountOfGivenChar 
{
	public static void main(String[] args) 
	{

		String str="shankar pawar";
		char ch[]=str.toCharArray();
		char find='a';
		int count=0;

		for(int i=0;i<ch.length;i++){
			if(ch[i]==find){
				count++;
			}	
		}

		System.out.println("Hello World!"+count);
	}
}
