package foo.zongzhe.junjun.sort;

public class Product implements Comparable {
    private Integer gtnr; // 变速箱编号
    private String stk; // 系列编号
    private Integer eol; // 测试平台
    private String datum; // 日期
    private Integer id; // ID号码
    private SortKey sortKey;

    public Product(int gtnr, String stk, int eol, String datum, int id) {
        this.gtnr = gtnr;
        this.stk = stk;
        this.eol = eol;
        this.datum = datum;
        this.id = id;
    }

    public int getGtnr() {
        return gtnr;
    }

    public void setGtnr(int gtnr) {
        this.gtnr = gtnr;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public int getEol() {
        return eol;
    }

    public void setEol(int eol) {
        this.eol = eol;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SortKey getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKey sortKey) {
        this.sortKey = sortKey;
    }

    /**
     * 用于排序比较，为核心方法
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        // 假定给的都是Product
        Product otherProduct = (Product) o;
        switch (sortKey) {
            case GTNR:
                return this.gtnr.compareTo(otherProduct.gtnr);
            case STK:
                return this.stk.compareTo(otherProduct.stk);
            case EOL:
                return this.eol.compareTo(otherProduct.eol);
            case DATUM:
                return this.datum.compareTo(otherProduct.datum);
            case ID:
                return this.id.compareTo(otherProduct.id);
            default:
                System.out.println("Unkown sort key!");
                return 0;
        }
    }

    @Override
    public String toString() {
        return gtnr + "\t" + stk + "\t" + eol + "\t" + datum + "\t" + id;
    }
}
