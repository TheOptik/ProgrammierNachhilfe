package tcp.streams.stringpayload;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TcpServerWithStringPayloadTest {

    List<Integer> someEvenNumbers;


    @BeforeEach
    void init(){
        System.out.println("init");
        //some initialization
        someEvenNumbers = List.of(2, 4, 18);
    }


    @Test
    void testThatOneIsNotAPrimeNumber() {
        System.out.println("testThatOneIsNotAPrimeNumber");
        int input = 1;

        boolean isOnePrime = TcpServerWithStringPayload.isNumberPrime(input);

        assertEquals(false,isOnePrime);
    }

    @Test
    void testThatEvenNumbersAreNotPrime() {
        System.out.println("testThatEvenNumbersAreNotPrime");

        List<Boolean> results = someEvenNumbers.stream().map(i -> TcpServerWithStringPayload.isNumberPrime(i)).toList();


        assertEquals(List.of(false,false,false), results);
    }
}