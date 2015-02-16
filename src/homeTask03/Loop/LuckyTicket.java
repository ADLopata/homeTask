package homeTask03.Loop;


public class LuckyTicket {
    public static void main(String args[])
    {
        int c=-1;
        for (int x1=0;x1<10;x1++)
            for (int x2=0;x2<10;x2++)
                for (int x3=0;x3<10;x3++)
                    for (int x4=0;x4<10;x4++)
                        for (int x5=0;x5<10;x5++)
                            for (int x6=0;x6<10;x6++)
                                if (x1+x2+x3==x4+x5+x6){
                                    c++;
                                }
        System.out.print(c);
    }
}
