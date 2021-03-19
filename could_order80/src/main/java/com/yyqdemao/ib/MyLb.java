package com.yyqdemao.ib;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MyLb implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndInscrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= (2 << 30) - 1 ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("*******next" + next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstanceList) {
        int index = getAndInscrement() % serviceInstanceList.size();
        ServiceInstance serviceInstance = serviceInstanceList.get(index);
        return serviceInstance;
    }


}
