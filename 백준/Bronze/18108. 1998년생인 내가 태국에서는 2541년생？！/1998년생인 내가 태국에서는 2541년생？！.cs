namespace baekjoon;
class Program
{
    static void Main(string[] args)
    {

        // 불기
        int a = 2541;
        int b = 1998;
        int c = a - b;

        string input = Console.ReadLine();
        int y = int.Parse(input);
        Console.WriteLine(y - c);    

    }
}