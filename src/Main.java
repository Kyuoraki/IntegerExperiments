public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(5059191));
    }

    public static Integer sumDigits(Integer number)
    {
        String summa = number.toString();
        int b = 0;
        for (int i = 0; i < summa.length(); i++ )
        {
            String s = String.valueOf(summa.charAt(i));
            b += Integer.parseInt(s);
        }
        return b;
    }
}

