package day51_Map;

import java.util.*;

public class MapIntro {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Isabella");
        hashMap.put(null, null);

        System.out.println("hashMap = " + hashMap);

        Map<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, null);

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5, "Isabella");
        treeMap.put(10, null);

        System.out.println("treeMap = " + treeMap);
        
        Map<Integer,String> hashTable=new Hashtable<>();
        hashTable.put(10, "Arthur");
        hashTable.put(20, "George");
        hashTable.put(3, "Jack");
        hashTable.put(40, "Emma");
        hashTable.put(5, "Ahmet");
        hashTable.put(5, "Isabella");
        //hashTable.put(10, null);

        System.out.println("hashTable = " + hashTable);

    }
}
