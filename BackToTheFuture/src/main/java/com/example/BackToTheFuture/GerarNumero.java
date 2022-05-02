package com.example.BackToTheFuture;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.Callable;

public class GerarNumero implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Random aleatorio = new Random();
        Thread.sleep(4000);
        return aleatorio.nextInt();
    }
}
