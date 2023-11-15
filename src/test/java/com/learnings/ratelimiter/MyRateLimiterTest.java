package com.learnings.ratelimiter;

import com.google.common.util.concurrent.RateLimiter;
import org.junit.Test;

import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyRateLimiterTest {

    RateLimiter rateLimiter = RateLimiter.create(2);

    @Test
    public void givenLimitedResource_whenRequestOnce_thenShouldPermitWithoutBlocking() {
        // given
        RateLimiter rateLimiter = RateLimiter.create(100);

        // when
        long startTime = ZonedDateTime.now().getSecond();
        rateLimiter.acquire(100);
        doSomeLimitedOperation();
        long elapsedTimeSeconds = ZonedDateTime.now().getSecond() - startTime;

        // then
        assertTrue(elapsedTimeSeconds <= 1);
    }


    @Test
    public void givenLimitedResource_whenTryAcquire_shouldNotBlockIndefinitely() {
        // given
        RateLimiter rateLimiter = RateLimiter.create(10);

        // when
        rateLimiter.acquire();
        boolean result = rateLimiter.tryAcquire(10, 10, TimeUnit.MILLISECONDS);

        // then
        assertFalse(result);
    }

    /**
     * acquire 10 permits within 1 sec
     * Fails if more than 10 permits acquire in 1 sec
     */
    @Test
    public void givenLimitedResource_whenTryAcquire_shouldNotBlockIndefinitely1() {
        // given
        RateLimiter rateLimiter = RateLimiter.create(50);

        // when
        rateLimiter.acquire(50);
        //rateLimiter.acquire();
        boolean result = rateLimiter.tryAcquire(1, 1000, TimeUnit.MILLISECONDS);

        // then
        assertFalse(result);
    }

    /**
     * Acquiring Permits With a Timeout
     * The RateLimiter API has also a very useful acquire() method that accepts a timeout and TimeUnit as arguments.
     *
     * Calling this method when there are no available permits will cause it to wait for specified time and then time out – if there are not enough available permits within the timeout.
     *
     * When there are no available permits within the given timeout, it returns false. If an acquire() succeeds, it returns true:
     */
    @Test
    public void givenLimitedResource_whenTryAcquire_shouldNotBlockIndefinitely_new() throws InterruptedException {
        // given
        //RateLimiter rateLimiter = RateLimiter.create(1);

        RateLimiter rateLimiter = RateLimiter.create(1);

        // when
        System.out.println(rateLimiter.tryAcquire());
        Thread.sleep(1000);
        System.out.println(rateLimiter.tryAcquire());
        Thread.sleep(1000);
        System.out.println(rateLimiter.tryAcquire());
        Thread.sleep(1000);
        System.out.println(rateLimiter.tryAcquire());
        Thread.sleep(1);
        System.out.println(rateLimiter.tryAcquire());
        System.out.println(rateLimiter.tryAcquire(1, 1, TimeUnit.MILLISECONDS));
        System.out.println(rateLimiter.tryAcquire(1, 1, TimeUnit.MILLISECONDS));
        System.out.println(rateLimiter.tryAcquire(1, 1, TimeUnit.MILLISECONDS));
        System.out.println(rateLimiter.tryAcquire(1, 1, TimeUnit.MILLISECONDS));
        System.out.println(rateLimiter.tryAcquire(1, 1, TimeUnit.MILLISECONDS));
        System.out.println(rateLimiter.tryAcquire(1, 1, TimeUnit.MILLISECONDS));
        System.out.println(rateLimiter.tryAcquire(1, 1, TimeUnit.MILLISECONDS));
        System.out.println(rateLimiter.tryAcquire(1, 1, TimeUnit.MILLISECONDS));
        System.out.println(rateLimiter.tryAcquire(1, 1, TimeUnit.MILLISECONDS));
        System.out.println(rateLimiter.tryAcquire(1, 1, TimeUnit.MILLISECONDS));
        System.out.println(rateLimiter.acquire(1));
        System.out.println(rateLimiter.acquire(1));
        System.out.println(rateLimiter.acquire(1));
        System.out.println(rateLimiter.acquire(1));
        System.out.println(rateLimiter.acquire(1));
        System.out.println(rateLimiter.acquire(1));
        System.out.println(rateLimiter.acquire(1));
        System.out.println(rateLimiter.acquire(1));
        System.out.println(rateLimiter.tryAcquire(105, 1, TimeUnit.MILLISECONDS));

        //boolean result = rateLimiter.tryAcquire(105, 1, TimeUnit.MILLISECONDS);

        // then
        //assertFalse(result);
    }

    public static void doSomeLimitedOperation() {
        System.out.println("this is doSomeLimitedOperation....");
    }

}
