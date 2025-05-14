//https://www.geeksforgeeks.org/problems/queue-using-stack/1
class Queue {
    Stack<Integer> input = new Stack<Integer>();
    Stack<Integer> output = new Stack<Integer>();

    int dequeue() {
        if (input.isEmpty()) {
            return -1;
        }
        return input.pop();
        
    }

    void enqueue(int x) {
       
       while(!input.isEmpty()){
            output.push(input.pop());
          
       }
        input.push(x);
        while(!output.isEmpty()){
            input.push(output.pop());
        }
    }
}
