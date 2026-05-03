package com.shahzadqadir.store.drivers;

import com.shahzadqadir.store.Artist;
import com.shahzadqadir.store.Book;
import com.shahzadqadir.store.CD;
import com.shahzadqadir.store.Item;

import java.util.Date;

public class InventoryDriver {
    public static void main(String[] args) {
        Item[] myInventory = new Item[50];
        myInventory[0] = new Book("Godzilla on Holiday", 24.95, 5,
                "Wesley Wynham-Price", "Ransom House", "Fiction");
        myInventory[1] = new Book("Loch Ness Memories", 49.95, 1,
                "Fred MacMurrey", "Penquin Press", "Fiction");
        myInventory[2] = new Book("MVS JCL", 89.95, 3,
                "Steve Balmer", "Microsoft Press", "Non Fiction");
        myInventory[3] = new Book("Lingo in a Nutshell", 19.95, 8,
                "Bill Bates", "O'Reilly", "Non Fiction");
        myInventory[4] = new Book("Grid Computing", 79.95, 2,
                "Bobby Beowold", "Trouser Press", "Non Fiction");
        myInventory[5] = new CD("Going for the one", 12.95, 4,
                new Artist("YES"), new Date("07/07/1977"));

    }
}
