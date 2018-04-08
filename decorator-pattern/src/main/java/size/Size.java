package size;

/**
 * @author chzhyu at 18-4-6 下午8:05
 */
public enum Size {
    TALL("tall cup",500),GRANDE("grande size",750),VENTI("venti cup",1000);
    private String description;
    private double capcity;

    Size(String description, double capcity) {
        this.description = description;
        this.capcity = capcity;
    }
}
