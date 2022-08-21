package lang.print.gaps.task5;

import java.sql.SQLOutput;

public class TimeConvertor {
    public void convert(float minutes) {

        float seconds = 60.0F;
        float formula = minutes * seconds;
        System.out.println(formula);
    }
}