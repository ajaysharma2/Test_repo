package com.learnings.ratelimiter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AsyncCounterTest implements AsyncCounter.Listener{

  @Override
  public final void countingOver() {
    synchronized (this) {
      notify();
    }
  }

  @Test
  public void test() throws InterruptedException {
    var startTime = System.currentTimeMillis();
    var counter = new AsyncCounter(this);

    counter.startCounting();
    synchronized (this) {
      wait();
    }

    assertEquals(counter.get(), AsyncCounter.COUNT_TO);

    var totalTime = System.currentTimeMillis() - startTime;
    System.out.println("totalTime=" + totalTime);
  }
}
