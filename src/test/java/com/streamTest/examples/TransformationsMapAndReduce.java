package com.streamTest.examples;

import com.streamTest.beans.Car;
import com.streamTest.beans.Person;
import com.streamTest.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class TransformationsMapAndReduce {

    @Test
    void yourFirstTransformationWithMap() throws IOException {
        List<Person> people = MockData.getPeople();
    }

    @Test
    void mapToDoubleAndFindAverageCarPrice() throws IOException {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void reduce() {
        int[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
    }
}

