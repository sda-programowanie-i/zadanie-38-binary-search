package com.sda.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void searchPresentNumberTest() {
        //given
        BinarySearch binarySearch = new BinarySearch();
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int searched = 5;
        //when
        int actual = binarySearch.search(array, 0, array.size() - 1, searched);
        int expected = 4;
        //then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void searchNotPresentNumberTest() {
        //given
        BinarySearch binarySearch = new BinarySearch();
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int searched = 7;
        //when
        int actual = binarySearch.search(array, 0, array.size() - 1, searched);
        int expected = -1;
        //then
        Assert.assertEquals(actual, expected);
    }
}
