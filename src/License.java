public class License {
        static private int uniqueId;
        private Car licenseHolder;
        private int id;
        private int validGarageId;

        public License(Car licenseHolder, int validGarageId) {
            this.id = ++uniqueId;
            this.licenseHolder = licenseHolder;
            this.validGarageId = validGarageId;
        }

        public String getLicenseHolderPlate() {
            return licenseHolder.getLicensePlate();
        }

        public int getValidInGarageId() {
            return validGarageId;
        }
    }
