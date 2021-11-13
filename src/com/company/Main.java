package com.company;

import java.util.Scanner;

public class Main {
    public static final int ILE_ELEMENTOW = 10;
    private static int[] tablica = new int[ILE_ELEMENTOW];

    public static void wczytajTablice(){
        Scanner daneWejściowe = new Scanner(System.in);
        for (int i = 0; i <ILE_ELEMENTOW ; i++) {
            System.out.print("Podaj " + (i+1) + " element tablicy: ");
            tablica[i] = daneWejściowe.nextInt();
        }
    }

    public static void main(String[] args) {
        wczytajTablice();
        SortowanieBabelkowe sortowanieBabelkowe = new SortowanieBabelkowe(tablica);
        sortowanieBabelkowe.sortujRosnaco();
        System.out.println(sortowanieBabelkowe.toString());
    }
}
