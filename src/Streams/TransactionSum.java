package Streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Long.sum;

class Transaction{
    String date;
    Integer amount;

    public Transaction(String date, Integer amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
public class TransactionSum {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );
        Map<String,Integer> hashMap=new HashMap<>();
       hashMap=transactions.stream().collect(Collectors.groupingBy(Transaction::getDate,
               Collectors.summingInt(Transaction::getAmount)));//Collectors provide many utility functions
        System.out.println(hashMap);
    }
}
