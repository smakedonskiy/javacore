package com.kit.center.runners.homework.lesson_1to10.lesson5;


import com.kit.center.app.homework.lesson_1to10.lesson5.DifferentExamples;
import com.kit.center.app.homework.service.AHomework;

public class HW5Controller extends AHomework {

    DifferentExamples dif = new DifferentExamples();

    {
        super.name += "5. ";
        super.description += "\"Unit testing\".";
    }

    @Override
    public void run(){
        super.run();
        dif.run();
    }
}
