package com.sda.exercises;

import java.util.List;

class BinarySearch {

    int search(
            List<Integer> array,
            int left,
            int right,
            int searched
    ) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (array.get(mid) == searched)
                return mid;
            if (array.get(mid) > searched)
                return search(array, left, mid - 1, searched);
            return search(array, mid + 1, right, searched);
        }
        return -1;
    }
}
