public class Principal {
    public static void main(String[] args) {

        //int[] valores = {10,5,6,2,10,2};
        int res = somar(10,5,6,2,10,2);

        System.out.println(res);

    }

    public static int somar(int... n) {
        int res = 0;
        for(int v: n) {
            res+=v;
        }
        return res;
    }
}
