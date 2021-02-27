/*
	LOGIC-1
	PROGRAM FOR REVERSE WORDS IN THE GIVEN STRING 
*/
class RevereseWords 
{
	public static void main(String[] args) 
	{
		String str="how are you man?";

		String astr[]=str.split("\\s");

		for(int i=astr.length-1;i>=0;i--){
			System.out.print(astr[i]+" ");	
		}
		
	}
}
