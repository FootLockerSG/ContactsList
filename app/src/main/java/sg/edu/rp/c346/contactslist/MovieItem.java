package sg.edu.rp.c346.contactslist;


public class MovieItem {

    private String name;
    private String plusnum;
    private int num;

    public MovieItem(String name, String plusnum, int num) {
        this.name = name;
        this.plusnum = plusnum;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlusnum() {
        return plusnum;
    }

    public void setPlusnum(String plusnum) {
        this.plusnum = plusnum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "name='" + name + '\'' +
                ", plusnum='" + plusnum + '\'' +
                ", num=" + num +
                '}';
    }
}

