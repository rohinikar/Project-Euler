public class LargestPrimeFactor
{
    public static void main(String[] args)
    {
        int n = 6;
        int primeFactor = 2;
        boolean[] flags = new boolean[n+1];
        init(flags);
        flags[0] = false;
        flags[1] = false;
        
        while(primeFactor <= Math.sqrt(n))
        {
            crossFlags(flags, primeFactor);
            primeFactor = getNextPrime(flags, primeFactor);
            if(primeFactor == -1)
                break;
        }
        
        int max = 1;
        for(int i = 2; i < flags.length; i++)
        {
            if(flags[i])
            {
                if((n % i) == 0)
                    max = i;
            }
        }
        System.out.println("The largest prime factor = " + max);
    }

    static void init(boolean[] flags)
    {
        for(int i = 2; i < flags.length; i++)
        {
            flags[i] = true;
        }
    }

    static void crossFlags(boolean[] flags, int prime)
    {
        for(int i = (prime + prime); i < flags.length; i = i + prime)
        {
            flags[i] = false;
        }
    }

    static int getNextPrime(boolean[] flags, int prime)
    {
        for(int i = prime; i < flags.length; i++)
        {
            if(flags[i])
                return i;
        }
        return -1;
    }
}


        
