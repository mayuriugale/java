class Arithematic
{
    public int no1;
    public int no2;

        public Arithematic()
        {
             this.no1 = 0;
             this.no2 = 0;
           
        }
        public Arithematic(int i, int j)                      //4 byte
        {
            this.no1 = i;
            this.no2 = j;
        }
        public int Addition()
        {
            int Ans = 0;
            Ans = this.no1 + this.no2;
            return Ans;
        }
        public int substraction()
        {
            int Ans = 0;
            Ans = this.no1 - this.no2;
            return Ans;
        }

}
class OOPxx
{

    public static void main(String A[])
    {
        Arithematic aobj1 = new Arithematic(21,10);
        int Result = 0; 

        Result = aobj1.Addition();
        System.out.println("Addition is :"+Result);

        Result = aobj1.substraction();
        System.out.println("Substraction is :"+Result);



    }
}