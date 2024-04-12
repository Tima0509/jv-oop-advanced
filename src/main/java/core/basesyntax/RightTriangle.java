package core.basesyntax;

    class RightTriangle implements Figure {
        private final double firstLeg;
        private final double secondLeg;
        private final String color;

        public RightTriangle(double firstLeg, double secondLeg, String color) {
            this.firstLeg = firstLeg;
            this.secondLeg = secondLeg;
            this.color = color;
        }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + color);
    }
}
