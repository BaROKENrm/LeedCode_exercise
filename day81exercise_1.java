package day81;

class Node{
    int key;
    int val;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}
class MyHashMap {
    int len = 100010;
    Node[] nodes = new Node[len];
    /** Initialize your data structure here. */
    public MyHashMap() {

    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = hash(key);
        Node newNode = new Node(key,value);

        if(nodes[index] == null){
            nodes[index] = newNode;
        }
        else{
            Node cur = nodes[index];
            while(cur != null){
                if(cur.key == key && cur.val == value){
                    return;
                }
                cur = cur.next;
            }
            newNode.next = nodes[index];
            nodes[index] = newNode;
        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = hash(key);
        Node cur = nodes[index];
        while(cur != null){
            if(cur.key == key){
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = hash(key);

        while(nodes[index] != null && nodes[index].key == key){
            nodes[index] = nodes[index].next;
        }
        if(nodes[index] == null){
            return;
        }
        else{
            Node pre = nodes[index];
            Node cur = pre.next;
            while(cur != null){
                if(cur.key == key){
                    cur = cur.next;
                    pre.next = cur;
                }
            }
        }
    }

    public int hash(int key){
        return key % (len - 1);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */


