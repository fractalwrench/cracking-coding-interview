package co.uk.fractalwrench.cci.ch15;

public class Chapter15Question1 {

    /*
     * Question: what is the difference between a thread and a process?
     *
     * An Operating System can have many processes. Each process can have many threads.
     *
     * A process cannot share memory with other processes and usually needs to perform IPC (which is expensive)
     * to alter the behaviour of another process.
     *
     * A thread has access to all the heap memory in its process and therefore multiple threads can access the same
     * variables - which can lead to interesting behaviour such as data races and deadlock if this occurs concurrently.
     * Each thread is allocated its own stack memory - confining variables to within a function for example
     * help contribute to making functions thread safe.
     */

}
