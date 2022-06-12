package es.mpastor.petancaapp.model.dto;

public class SplitShift {

    private int id;

    private int num;

    public SplitShift(int id, int num) {
        this.id = id;
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public int getNum() {
        return num;
    }
}
