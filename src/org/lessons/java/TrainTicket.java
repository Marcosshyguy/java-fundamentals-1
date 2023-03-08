package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    /*Consegna: Il programma dovrà chiedere all’utente il numero (intero) di chilometri che vuole percorrere e l’età del passeggero (numero intero). Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
    il prezzo del biglietto è definito in base ai km (0.21 € al km)
    va applicato uno sconto del 20% per i minorenni
    va applicato uno sconto del 40% per gli over 65
    Per chiedere informazioni all’utente sarà necessario usare la classe java.util.Scanner, come visto in classe stamattina.
            Bonus: formattare il risultato con un numero limitato di decimali utilizzando la classe DecimalFormat*/
    public static void main(String[] args) {
        double ticketPricePerKm = 0.21;
        int minorDiscount = 20;
        int seniorDiscount = 40;
        int age;
        int km;

        Scanner scan = new Scanner(System.in);

        System.out.print("Insert your age: ");
        age = Integer.parseInt(scan.nextLine());

        System.out.print("Insert the travel length: ");
        km = Integer.parseInt(scan.nextLine());

        double ticketPrice = (double)km * ticketPricePerKm;
        double discountPrice;


    if (age < 18){
        discountPrice = (ticketPrice * 100 ) / minorDiscount;
        System.out.println("Your ticket price is: " + discountPrice + " ");
    } else if (age >= 65) {
        discountPrice = (ticketPrice * 100 ) / seniorDiscount;
        System.out.println("Your ticket price is: " + discountPrice + " $" );
    }else {
        System.out.println("Your ticket price is: " + ticketPrice + " $");
    }


        //System.out.println(ticketPrice);
        //System.out.println(discountPrice);


    }
}
