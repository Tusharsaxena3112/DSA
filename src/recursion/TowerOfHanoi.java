package recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.tower(3, 'A', 'B', 'C');
    }

    private void tower(int n, char beg, char aux, char end) {
        if (n >= 1) {
            tower(n - 1, beg, end, aux);
            System.out.printf("disk moved from %c to %c\n", beg, end);
            tower(n - 1, aux, beg, end);
            //System.out.printf("disk moved from %c to %c\n",beg,end);
        }
//        else{
//            System.out.printf("Disk moved from %c to %c\n",beg,end);
//        }
    }
}
