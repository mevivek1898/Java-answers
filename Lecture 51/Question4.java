Read the code below:
void waitForSignal() throws InterruptedException {
    Object obj = new Object();
    synchronized (Thread.currentThread()) {
        obj.wait();
        obj.notify();
     }
}
Which statement is true?


Answer

The code throws IllegalMonitorStateException.