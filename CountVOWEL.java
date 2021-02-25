/*LOGICAL PRORAM FOR COUNT VOWEL IN THE GIVEN STRING */

class CountVOWEL 
{
	public static void main(String[] args) 
	{
		String str="how are you?";
		char ch[]=str.toCharArray();
		int count=0;
		
		
		
		
		for(char c:ch){
			switch(c){
				    case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
					count++;	
					break;
					
				 
			}
		}
		System.out.println("COUNT OF VOWEL IS::-"+count);
	}
}
