// here i used two queues to implement a single stack
class MyStack {

    /** Initialize your data structure here. */
    Queue<Integer> q1=new LinkedList<>();//first queue
    Queue<Integer> q2=new LinkedList<>();//second queue
     Queue<Integer> qtemp=null;//temporary pointer for swaping the values of queue
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);//add the value in first queue
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int l=q1.size();//for poping i use it transfer all of the data of q1 to q2 till (n-1) of queue
        for(int i=1;i<l;i++)
            q2.add(q1.remove());
        int temp=q1.remove();//store the nth value of the q1 
        qtemp=q2;
        q2=q1;//swaping the pointers
        q1=qtemp;
        return temp;//return the n-1 value to the function
    }
    
    /** Get the top element. */
    public int top() {// same for the top opertaion also
        int l=q1.size();
        for(int i=1;i<l;i++)
            q2.add(q1.remove());
        int temp=q1.peek();
        q2.add(q1.remove());
        qtemp=q2;
        q2=q1;
        q1=qtemp;
        return temp;
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

 //using a single queue whole process is same but i doing all the operation in q1 only

 class MyStack {

    /** Initialize your data structure here. */
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
     Queue<Integer> qtemp=null;
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int l=q1.size();
        for(int i=1;i<l;i++)
            q1.add(q1.remove());
        int temp=q1.remove();
        return temp;
    }
    
    /** Get the top element. */
    public int top() {
        int l=q1.size();
        for(int i=1;i<l;i++)
            q1.add(q1.remove());
        int temp=q1.peek();
        q1.add(q1.remove());
        return temp;
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */