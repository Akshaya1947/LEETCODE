typedef struct {
    int* queue1;
    int* queue2;
    int front;
    int size;
} MyStack;

// Initialize the stack
MyStack* myStackCreate() {
    MyStack* stack = (MyStack*)malloc(sizeof(MyStack));
    stack->queue1 = (int*)malloc(100 * sizeof(int)); // Assuming max size 100
    stack->queue2 = (int*)malloc(100 * sizeof(int));
    stack->size = 0;
    stack->front = -1;
    return stack;
}

// Push element onto stack
void myStackPush(MyStack* obj, int x) {
    obj->queue1[obj->size++] = x;
    obj->front = x;
}

// Remove and return top element
int myStackPop(MyStack* obj) {
    if (obj->size == 0) return -1; // Edge case: empty stack

    int newFront, popElement;
    int tempSize = obj->size;

    for (int i = 0; i < tempSize - 1; i++) {
        obj->queue2[i] = obj->queue1[i]; // Move elements except last one
        newFront = obj->queue1[i];
    }

    popElement = obj->queue1[tempSize - 1]; // Get last element
    obj->size--;

    // Swap queue1 and queue2
    int* temp = obj->queue1;
    obj->queue1 = obj->queue2;
    obj->queue2 = temp;

    obj->front = newFront; // Update front

    return popElement;
}

// Get top element
int myStackTop(MyStack* obj) {
    return obj->front;
}

// Check if stack is empty
bool myStackEmpty(MyStack* obj) {
    return obj->size == 0;
}

// Free memory
void myStackFree(MyStack* obj) {
    free(obj->queue1);
    free(obj->queue2);
    free(obj);
}


