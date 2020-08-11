package ru.job4j.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class SearchAtt {

    public static List<Attachment> filter(Predicate<Attachment> num) {
        List<Attachment> res = new ArrayList<>();
        filterSize(res);
        filterName(res);
        return res;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        List<Attachment> resultSize = new ArrayList<>();
        Predicate<Attachment> num = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                for (Attachment att : list) {
                    if (att.getSize() > 100) {
                        resultSize.add(att);
                        return true;
                    }
                }
                return false;
            }
        };
        return filter(num);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        List<Attachment> resultName = new ArrayList<>();
        Predicate<Attachment> num = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                for (Attachment att : list) {
                    if (att.getName().contains("bug")) {
                        resultName.add(att);
                        return true;
                    }
                }
                return false;
            }
        };
        return filter(num);
    }



}