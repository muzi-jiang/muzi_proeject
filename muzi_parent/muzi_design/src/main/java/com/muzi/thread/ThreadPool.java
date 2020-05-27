package com.muzi.thread;

import java.util.concurrent.*;

public class ThreadPool {

    public static void main(String[] args) {
        int poolSize = Runtime.getRuntime().availableProcessors() * 2;
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(512);
        RejectedExecutionHandler policy = new ThreadPoolExecutor.DiscardPolicy();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(poolSize, poolSize,
                  0, TimeUnit.SECONDS,
                  queue,
                  policy);

        threadPoolExecutor.execute(() -> {

        });
    }

}
