package com.example.BackToTheFuture;

import java.net.HttpURLConnection;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Rascunho {

    private static final ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(ZonedDateTime.now() +": Iniciando processamento");
        GerarNumero gerarNumero = new GerarNumero();
        ZonedDateTime time = ZonedDateTime.now();

        Future<Integer> future = executorService.submit(gerarNumero);

        while (!future.isDone()){
            System.out.println(ZonedDateTime.now() +":  em processamento");
            Thread.sleep(1);

            if(time.plus(Duration.ofSeconds(2)).isBefore(ZonedDateTime.now())){
                future.cancel(true);
                System.out.println("Timeout de 2s");
            }
            // if duracao > 3s executorService.shutdown();
        }

        System.out.println(ZonedDateTime.now() +" processamento concluido");

        if(!future.isCancelled()) {
            System.out.println("gerado numero " + future.get());
        }

        executorService.shutdown();

    }

}
