package com.acme;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Simpsons {
    private static final Person HOMER = new Person("Homer", "Simpson");
    private static final Person MARGE = new Person("Majorie", "Simpson");
    private static final Person BART = new Person("Bartholomew", "Simpson");
    private static final Person LISA = new Person("Elisabeth Marie", "Simpson");
    private static final Person MAGGIE = new Person("Margaret Eve", "Simpson");
    public static final List<Person> FAMILY = new ArrayList<Person>() {{
        add(HOMER);
        add(MARGE);
        add(BART);
        add(LISA);
        add(MAGGIE);
    }};

    public static Person homer() {
        return HOMER;
    }

    public static Person marge() {
        return MARGE;
    }

    public static Person bart() {
        return BART;
    }

    public static Person lisa() {
        return LISA;
    }

    public static Person maggie() {
        return MAGGIE;
    }

    public static void dummy() {
        // just to test that 'main' dependencies with 'api' scope are available here
        StringUtils.abbreviate("aaa", 12);
    }

}
