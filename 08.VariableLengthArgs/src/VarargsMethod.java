public class VarargsMethod {
    void add(int ... nums)
    {
        int sum = 0;
        for(int x: nums)
        {
            sum+=x;
        }
        System.out.println(sum);
    }
}
