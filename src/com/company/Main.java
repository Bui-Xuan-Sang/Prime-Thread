package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization(10000);
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization(10000);
        Thread thread1 = new Thread(lazyPrimeFactorization);
        Thread thread2 = new Thread(optimizedPrimeFactorization);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
