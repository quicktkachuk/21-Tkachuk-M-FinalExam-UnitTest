
//TODO: Calling 'add()' with a negative number will throw an exception "negatives not allowed"
//TODO: Numbers bigger than 1000 should be ignored
public class StringCalculator {

    public static int add(final String numbers)
    {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray)
        {
            if(Integer.parseInt(number.trim()) < 0)
            {
                System.out.println("Negatives not Allowed");
                throw new IllegalArgumentException();
            }
            if (!number.trim().isEmpty())
            {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }
}
