//implementing queue using two stacks
class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> s1=new Stack<>();//1st stack
    Stack<Integer> s2=new Stack<>();//2nd stack
    
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);//adding all the items to first stack
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {// for poping first we all the s1 element to stack 2 wxcept the last one
        int l=s1.size();
        for(int i=1;i<l;i++)
            s2.push(s1.pop());
        int temp=s1.pop();
        l=s2.size();
        for(int i=1;i<=l;i++)
            s1.push(s2.pop());//pushing back to the stack for havong the same order in element because stack reverse the items 
        return temp;
    }
    
    /** Get the front element. */
    public int peek() {
         int l=s1.size();
        for(int i=1;i<l;i++)
            s2.push(s1.pop());
        int temp=s1.peek();
        s2.push(s1.pop());//same as of the pop operation
        l=s2.size();
        for(int i=1;i<=l;i++)
            s1.push(s2.pop());
        return temp;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */




 // little bit optimised 




 class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int temp=0;
        if(s2.isEmpty())//here i add all the items to stack one and checks if the s2 is empty the add all the elements to stack 2
        {
            int l=s1.size();
            for(int i=1;i<l;i++)
                s2.push(s1.pop());
            temp=s1.pop();
        }
         else
            temp=s2.pop();
       return temp;
    }
    
    /** Get the front element. */
    public int peek() {
         int temp=0;
        if(s2.isEmpty())
        {
            int l=s1.size();
            for(int i=1;i<l;i++)
                s2.push(s1.pop());
            temp=s1.peek();
            s2.push(s1.pop());
        }
        else
            temp=s2.peek();   
       return temp;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(s1.isEmpty() && s2.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */