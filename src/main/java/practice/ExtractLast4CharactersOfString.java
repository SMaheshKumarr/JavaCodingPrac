package practice;
public class ExtractLast4CharactersOfString
{
    public static void main (String[] args)
    {
        String str = "swiss";
        printLast4Chars(str);
    }

    private static void printLast4Chars(String str)
    {
        int size = str.length();
        System.out.println(size);
       
        for(int i = 1; i<size; i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}
