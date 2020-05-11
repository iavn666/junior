package ru.job4j.lambda;



import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list) {

        Predicate<Attachment> res = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment attachment) {
                for (Attachment att : list) {
                    if (att.getSize() > 100) {
                        list.add(attachment);
                    }
                }
                return true;
            }
        };
      return list;
    }
}