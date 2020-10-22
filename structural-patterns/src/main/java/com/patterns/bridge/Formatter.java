package com.patterns.bridge;

import java.util.List;

interface Formatter {
    String format(String header, List<Detail> details);
}
