namespace baekjoon;
class Program
{
    static void Main(string[] args)
    {

        string inputA = Console.ReadLine(); // 첫번째 입력
        string inputB = Console.ReadLine(); // 두번째 입력

        int a = int.Parse(inputA); // 입력 값 stinrg을 int로 형변환
        int b = int.Parse(inputB); // 입력 값 stinrg을 int로 형변환
        int printA = a * ((b % 100) % 10);
        int printB = a * ((b % 100) / 10);
        int printC = a * (b / 100);
        int AmultipleB = a*b; // 전체 곲

        Console.WriteLine(printA);
        Console.WriteLine(printB);
        Console.WriteLine(printC);
        Console.WriteLine(AmultipleB);

    }
}