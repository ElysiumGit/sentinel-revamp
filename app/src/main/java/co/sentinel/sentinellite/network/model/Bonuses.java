package co.sentinel.sentinellite.network.model;

public class Bonuses {
    public long snc;
    public long slc;
    public long ref;

    public long getTotalTokens() {
        return snc + slc + ref;
    }
}
