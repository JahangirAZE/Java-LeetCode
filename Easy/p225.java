class MyStack
{
  private Queue<Integer> queue;
  
  public MyStack() 
  {
    queue = new LinkedList<>();
  }

  public void push (int x)
  {
    queue.add(x);
    for (int i = 0; i < queue.size() - 1; i++)
    {
      queue.add(queue.poll());
    }
  }

  public int pop ()
  {
    return queue.poll();
  }

  public int top ()
  {
    return queue.peek();
  }

  public boolean isEmpty ()
  {
    return queue.isEmpty();
  }
}
