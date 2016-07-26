package com.mahady.refactoring;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Created by Mahady Hasan on 24/07/16.
 */
public class CollectionToStreamTest {

    public static void main(String[] args) {
//        //start with a collection of Integer instances
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
//
//        List<Point> pointList = new ArrayList<>();
//
//        //transformation to produce a collection of Point Instances
//        for (Integer i : intList) {
//            pointList.add(new Point(i % 3, i / 1));
//        }
//
//        //find the maximum among the distances of each Point
//        double maxDistance = Double.MIN_VALUE;
//        for (Point p : pointList) {
//            maxDistance = Math.max(p.distance(0, 0), maxDistance);
//        }

        //Java 8 Refactor
        OptionalDouble maxDistance =
                intList.stream()
                        .map(i -> new Point(i % 3, i / 3))
                        .mapToDouble(p -> p.distance(0, 0))
                        .max();

    }
}
