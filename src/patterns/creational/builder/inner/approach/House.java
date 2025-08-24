package patterns.creational.builder.inner.approach;

public class House {

    private final String walls;
    private final String doors;
    private final String windows;
    private final String garden;
    private final String swimmingPool;

    private House(HouseBuilder builder) {
        this.walls = builder.walls;
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.garden = builder.garden;
        this.swimmingPool = builder.swimmingPool;
    }

    public String getWalls() {
        return walls;
    }

    public String getDoors() {
        return doors;
    }

    public String getWindows() {
        return windows;
    }

    public String getGarden() {
        return garden;
    }

    public String getSwimmingPool() {
        return swimmingPool;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("House{");
        if (walls != null && !walls.isEmpty()) sb.append("walls='").append(walls).append('\'');
        if (doors != null && !doors.isEmpty()) sb.append(", doors='").append(doors).append('\'');
        if (windows != null && !windows.isEmpty()) sb.append(", windows='").append(windows).append('\'');
        if (garden != null && !garden.isEmpty()) sb.append(", garden='").append(garden).append('\'');
        if (swimmingPool != null && !swimmingPool.isEmpty())
            sb.append(", swimmingPool='").append(swimmingPool).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class HouseBuilder {

        private String walls;
        private String doors;
        private String windows;
        private String garden;
        private String swimmingPool;

        public HouseBuilder walls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder doors(String doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder windows(String windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder garden(String garden) {
            this.garden = garden;
            return this;
        }

        public HouseBuilder swimmingPool(String swimmingPool) {
            this.swimmingPool = swimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

}
