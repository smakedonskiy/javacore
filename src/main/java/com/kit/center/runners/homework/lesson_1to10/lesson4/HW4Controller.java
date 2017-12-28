package com.kit.center.runners.homework.lesson_1to10.lesson4;

import com.kit.center.app.homework.lesson_1to10.lesson4.PrimitiveConverter;
import com.kit.center.app.homework.service.AHomework;

public class HW4Controller extends AHomework {
    PrimitiveConverter converter = new PrimitiveConverter();

    {
        super.name += "4. ";
        super.description += "\"Class, Method\".";
    }


    @Override
    public void run(){
        super.run();
        converter.run();
    }



}
