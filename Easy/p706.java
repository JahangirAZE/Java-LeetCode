class MyHashMap {

  private boolean[] keys;
  private int[] values;

  public MyHashMap() {
    this.keys = new boolean[1000001];
    this.values = new int[1000001];
  }
  
  public void put(int key, int value) {
    keys[key] = true;
    values[key] = value;
  }
  
  public int get(int key) {
    if (keys[key]) return values[key];
    else return -1;
  }
  
  public void remove(int key) {
    keys[key] = false;
  }
}
