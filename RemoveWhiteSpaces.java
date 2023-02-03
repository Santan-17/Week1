package programs;

public class RemoveWhiteSpaces {
	
		public static void main(String[] args)
		{
			String str1 = "Hello	 How are you  ";
			String str2 = "J   ava  pro     gramming";
			// Call the replaceAll() method
			str1 = str1.replaceAll("\\s", "");
			str2 = str2.replaceAll("\\s", "");
			System.out.println(str1);
		    System.out.println(str2);
		
	}
}


