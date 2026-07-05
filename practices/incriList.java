class IncrList {
    public static IntList incrList(IntList L, int x) {
        if (L == null) {
            return L;
        }
        else {
            L.first += x;
            return incrList(L.rest, x);
        }
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        incrList(L, 5);
        System.out.println(L.getValue(0));
        System.out.println(L.getValue(1));
        System.out.println(L.getValue(2));
    }
}
