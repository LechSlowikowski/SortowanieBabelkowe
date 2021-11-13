package com.company;

import java.util.Arrays;

public class SortowanieBabelkowe {
    public static final int ILE_ELEMENTOW = 10;
    public int[] tablica = new int[ILE_ELEMENTOW];

    public SortowanieBabelkowe(int[] tablica) {
        this.tablica = tablica;
    }

    private void zamien(int i, int j){
        int temp = this.tablica[i];
        this.tablica[i] = this.tablica[j];
        this.tablica[j] = temp;
    }

    public void przebiegRosnaco(int indeksKonca){
        for (int i = 0; i <indeksKonca ; i++) {
            if(tablica[i]>tablica[i+1]){
                zamien(i, i+1);
            }
        }
    }

    public void sortujRosnaco(){
        for (int i = ILE_ELEMENTOW-1; i > 0 ; i--) {
            przebiegRosnaco(i);
        }
    }

    @Override
    public String toString() {
        return "Wynik sortowania: " +
                "tablica=" + Arrays.toString(tablica);
    }
}
