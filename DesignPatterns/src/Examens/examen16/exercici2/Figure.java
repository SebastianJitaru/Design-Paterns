package Examens.examen16.exercici2;
public abstract class Figure {
    private final double x;
    private final double y;
    public Figure(double x, double y) {
        this.x = x; this.y = y;
    }
    public static class FigureBuilder {
        private double x, y, width, height, radius;
        private boolean hasAt = false;
        private boolean hasDimensions = false;
        private boolean hasRadius = false;
        public FigureBuilder at(double x, double y) {
            if (!hasAt) {
                this.x = x; this.y = y; hasAt = true;
            }
            return this;
        }
        public FigureBuilder withDimensions(double w, double h) {
            if (hasRadius) throw new IllegalStateException();
            this.width = w; this.height = h; hasDimensions = true;
            return this;
        }
        public FigureBuilder withRadius(double r) {
            if (hasDimensions) throw new IllegalStateException();
            this.radius = r; hasRadius = true;
            return this;
        }
        public Figure execute() {
            if (hasAt && hasDimensions) {
                return new Rectangle(x, y, width, height);
            } else if (hasAt && hasRadius) {
                return new Circle(x, y, radius);
            } else {
                throw new IllegalStateException();
            }
        }
    }
    public static FigureBuilder create() {
        return new FigureBuilder();
    }
}