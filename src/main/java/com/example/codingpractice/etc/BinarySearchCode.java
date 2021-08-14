package com.example.codingpractice.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearchCode {

    public BinarySearchCode() {

    }

    public void BinarySearch() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = null;

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine().trim());

        int[] A = new int[N];
        for( int i = 0 ; i < N ; i++) {
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(A);

        int M = Integer.parseInt(bufferedReader.readLine().trim());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine().trim());

        for( int i = 0 ; i < M ; i++) {
            int n = Integer.parseInt(stringTokenizer.nextToken());
            System.out.print(binarySearch(A, n));
        }
    }

    public int binarySearch(int[] a, int n) {
        int fi = 0;
        int last = a.length - 1;
        int mid = 0;

        while(fi <= last) {

            mid = (fi + last) / 2;

            if(n==a[mid])
                return mid;
            else {
                if(n < a[mid])
                    last = mid - 1;
                else
                    fi = mid + 1;
            }

        }
        return 0;
    }
}
