package practice;
public class ChangeSpecialCharacter
{
    public static void main (String[] args)
    {
        String str = "Hello @$Japneet$";

        System.out.print(printDifferentSpeicalCharacter(str));
    }

    private static String printDifferentSpeicalCharacter(String str)
    {
        return str.replaceAll("[^0-9,a-z,A-Z]", " ");
    }
}
