package productv4;

public class TV {

    public class TV extends Product {

        private double screenSize;
        private String manufacturer;

        public TV() {
            super();
            screenSize = 0;
            manufacturer = "";
        }

        public double getScreenSize() { return screenSize; }

        public void setScreenSize(double screenSize) { this.screenSize = screenSize; }

        public String getManufacturer() { return manufacturer; }

        public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

        @Override
        public String toString() {
            return super.toString() +
                    "\nScreen Size:     " + screenSize +
                    "\nManufacturer:    " + manufacturer;
        }
    }
}
