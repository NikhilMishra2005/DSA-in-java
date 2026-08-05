class MyHashMap {
    private static class Pair {
        int key;
        int value;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 769;
    private LinkedList<Pair>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        for (Pair pair : buckets[index]) {
            if (pair.key == key) {
                pair.value = value;
                return;
            }
        }
        buckets[index].add(new Pair(key, value));
    }

    public int get(int key) {
        int index = hash(key);
        for (Pair pair : buckets[index]) {
            if (pair.key == key) {
                return pair.value;
            }
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Pair toRemove = null;
        for (Pair pair : buckets[index]) {
            if (pair.key == key) {
                toRemove = pair;
                break;
            }
        }
        if (toRemove != null) {
            buckets[index].remove(toRemove);
        }
    }
}