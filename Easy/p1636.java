class Solution {

  public class Node implements Comparable {
      
    private final int value;
    private final int frequency;

    Node (int value, int frequency) {
      this.value = value;
      this.frequency = frequency;
    }

    public int getFrequency() {
      return this.frequency;
    }

    public int getValue() {
      return this.value;
    }

    @Override
    public int compareTo(Object o) {
      if (o instanceof Node) 
      {
        Node other = (Node) o;
        if (this.frequency == other.frequency) return -Integer.compare(this.value, other.value);
        return Integer.compare(this.frequency, other.frequency);
      }
      return 0;
    }
  }

  public int[] frequencySort(int[] A) {
    int[] count = new int[201];
    for (int i : A) 
    {
      count[i + 100]++;
    }

    List<Node> list = new ArrayList<>();
    for (int i = 0; i < 201; i++) 
    {
      if (count[i] > 0) list.add(new Node(i - 100, count[i]));
    }
    Collections.sort(list);

    int[] result = new int[A.length];
    int i = 0;
    for (Node node : list)
    {
      for (int j = 0; j < node.getFrequency(); j++)
      {
        result[i] = node.getValue();
        i++;
      }
    }
    return result;
  }
}
