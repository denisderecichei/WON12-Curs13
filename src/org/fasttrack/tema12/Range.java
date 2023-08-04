package org.fasttrack.tema12;

public class Range {
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public boolean isValueInRange(int value) {
        return value >= start && value <= end;
    }

    public String toString() {
        return start + "|" + end;
    }
}
