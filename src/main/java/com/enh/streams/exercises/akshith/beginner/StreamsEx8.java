package com.enh.streams.exercises.akshith.beginner;

import java.util.stream.LongStream;

//    Parallel Streams:
public class StreamsEx8 {

    public static void main(String[] args) throws InterruptedException {
//    a. Compute the sum of a large list of integers using parallel streams for performance improvement.
//    b. Compare the performance of sequential and parallel stream operations on a large dataset.
        long startTime = System.currentTimeMillis();
        System.out.println(
//                LongStream.range(1, 1_000_000_000_00l)
                LongStream.range(1, 1_000_000_000_0L)
//                        .parallel() // comment & un-comment this, and see the difference
                        .sum()
        );
        long endTime = System.currentTimeMillis();
        
        float timeTaken = (endTime - startTime);
        System.out.println("Time taken by the stream to sum : " + timeTaken / 1000);
    }
}
