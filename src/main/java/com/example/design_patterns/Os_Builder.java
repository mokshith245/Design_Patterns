package com.example.design_patterns;

public class Os_Builder
{
    public Os getInstance(String str)
    {
        if(str.equals("cheap"))
            return new Android();
        else if (str.equals("costly"))
            return new Ios();
        else
            return new Windows();
    }

}
