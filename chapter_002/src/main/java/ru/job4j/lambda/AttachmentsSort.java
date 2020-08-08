package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentsSort {
    public static void main(String[] args) {
        List<Attachments> attachments = Arrays.asList(
                new Attachments("image 1", 100),
                new Attachments("image 2", 34),
                new Attachments("image 3", 13)
        );
        Comparator comparator =  new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachments left = (Attachments) o1;
                Attachments right = (Attachments) o2;
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);
       Comparator<Attachments> res = new Comparator<Attachments>() {
           @Override
           public int compare(Attachments o1, Attachments o2) {
               return o2.getSize() - o1.getSize();
           }
       };
        attachments.sort(res);
        System.out.println(attachments);
    }
}