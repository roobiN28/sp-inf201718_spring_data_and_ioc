package com.cgm.academy.address;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;

@SpringBootTest
@ImportResource("classpath:test-config.xml")
public class AddressTest {

    @Test
    public void shouldFindAllAddresses(){
        Assert.assertTrue(true);
    }
}
