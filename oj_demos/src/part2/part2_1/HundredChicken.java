package part2.part2_1;

/*
    用小于等于100元去买100只鸡，大鸡5元/只，小鸡3元/只，还有1/3元每只的一种小鸡，分别
    记为x只、y只和z只。编程求解x, y, z所有可能的解。
*/
public class HundredChicken {
    public static void main(String[] args) {
        int x,y,z;
        //公鸡最大上限20，所以之前100是错的
        for(x = 0 ; x <= 20 ; x++) {
            //母鸡最大上限33
            for(y = 0; y <= 33; y++) {
                z = 100 - x - y ;
                //小鸡要同时满足整除
                if(x*5+y*3+z/3==100  && z %3 == 0) {
                    System.out.println("公鸡："+x+"只"+"\t"+"母鸡： "+y+"只"+"\t"+"小鸡"+z+"只");
                }
            }
        }

    }
}
