public class GameObjects {
    public static class Grid{
        public static final int GRID_WIDTH = 640;
        public static final int GRID_HEIGHT = 480;
        public static final int GRID_CELL = 20;

        int rows = GRID_WIDTH / GRID_CELL;
        int columns = GRID_HEIGHT / GRID_CELL;

        int[][] grid = new int[rows][columns];
    }
}
