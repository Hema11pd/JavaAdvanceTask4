package JavaAdvanceTask4;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDs {
    Stack<Integer> stack;
    public StackDs()
    {
        stack = new Stack<>();
    }
    public void pushItems(int num)
    {
        stack.push(num);
        System.out.println("Items in the stack"+ stack);
    }
    public void popItems()
    {
        System.out.println("Removed element+"+stack.pop());
    }
    public void emptyCheck()
    {
        if(stack.isEmpty())
        {
            System.out.println("stack is empty");
        }
        else {
            System.out.println("Items in the stack"+stack);
        }
    }
  public static void main(String[] args)
  {
      StackDs Sd = new StackDs();
      Sd.pushItems(100);
      Sd.pushItems(120);
      Sd.popItems();
      Sd.emptyCheck();
      Sd.popItems();
      Sd.emptyCheck();



  }
}