package dec27;

public class PerformanceTest {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        StringBuffer sb1 = new StringBuffer("tops");

        for(int i=0;i<1000000;i++){

            sb1.append("technology");

        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);

        //////////////////////////////////////////////////////////////////////////////////

        start = System.currentTimeMillis();

        StringBuilder sb2 = new StringBuilder("tops");

        for(int i=0;i<1000000;i++){

            sb2.append("technology");

        }
        end = System.currentTimeMillis();

        System.out.println(end-start);



    }
}
