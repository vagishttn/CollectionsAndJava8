import java.util.Stack;

public class SpecialStack extends Stack<Integer> {
    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int element) {

        if (isEmpty()) {
            super.push(element);
            minStack.push(element);
        } else {
            super.push(element);
            int minEle = minStack.peek();
            if (element < minEle)
                minStack.push(element);
            else
                minStack.push(minEle);
        }
    }

    public Integer pop() {
        Integer poppedElement = null;
        if (!isEmpty())
            poppedElement = super.pop();
        if (minStack.isEmpty() == false)
            minStack.pop();
        return poppedElement;
    }

    public Integer getMin() {
        if (isEmpty())
            return null;
        return minStack.peek();
    }

    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack();
        specialStack.push(21);
        specialStack.push(9);
        specialStack.push(590);
        if (specialStack.getMin() != null)
            System.out.println("Minimum element" + specialStack.getMin());
        specialStack.pop();
        specialStack.pop();
        specialStack.push(2);
        specialStack.push(70);
        System.out.println("Minimum element " + specialStack.getMin());

    }


}
