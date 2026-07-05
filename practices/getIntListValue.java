class IntList {
    public int first;
    public IntList rest;

    public IntList (int first, IntList rest) {
        this.first = first;
        this.rest = rest;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        else {
            return 1 + rest.size();
        }
    }


    public int getValue(int n) {
        if (n == 0) {
            return first;
        }
        else {
            return rest.getValue(n - 1);
        }
    }
}

public class getIntListValue {
    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        System.out.println(L.size());
        System.out.println(L.getValue(2));
    }
}
