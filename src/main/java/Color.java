public enum Color {
    NO_COLOR("no color"), YELLOW("yellow"), RED("red"), BLUE("blue");

    private final String colorName;

    Color(String name) {
        this.colorName = name;
    }

    @Override
    public String toString() {
        return colorName;
    }
}