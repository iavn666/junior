package ru.job4j.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class SearchAtt {


    public static List<Attachment> filter(Predicate<Attachment> num, List<Attachment> list) {
        List<Attachment> result = new ArrayList<>();
        for (Attachment att : list) {
            if (num.test(att)) {
                result.add(att);

            }
        }
        return result;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> num = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                boolean res = false;
                if (attachment.getSize() > 100) {
                    res = true;
                }
                return res;
            }
        };
        return filter(num, list);

    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> num = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                boolean res = false;
                if (attachment.getName().contains("bug")) {
                    res = true;
                }
                return res;
            }
        };
        return filter(num, list);
    }


}