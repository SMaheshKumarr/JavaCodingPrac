package practice;
public class PrintFirstLetterOfString
{
    public static void main (String[] args)
    {
        String str = "Hello I am Japneet";
        returnFirstAlphabet(str);
    }

    private static void returnFirstAlphabet(String string)
    {
        String word = "";
        String[] split = string.split(" ");

        for(int i=0; i<split.length; i++)
        {
        	 System.out.print(split[i].charAt(0));

        }
    }
}