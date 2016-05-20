public static void main(String[] args)
{
    int res = fibonacci(1,2);
	System.out.println("The sum of even Fibonacci numbers less than 4 million = %d", res)
}

int fibonacci(int i1, int i2)
{
    int result = 0;
    result += i2;
    int sum = i1 + i2;
    while (sum <= 4000000)
    {
	i1 = i2;
        i2 = sum;
	sum = i1 + i2;
	if(sum % 2 == 0)
            result += sum;
    }
    return result;
}
